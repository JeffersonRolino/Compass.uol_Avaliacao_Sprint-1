package pergunta7;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minutos = c.get(Calendar.MINUTE);

        Usuario usuario1 = new Usuario("admin", "1234");

        if(usuario1.login()){
            if(hora >= 6 && hora < 12){
                System.out.println("\nBom dia, voce se logou ao nosso sistema.");
            } else if(hora >= 12 && hora < 18){
                System.out.println("\nBoa tarde, voce se logou ao nosso sistema.");
            } else if(hora >= 18 && hora < 24){
                System.out.println("\nBoa noite, voce se logou ao nosso sistema.");
            } else {
                System.out.println("\nBoa madrugada, voce se logou ao nosso sistema.");
            }
        } else {
            System.out.println("Usuario e/ou senha incorretos!");
        }
    }
}
