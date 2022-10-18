package view;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.counterlistener;
import model.model;

public class counterview extends JFrame{
    private model model;
    private JLabel jlabel;
    private JButton button_down;
    private JButton button_up;
    private JButton button_reset;

    public counterview () {
        this.model = new model();
        this.__init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setTitle("chuong trinh dau tien!");
        this.setLocation(200, 200);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counterlistener action = new counterlistener(this);

        button_reset = new JButton("RESET");
        button_reset.addActionListener(action);
        //
        button_down = new JButton("DOWN");
        button_down.addActionListener(action);
        //
        jlabel = new JLabel(this.model.getnum() + "", jlabel.CENTER); 
        //
        button_up = new JButton("UP");
        button_up.addActionListener(action);
        
        JPanel jhead = new JPanel();
        jhead.setLayout(new GridLayout());
        jhead.add(button_down);
        jhead.add(jlabel);
        jhead.add(button_up);

        JPanel jbottom = new JPanel();
        jbottom.setLayout(new GridLayout());
        jbottom.add(button_reset);

        this.setLayout(new BorderLayout());
        this.add(jhead, BorderLayout.CENTER);
        this.add(jbottom, BorderLayout.SOUTH);
    }

    public void Increase () {
        this.model.Increasenum();
        this.jlabel.setText(this.model.getnum() + "");
    }

    public void Decrease () {
        this.model.Decreasenum();
        this.jlabel.setText(this.model.getnum() + "");
    }

    public void Reset () {
        this.model.Reset();
        this.jlabel.setText(this.model.getnum() + "");
    }

}
