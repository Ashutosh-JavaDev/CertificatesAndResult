package CertificatesAndResult;

import javax.swing.*;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
    private JLabel Clock, clockLabel;

    DigitalClock() {
        setLayout(null);
        setSize(400,400);
        setLocation(300,150);
        setTitle("My Clock");
        Clockfunction();
        setVisible(true);
    }
    public void Clockfunction(){
        int delay=1000;
        ActionListner taskPerformed=new ActionListner();
        Timer time=new Timer(delay, null);
    }
}