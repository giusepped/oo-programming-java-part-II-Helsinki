
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    @Override
    public void run() {
        this.calculator = new Calculator();
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(500, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField outputField = new JTextField("0");
        outputField.setEnabled(false);
        
        
        JTextField inputField = new JTextField("");
        
        container.add(outputField);
        container.add(inputField);
        container.add(createPanel(inputField, outputField));
        
    }
    
    private JPanel createPanel(JTextField input, JTextField output){
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        panel.add(plus);
        JButton minus = new JButton("-");
        panel.add(minus);
        JButton zed = new JButton("Z");
        panel.add(zed);
        
        CalculatorListener calculatorListener = new CalculatorListener(this.calculator, input,
        output, plus, minus, zed);
        
        plus.addActionListener(calculatorListener);
        minus.addActionListener(calculatorListener);
        zed.addActionListener(calculatorListener);
        
        zed.setEnabled(false);

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
