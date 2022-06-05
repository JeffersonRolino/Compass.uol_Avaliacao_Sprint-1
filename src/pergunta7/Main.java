package pergunta7;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.cadastrar_Usuario_e_Senha("admin", "123");

        LoginController sistemaDeLogin = new LoginController(login.registros_Login_e_Senha);

    }
}
