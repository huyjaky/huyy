package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.AbstractButton;  

import controller.ActionListen;

import java.awt.*;

public class CounterView extends JFrame {    
    private JLabel jLabel_before;

    public CounterView () {
        this.__init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("title");
        this.setSize(600, 600);
        this.setLocation(400, 400);
        ActionListen action = new ActionListen(this);

        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(2,2));
        for (int i = 1; i <= 4; i++) {
            JButton button = new JButton(i+"");
            Font font_button = new Font("JetBrains Mono", Font.BOLD, 90);
            button.setFont(font_button);
            button.setBackground(Color.CYAN);
            button.addActionListener(action);
            jPanel_button.add(button);
        }
        
        Font font = new Font("JetBrains Mono", Font.BOLD, 30);
        jLabel_before = new JLabel("Last button push was no. ", JLabel.CENTER);
        jLabel_before.setFont(font);
        

        this.add(jPanel_button, BorderLayout.CENTER);
        this.add(jLabel_before, BorderLayout.SOUTH);
    }

    public void result (String command) {
        this.jLabel_before.setText("Last button push was no. " + command);
    }

    public void colorchange (int i) {
        jLabel_before.setOpaque(true);
        if (i == 1) {
            jLabel_before.setText("Last button push was no. " + i);
            jLabel_before.setForeground(Color.CYAN);
        } else if (i == 2) {
            jLabel_before.setText("Last button push was no. " + i);
            jLabel_before.setForeground(Color.BLUE);
        } else if (i == 3) {
            jLabel_before.setText("Last button push was no. " + i);
            jLabel_before.setBackground(Color.CYAN);
        } else {
            jLabel_before.setText("Last button push was no. " + i);
            jLabel_before.setBackground(Color.BLUE);
        }
    }

}   
