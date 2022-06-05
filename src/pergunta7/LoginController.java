package pergunta7;

import java.util.Calendar;
import java.util.HashMap;

public class LoginController {

    public LoginController(HashMap<String, String> _registros_Login_e_Senha){

        // Puxando hora e minuto do sistema...
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minutos = c.get(Calendar.MINUTE);

        // Instancia nova Tela de Login
        LoginTela loginTela = new LoginTela();

        // Renderiza Título
        loginTela.render();

        // Solicita login do Usuário
        String login = loginTela.entradaLogin();

        // Solicita senha do Usuário
        String senha = loginTela.entradaSenha();

        if(_registros_Login_e_Senha.containsKey(login)){
            if(_registros_Login_e_Senha.get(login).equals(senha)){
                if(hora >= 6 && hora < 12){
                    System.out.println("\nBom dia, voce se logou ao nosso sistema.");
                } else if(hora >= 12 && hora < 18){
                    System.out.println("\nBoa tarde, voce se logou ao nosso sistema.");
                } else if(hora >= 18 && hora < 24){
                    System.out.println("\nBoa noite, voce se logou ao nosso sistema.");
                } else {
                    System.out.println("\nBoa madrugada, voce se logou ao nosso sistema.");
                }
            }
            else {
                System.out.println("Senha Incorreta!");
            }
        }
        else {
            System.out.println("Usuario Incorreto!");
        }
    }

}
