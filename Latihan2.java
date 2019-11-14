
package latihan2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

public class Latihan2 extends JFrame{

    public Latihan2(){
        FlowLayout latihan2 = new FlowLayout(FlowLayout.CENTER, 5,10);
        Container container = getContentPane();
        container.setLayout(latihan2);
        
        container.add(new JButton("Tombol 1"));
        container.add(new JButton("Tombol 2"));
        container.add(new JButton("Tombol 3"));
        container.add(new JButton("Tombol 4"));
        container.add(new JButton("Tombol 5"));
    }
   public static void main(String[] args){
       Latihan2 jendela =  new Latihan2();
       jendela.setTitle("Kelas DemoFlowLAyout");
       jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jendela.setSize(350, 120);
       jendela.setVisible(true);
   } 
    
}
