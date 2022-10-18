package controller;

import java.awt.event.*;

import view.caculator_view;

public class caculator_listener implements ActionListener {
    private caculator_view ccview;

    public caculator_listener(caculator_view ccview) {
        this.ccview = ccview;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command = e.getActionCommand();
        this.ccview.cong_thuc();
        
        if (command.equals("*")) {
            this.ccview.multiple();
        } else if (command.equals("/")) {
            this.ccview.divide();
        } else if (command.equals("+")) {
            this.ccview.plus();
        } else if (command.equals("-")) {
            this.ccview.minus();
        } else if (command.equals("%")) {
            this.ccview.extra();
        } else if (command.equals("^")) {
            this.ccview.caps();
        }
    }
    
}
