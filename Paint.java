// pacote criado com nome Pong// 
package Pong;
//importando classe Frame de interface//
// '' '' color de para colocar as cores//
// '' '' graphics2D para colcoar a bolinha grafica no campo//
// '' '' graphics para aparecer a bolinha simples//
// '' '' Panel para dimensionar e colorir o campo//
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/* essa classe serve para suportar o JFrame (interface) e dentro da classe tem uma janela onde está descrito
o tamnho, cor, e titulo da janela (painel onde acontecerá o jogo, podemos chamar também de campo)*/
// extends= extender/ extensão///

public class Paint extends JFrame{
    Grafico gr; // criando objeto 
    class Grafico extends JPanel{
        //METODO//
        @Override //para tirar o alerta quee subesceveu o metodo
        public void paintComponent(Graphics g){ // criamos um metodo que recebe argumeentos graficos dde nomee g do tipo painComponent//
        super.paintComponent(g);//chamdno o metodo paintcomponent
        setBackground(Color.black); //para colocar cor
        Graphics2D bola= (Graphics2D) g;
        
        }
    } 
    //METODO//

    public void Janela (){
        setTitle("PING PONG ");// titulo da janelo (creio que seja o titulo do jogo)
        setSize(800,600);// tamanho ddo campo//
        setLocationRelativeTo(null);// posicionamento do campo///
        setResizable(true);// possibilita maximizar o campo//
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// chamando o Jframe// 
        setVisible(true);// colocanddo o campo natela//
        gr= new Grafico();// estanciando o gr para aparecer no campo 
        add (gr);// chamando/ adicionando o gr no campo
       
        
    }

    /*precisamos agora criar os objetos (janeela, bbola, jogadores e afins)*/
    public static void main(String[] args) {
        Paint paint = new Paint();
        
        
        /* Nome da classe onde o objeto vai ta noem do objeto
        = new nome da classe novamente*/
        paint.Janela();
        //chama  o metodo 
        
    }
}