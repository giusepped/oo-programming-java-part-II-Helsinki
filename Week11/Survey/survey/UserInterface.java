package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        JRadioButton nr = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        ButtonGroup multipleChoice = new ButtonGroup();
        multipleChoice.add(nr);
        multipleChoice.add(fun);
        container.add(nr);
        container.add(fun);
        JButton done = new JButton("Done!");
        container.add(done);   
    }


    public JFrame getFrame() {
        return frame;
    }
}
