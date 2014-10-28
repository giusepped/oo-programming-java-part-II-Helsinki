import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author giuseppedesantis
 */
public class CalculatorListener implements ActionListener{
    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton plus;
    private JButton minus;
    private JButton zed;
    
    public CalculatorListener(Calculator calculator, JTextField input, JTextField output, 
            JButton plus, JButton minus, JButton zed){
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.plus = plus;
        this.minus = minus;
        this.zed = zed;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == plus){
            pressPlus();
        }else if(e.getSource() == minus){
            pressMinus();
        }else{
            pressZed();
        }
    }
    
    private void setOutput(){
        output.setText("" + calculator.getValue());
        zed.setEnabled(true);
    }
    
    private void pressPlus(){
        try {
            calculator.pressPlus(Integer.parseInt(input.getText()));
            setOutput();
        }catch (NumberFormatException exception){
        }
        input.setText("");
    }
    
    private void pressMinus(){
        try {
            calculator.pressMinus(Integer.parseInt(input.getText()));
            setOutput();
        }catch (NumberFormatException exception){
        }
        input.setText("");
    }
    
    private void pressZed(){
        calculator.pressZed();
        output.setText("0");
        input.setText("");
        zed.setEnabled(false);
    }
}
