
package botao;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Botao extends JFrame{
 private JButton ok;
 
 public Botao(){
  super("Criando botões");
  setLayout( new FlowLayout() );

  ok = new JButton("INICIAR");
  add(ok);
 }

}
