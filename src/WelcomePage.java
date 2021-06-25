import UserAccount.LoginFrame;

import javax.swing.*;
import java.awt.*;

public class WelcomePage extends JFrame {

    JProgressBar progressBar = new JProgressBar();
    JLabel headerLabel = new JLabel("Welcome to Banking System");
    JLabel messageLabel = new JLabel("Please wait while the application is loading");

    WelcomePage() {

        setTitle("Banking System");

        headerLabel.setBounds(83, 15, 500, 50);
        headerLabel.setFont(new Font(null, Font.BOLD, 24));

        progressBar.setValue(0);
        progressBar.setBounds(10, 80, 460, 50);
        progressBar.setStringPainted(true);

        messageLabel.setBounds(140, 130, 400, 50);

        add(headerLabel);
        add(progressBar);
        add(messageLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 210);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);

        fill();
        new LoginFrame().setVisible(true);
        dispose();
    }

    private void fill() {
        int counter = 0;
        while (counter <= 100) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 2;
        }
    }
}