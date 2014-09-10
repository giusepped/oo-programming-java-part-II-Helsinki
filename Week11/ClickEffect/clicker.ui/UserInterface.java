
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
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
        
        JTextField outputField = new JTextField();
        outputField.setEnabled(false);
        
        JTextField inputField = new JTextField("0");
        
        container.add(outputField);
        container.add(inputField);
        container.add(createPanel());
    }
    
    private JPanel createPanel(){
        JPanel panel = new JPanel(new GridLayout(1,3));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("Z"));
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
