package pergunta6;

public class Jogador {
    private String nome;
    private static int pontuacaoTotal;

    public Jogador(String _nome){
        this.nome = _nome;
    }

    public String getNome() {
        return this.nome;
    }
}
