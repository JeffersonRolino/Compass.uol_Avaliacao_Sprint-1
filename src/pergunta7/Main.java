package pergunta7;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.cadastrar_Usuario_e_Senha("admin", "123");

        // Instancia nova Tela de Login
        LoginTela loginTela = new LoginTela(login.getRegistros_Login_e_Senha());
    }
}
