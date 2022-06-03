package pergunta7;

import java.util.Objects;
import java.util.Scanner;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String _login, String _senha){
        this.login = _login;
        this.senha = _senha;
    }

    public boolean login(){
        System.out.println("--------------------------------------");
        System.out.println("LOGIN");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu login...");
        String login = scanner.nextLine();
        System.out.println("Por favor, digite sua senha...");
        String pin = scanner.nextLine();

        return Objects.equals(login, this.login) && Objects.equals(pin, this.senha);
    }



}
