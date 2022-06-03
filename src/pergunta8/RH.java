package pergunta8;

import java.util.Scanner;

public class RH {
    private Funcionario[] funcionarios;

    public Funcionario[] getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(Funcionario[] _funcionarios) {
        this.funcionarios = _funcionarios;
    }

    public void castrarFuncionarios(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro de Funcionario");
        System.out.println("Informe a quantidade de funcionarios que deseja cadastrar...");

        int Quantidade_de_funcionarios = scanner.nextInt();

        Funcionario[] colaboradores = new Funcionario[Quantidade_de_funcionarios];

        for(int f = 0; f < Quantidade_de_funcionarios; f++){
            System.out.println("---------------------------------------------------");
            System.out.println("Cadastrando funcionario " + (f + 1));
            System.out.println("Por favor, informe o Primeiro Nome do Funcionario:");
            String nome = scanner.next();
            System.out.println("Por favor, informe o Sobrenome do Funcionario:");
            String sobrenome = scanner.next();
            System.out.println("Por favor, informe o Salario Base do Funcionario:");
            double salarioBase = scanner.nextDouble();
            colaboradores[f] = new Funcionario(nome, sobrenome, salarioBase);
        }

        setFuncionarios(colaboradores);
    }

    public void imprimirRelatorio(){
        System.out.print("\n");
        System.out.println("---------------------------------------");
        System.out.println("\tRelatorio de Funcionarios");
        System.out.println("---------------------------------------");
        for(Funcionario f : this.funcionarios)
        {
            System.out.printf("Funcionario: %s %s.\n", f.getNome(), f.getSobrenome());
            System.out.printf("Salario: R$%.2f\n", f.getSalarioBase());
            if(f.getModificadorDeSalario() > 0)
            {
                System.out.printf("Bonus: R$%.2f\n", f.getModificadorDeSalario());
            } else {
                System.out.printf("Desconto: R$%.2f\n", f.getModificadorDeSalario() * -1);
            }
            System.out.println("Salario Liquido: " + f.getSalarioLiquido());
            System.out.println("---------------------------------------");
        }
    }
}
