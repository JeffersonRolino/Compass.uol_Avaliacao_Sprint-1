package pergunta7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.HashMap;

// Classe responsável por gerar a tela de login futuramente...
public class LoginTela implements ActionListener {

    private HashMap<String, String> registros;

    // Criando Frame e Componentes
    JFrame tela = new JFrame();
    JButton buttonLogin = new JButton("Login");
    JButton buttonLimpar = new JButton("Limpar");
    JTextField usuarioLoginCampo = new JTextField();
    JPasswordField usuarioSenhaCampo = new JPasswordField();

    // Criando Rótulos (Labels)
    JLabel telaTitulo = new JLabel("Login");
    JLabel usuarioLoginLabel = new JLabel("Usuario");
    JLabel usuarioSenhaLabel = new JLabel("Senha");
    JLabel mensagemLabel = new JLabel();

    public LoginTela(HashMap<String, String> _registros){

        this.registros = _registros;

        telaTitulo.setBounds(0,0,340,100);
        telaTitulo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
        telaTitulo.setHorizontalAlignment(JTextField.CENTER);

        usuarioLoginLabel.setBounds(30,100,75,25);
        usuarioSenhaLabel.setBounds(30,150,75,25);

        mensagemLabel.setBounds(30,250,250,35);
        mensagemLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        mensagemLabel.setHorizontalAlignment(JTextField.CENTER);

        usuarioLoginCampo.setBounds(80,100,200,25);
        usuarioSenhaCampo.setBounds(80,150,200,25);

        buttonLimpar.setBounds(90,200,80,25);
        buttonLimpar.setFocusable(false);
        buttonLimpar.addActionListener(this);

        buttonLogin.setBounds(180,200,80,25);
        buttonLogin.setFocusable(false);
        buttonLogin.addActionListener(this);

        //Adicionando Componentes na Tela...
        tela.add(telaTitulo);

        tela.add(usuarioLoginCampo);
        tela.add(usuarioSenhaCampo);
        tela.add(usuarioLoginLabel);
        tela.add(usuarioSenhaLabel);

        tela.add(buttonLogin);
        tela.add(buttonLimpar);

        tela.add(mensagemLabel);

        // Configurando Tela...
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(400,600);
        tela.setLayout(null);
        tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonLogin){
            String login = usuarioLoginCampo.getText();
            String senha = String.valueOf(usuarioSenhaCampo.getPassword());

            Calendar calendar = Calendar.getInstance();
            int hora = calendar.get(Calendar.HOUR_OF_DAY);

            if(this.registros.containsKey(login)){
                if(this.registros.get(login).equals(senha)){
                   tela.dispose();
                   BoasVindasTela boasVindasTela = new BoasVindasTela(login, hora);
                }
                else {
                    mensagemLabel.setForeground(Color.red);
                    mensagemLabel.setText("Senha Incorreta!");
                }
            }
            else {
                mensagemLabel.setForeground(Color.red);
                mensagemLabel.setText("Usuario Incorreto!");
            }

        }

        if(e.getSource() == buttonLimpar){
            usuarioLoginCampo.setText("");
            usuarioSenhaCampo.setText("");
        }
    }

}
