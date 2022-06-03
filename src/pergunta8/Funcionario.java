package pergunta8;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private double salarioBase;
    private double modificadorDeSalario;
    private double salarioLiquido;

    // Overloading o Construtor Base
    public Funcionario(String _nome, String _sobrenome, double _salarioBase){
        this.nome = _nome;
        this.sobrenome = _sobrenome;
        this.salarioBase = _salarioBase;
        calcularSalarioFinal();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String _sobrenome){
        this.sobrenome = _sobrenome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double _salarioBase) {
        this.salarioBase = _salarioBase;
    }

    public double getModificadorDeSalario() {
        return this.modificadorDeSalario;
    }

    public void setModificadorDeSalario(double _modificadorDeSalario) {
        this.modificadorDeSalario = _modificadorDeSalario;
    }

    public double getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public void setSalarioLiquido(double _salarioLiquido) {
        this.salarioLiquido = _salarioLiquido;
    }

    private void calcularSalarioFinal(){
        if(this.salarioBase <= 1000){
            this.modificadorDeSalario = (this.salarioBase / 100 * 20);
        } else if(this.salarioBase > 1000 && this.salarioBase <= 2000){
            this.modificadorDeSalario = (this.salarioBase / 100 * 10);
        } else {
            this.modificadorDeSalario = ((this.salarioBase / 100 * 10) * -1);
        }
        this.salarioLiquido = this.salarioBase + this.modificadorDeSalario;
    }

}
