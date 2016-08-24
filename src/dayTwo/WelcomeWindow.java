package dayTwo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 24/08/2016.
 */
public class WelcomeWindow extends JFrame{
    private JPanel contentPane;
    private JButton btnEnter;
    private JLabel lblWelcome;

    public WelcomeWindow(){
        setTitle("Welcome Frame");
        setSize(800,400); //overloaded method - different signatures to values you can set
        setResizable(false);

        //center the frame
        //setLocationRelativeTo(null); //this has impact on resolution of display - not the best way to do this
        Dimension di = getToolkit().getScreenSize();
        setLocation(di.width/2 - getWidth()/2,di.height/2 - getHeight()/2); // can be used on any screen

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //cleans anything not needed on termination

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnEnter = new JButton("Enter"); //simplest constructor for button
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //load main frame
                MainWindow mainFrame = new MainWindow();
            }
        });
        btnEnter.setBounds(360,200,70,25);
        contentPane.add(btnEnter);

        lblWelcome = new JLabel("Welcome to Employee Programme!");
        lblWelcome.setForeground(Color.BLUE);
        lblWelcome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
        lblWelcome.setBounds(220,80,400,100);
        contentPane.add(lblWelcome);

        setVisible(true); //by default, windows frame doesn't appear on screen
    }
}
