package controller;
import java.awt.event.*;

import view.counterview;


public class actionlistener implements ActionListener {
    counterview view;

    public actionlistener (counterview view ) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        this.view.get_answer();
    }
    
}
