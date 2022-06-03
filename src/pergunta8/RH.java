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

            System.out.println("Por favor, informe o Primeiro Nome do Funcionario:");
            String nome = scanner.next();
            System.out.println("Por favor, informe o Sobrenome do Funcionario:");
            String sobrenome = scanner.next();
            System.out.println("Por favor, informe o Salario Base do Funcionario:");
            double salarioBase = scanner.nextDouble();
            colaboradores[f] = new Funcionario(nome, sobrenome, salarioBase);
//            Funcionario funcionario = new Funcionario(nome, sobrenome, salarioBase);
//            System.out.println("Funcionario: " + nome + " " + sobrenome + " com salario " + salarioBase + " cadastrado com sucesso!");
        }

        setFuncionarios(colaboradores);
    }

    public void imprimirRelatorio(){
        System.out.println("Relatorio de Funcionarios");
        for(Funcionario f : this.funcionarios)
        {
            System.out.printf("Funcionario: %s %s com salario de R$%.2f\n", f.getNome(), f.getSobrenome(), f.getSalarioBase());
        }
    }

//    public double validarEntradaDeSalario(Scanner sc){
//        if(sc.hasNextDouble()){
//            return sc.nextDouble();
//        } else {
//            System.out.println("Valor Invalido, por favor informe um numero...");
//            validarEntradaDeSalario(sc);
//        }
//        return 0;
//    }
}
