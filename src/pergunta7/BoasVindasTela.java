package pergunta7;

import javax.swing.*;
import java.awt.*;

public class BoasVindasTela {
    JFrame tela = new JFrame();
    JLabel mensagemBoasVindas = new JLabel();

    public BoasVindasTela(String usuario, int hora){

        mensagemBoasVindas.setBounds(0,0,600,100);
        mensagemBoasVindas.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        mensagemBoasVindas.setHorizontalAlignment(JTextField.CENTER);

        if(hora >= 6 && hora < 12){
            mensagemBoasVindas.setText("Bom dia, voce se logou ao nosso sistema.");
        } else if(hora >= 12 && hora < 18){
            mensagemBoasVindas.setText("Boa tarde, voce se logou ao nosso sistema.");
        } else if(hora >= 18 && hora < 24){
            mensagemBoasVindas.setText("Boa noite, voce se logou ao nosso sistema.");
        } else {
            mensagemBoasVindas.setText("Boa madrugada, voce se logou ao nosso sistema.");
        }

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(600,600);
        tela.setLayout(null);
        tela.setVisible(true);

        tela.add(mensagemBoasVindas);
    }
}
