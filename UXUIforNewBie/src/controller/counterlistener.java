package controller;


import view.counterview;

import java.awt.event.*;

public class counterlistener implements ActionListener  {
    counterview ctv;
    public counterlistener (counterview ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command = e.getActionCommand(); 
        if (command.equals("UP")) {
            this.ctv.Increase();
        } else if (command.equals("DOWN")) {
            this.ctv.Decrease();
        } else {
            this.ctv.Reset();
        }
    }
    
}
