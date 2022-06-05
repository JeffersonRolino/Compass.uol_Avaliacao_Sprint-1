package pergunta7;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Jefferson Rolino da Silva
 * Classe responsável por gerar a tela de login futuramente...
 */

public class LoginTela {
    private String login;
    private String senha;

    public LoginTela(){

    }

    public void render(){
        System.out.println("--------------------------------------");
        System.out.println("LOGIN");
        System.out.println("--------------------------------------");
    }

    public String entradaLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu login...");
        this.login = scanner.nextLine();
        return this.login;
    }

    public String entradaSenha(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite sua senha...");
        this.senha = scanner.nextLine();
        return this.senha;
    }
}
