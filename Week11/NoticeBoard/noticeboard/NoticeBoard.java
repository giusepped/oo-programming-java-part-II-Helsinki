package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        
        frame.setPreferredSize(new Dimension(500, 500));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textFieldTop = new JTextField();
        JButton copy = new JButton("Copy!");
        JLabel jLabelBottom = new JLabel();
        
        fieldCopier copier = new fieldCopier(textFieldTop, jLabelBottom);
        copy.addActionListener(copier);
        
        container.add(textFieldTop);
        container.add(copy);
        container.add(jLabelBottom);
    }
    
    public class fieldCopier implements ActionListener {
        private JTextField origin;
        private JLabel destination;
        
        public fieldCopier(JTextField origin, JLabel destination){
            this.origin = origin;
            this.destination = destination;
        }
        
        @Override 
        public void actionPerformed(ActionEvent ae){
            this.destination.setText(this.origin.getText());
            this.origin.setText("");
        }
    }
}
