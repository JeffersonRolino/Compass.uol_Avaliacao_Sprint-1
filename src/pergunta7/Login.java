package pergunta7;

import java.util.HashMap;

public class Login {
    HashMap<String, String> registros_Login_e_Senha = new HashMap<String, String>();

    protected HashMap<String, String> getRegistros_Login_e_Senha(){
        return this.registros_Login_e_Senha;
    }

    public void cadastrar_Usuario_e_Senha(String _usuario, String _senha){
        this.registros_Login_e_Senha.put(_usuario, _senha);
    }
}
