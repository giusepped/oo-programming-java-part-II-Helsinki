
package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author giuseppedesantis
 */


public class ClickListener implements ActionListener{
    private Calculator calculator;
    private JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label){
        this.calculator = calculator;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.calculator.increase();
        this.label.setText(Integer.toString(this.calculator.giveValue()));
    }
}
