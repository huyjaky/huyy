
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class App extends JFrame{
    
    public App () {
        JFrame jframe = new JFrame();
        jframe.setLocationRelativeTo(null);
        jframe.setSize(600, 600);
        jframe.setTitle("dcm vl luon");

        // tao cho nhap lieu
        JTextField jtext = new JTextField(60);
        
        JPanel jpanel_text = new JPanel(); 
        jtext.setSize(150, 100);
        jpanel_text.setLayout(new GridLayout());
        jpanel_text.add(jtext);
        jpanel_text.setSize(150, 100);

        // tao ban phim may tinh
        JPanel jpanel_keyboard = new JPanel();
        JButton button_cong = new JButton("+");
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
