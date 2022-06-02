package pergunta6;

public class Questao {
    private String pergunta;
    private String[] opcoes;
    private int opcaoCorreta;

    public Questao(String _pergunta, String _opcao1, String _opcao2, String _opcao3, int _opcaoCorreta){
        this.pergunta = _pergunta;
        this.opcoes = new String[]{_opcao1, _opcao2, _opcao3};
        this.opcaoCorreta = _opcaoCorreta;
    }

    public void display(){
        System.out.println(this.pergunta);
        System.out.print("--------------------------------------------------------\n");

        for (String o : this.opcoes) {
            System.out.println(o);
        }
        System.out.print("\nDigite sua escolha: ");
    }

    public int getOpcaoCorreta(){
        return this.opcaoCorreta;
    }

    public String[] getOpcoes(){
        return this.opcoes;
    }

    public void adicionarOpcao(int index, String resposta){
        this.opcoes[index] = resposta;
    }
}
