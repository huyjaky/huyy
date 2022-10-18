
package controller;
import java.awt.event.*;

import view.CounterView;

public class ActionListen implements ActionListener {
    CounterView ctv;

    public ActionListen (CounterView ctv) {
        this.ctv = ctv;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command = e.getActionCommand();
        if (command.equals("1")) {
            this.ctv.colorchange(1);
        } else if (command.equals("2")) {
            this.ctv.colorchange(2);
        } else if (command.equals("3")) {
            this.ctv.colorchange(3);
        } else {
            this.ctv.colorchange(4);
        }
    }
}
