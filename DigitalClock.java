package CertificatesAndResult;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
// import java.util.Timer;
public class DigitalClock extends JFrame implements ActionListener {
    private JLabel Clock, clockLabel;

    DigitalClock() {
        //setLayout(null);
        setSize(400,400);
        setLocation(300,150);
        setTitle("My Clock");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.Clockfunction();
        this.clockStart();
        setVisible(true);
    }
    public void Clockfunction(){
        Clock=new JLabel("My Clock");
        clockLabel=new JLabel("New Clock...");
        this.setLayout(new GridLayout(2,1));
        this.add(Clock);
        this.add(clockLabel);
    }
    public void clockStart(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Get current date and time and update clockLabel
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String dateTime = sdf.format(new Date());
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
 
   
}