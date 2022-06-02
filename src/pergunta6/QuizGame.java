package pergunta6;

import java.util.Scanner;

public class QuizGame {
    private int numeroDeQuestoes;
    private Questao[] questoes;
    private int acertos;
    private int erros;
    private int contador;
    private Scanner sc;
    private Jogador jogador;
    private boolean jogoRodando;

    public QuizGame(){
        this.acertos = 0;
        this.erros = 0;
        init();
        update();
    }

    // Função responsável por iniciar o Game e configurar variáveis
    public void init(){
        this.jogoRodando = true;
        this.contador = 0;
        this.acertos = 0;
        this.erros = 0;

        this.sc = new Scanner(System.in);
        System.out.println("Por favor insira seu nome: ");
        String nomeJogador = digiteSeuNome();

        this.jogador = new Jogador(nomeJogador);


        Questao pergunta1 = new Questao("Qual empresa criou a linguagem Java?", "\t1 - Microsoft", "\t2 - Sun Microsystems", "\t3 - Oracle", 2);
        Questao pergunta2 = new Questao("Quem foi o criador da linguagem Java?", "\t1 - Steve Jobs", "\t2 - Bill Gates", "\t3 - James Gosling", 3);
        Questao pergunta3 = new Questao("Qual foi o primeiro nome da linguagem Java?", "\t1 - Oak", "\t2 - Coffee", "\t3 - Latte", 1);
        Questao pergunta4 = new Questao("Em que ano a linguagem Java foi criada?", "\t1 - 1987", "\t2 - 1992", "\t3 - 1995", 3);
        Questao pergunta5 = new Questao("Qual era o nome do projeto que deu origem ao Java?", "\t1 - Oak Project", "\t2 - Green Project", "\t3 - Coffee Project", 2);
        this.questoes = new Questao[]{pergunta1, pergunta2, pergunta3, pergunta4, pergunta5};

    }

    // Função responsável por manter o Loop do jodo rodando...
    public void update(){
        while (jogoRodando)
        {
            if(this.contador < this.questoes.length){
                questionar(questoes[this.contador]);
                this.contador++;
            } else {
                System.out.println("--------------------------------------------");
                System.out.print("Fim de jogo, " + this.jogador.getNome() + ".");
                System.out.println(" Seu desempenho final foi: ");
                System.out.println("\tAcertos: " + this.acertos);
                System.out.println("\tErros: " + this.erros);
                jogoRodando = false;
            }
        }
    }

    public void questionar(Questao questaoAtual){
        System.out.print("\n");
        System.out.print("--------------------------------------------------------");
        System.out.printf("\nPergunta %s - ", this.contador + 1);
        questaoAtual.display();
        if(sc.hasNextInt()){
            int escolha = sc.nextInt();
            System.out.print("\n");
            if(escolha == questaoAtual.getOpcaoCorreta()){
                System.out.println("\tCorreto! - A escolha correta realmente era: " + questaoAtual.getOpcaoCorreta());
                this.acertos++;
//                System.out.println("Desempenho atual: \tAcertos: " + this.acertos + "\tErros: " + this.erros);
                System.out.print("\n");
            } else {
                System.out.println("\tErrado! - A escolha correta era: " + questaoAtual.getOpcaoCorreta());
                this.erros++;
//                System.out.println("Desempenho atual: \tAcertos: " + this.acertos + "\tErros: " + this.erros);
                System.out.print("\n");
//                System.out.print("\n");
            }
        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Entrada invalida...");
            System.out.println("Por favor insira um numero correspondente a uma opcao");
            System.out.println("-------------------------------------------------------");
            sc.nextLine();
            questionar(questaoAtual);
        }
    }

    public void proximaPergunta(){
        if(contador < questoes.length - 1){
            questionar(this.questoes[this.contador + 1]);
        }
    }

    public String digiteSeuNome(){
        if(sc.hasNext()){
            return sc.nextLine();
        }
        else {
            System.out.println("Nome inválido, por favor digite novamente");
            sc.nextLine();
            digiteSeuNome();
        }
        return null;
    }


}
