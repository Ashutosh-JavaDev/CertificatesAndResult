package CertificatesAndResult;

import javax.swing.*;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
    private JLabel Clock, clockLabel;

    DigitalClock() {
        //setLayout(null);
        setSize(400,400);
        setLocation(300,150);
        setTitle("My Clock");
        this.Clockfunction();
        setVisible(true);
    }
    public void Clockfunction(){
        Clock=new JLabel("My Clock");
        clockLabel=new JLabel("New Clock...");
        this.setLayout(new GridLayout(2,1));
        this.add(Clock);
        this.add(clockLabel);
    }
   
}