package view;

import java.awt.Font;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.caculator_listener;
import modul.caculator_modul;

public class caculator_view extends JFrame{
    private caculator_modul modul;
    private JTextField text_num1;
    private JTextField text_num2;
    private JTextField text_answer;

    public caculator_view () {
        __init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setTitle("CACULATOR");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setSize(600, 600);
        caculator_listener action = new caculator_listener(this);

        Font font = new Font("JetBrain Mono", Font.BOLD, 30);

        // panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2, 10, 10));
        
        JLabel label_num1 = new JLabel("num 1st = ", JLabel.CENTER); label_num1.setFont(font);
        JLabel label_num2 = new JLabel("num 2nd = ", JLabel.CENTER); label_num2.setFont(font);
        JLabel label_answer = new JLabel("answer = ", JLabel.CENTER); label_answer.setFont(font);

        this.text_num1 = new JTextField(); this.text_num1.setFont(font);
        this.text_num2 = new JTextField(); this.text_num2.setFont(font);
        this.text_answer = new JTextField(); this.text_answer.setFont(font);
        

        panel1.add(label_num1); panel1.add(text_num1);
        panel1.add(label_num2); panel1.add(text_num2);
        panel1.add(label_answer); panel1.add(text_answer);

        // panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 3, 10, 10));

        String dau = "+-*/%^";
        for (int i = 0; i < dau.length(); i++)  {
            char dau_ = dau.charAt(i);
            JButton button = new JButton(dau_ + "");
            button.setFont(font);
            button.setForeground(Color.WHITE);
            button.setOpaque(true);
            button.setBackground(Color.BLACK);
            button.addActionListener(action);
            panel2.add(button);
        }

        this.setLayout(new BorderLayout(10, 10));
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);
    }
    
    public void cong_thuc () {
        this.modul = new caculator_modul(Double.parseDouble(this.text_num1.getText()), Double.parseDouble(this.text_num2.getText()));

    }

    public void plus () {
        this.modul.plus();
        this.text_answer.setText(this.modul.get_answer() + "");
    }

    public void minus () {
        this.modul.minus();
        this.text_answer.setText(this.modul.get_answer() + "");
    }

    public void multiple () {
        this.modul.multiple();
        this.text_answer.setText(this.modul.get_answer() + "");
    }

    public void divide () {
        this.modul.divdie();
        this.text_answer.setText(this.modul.get_answer() + "");
    }

    public void caps () {
        this.modul.caps();
        this.text_answer.setText(this.modul.get_answer() + "");
    }

    public void extra () {
        this.modul.extra();
        this.text_answer.setText(this.modul.get_answer() + "");
    }   

}
