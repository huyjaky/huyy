package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.actionlistener;

import java.awt.*;

import modul.countermodul;

public class counterview extends JFrame{
    private Double a, b, c;
    private JTextField text_a, text_b, text_c;
    private countermodul modul = new countermodul();
    private JLabel label_answer;

    public counterview () {
        __init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setTitle("phuong trinh bac 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setSize(600, 600);
        
        actionlistener action = new actionlistener(this);
        Font font = new Font("JetBrains Mono", Font.BOLD, 27);

        //panel1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout());

        this.text_a = new JTextField(); this.text_a.setFont(font); 
        this.text_b = new JTextField(); this.text_b.setFont(font);
        this.text_c = new JTextField(); this.text_c.setFont(font);

        
        JLabel lable_a = new JLabel("*x^2+"); lable_a.setFont(font);
        JLabel label_b = new JLabel("*x+"); label_b.setFont(font);
        JLabel label_c = new JLabel(" + "); label_c.setFont(font);
        JLabel label = new JLabel(" = 0"); label.setFont(font);

        panel1.add(this.text_a); panel1.add(lable_a); panel1.add(this.text_b); panel1.add(label_b); panel1.add(this.text_c); panel1.add(label);

        //panel2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout());

        JButton button = new JButton("giai phuong trinh bac 2!"); button.setFont(font);
        button.addActionListener(action);
        panel2.add(button);

        this.label_answer = new JLabel("ket qua = ?", JLabel.CENTER);
        this.label_answer.setFont(font);
        
        this.setLayout(new GridLayout(3,1));
        this.add(panel1);
        this.add(label_answer);
        this.add(panel2);
    }

    public void get_answer () {
        this.a = Double.parseDouble(this.text_a.getText());
        this.b = Double.parseDouble(this.text_b.getText());
        this.c = Double.parseDouble(this.text_c.getText());

        this.modul.phuongtrinhbac2(this.a, this.b, this.c);
        this.label_answer.setText(this.modul.get_answer()+"");
    }
}
