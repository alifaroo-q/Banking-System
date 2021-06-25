package UserAccount;

import Bank.AccountChoice;
import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel headingLBL;
    private javax.swing.JButton loginBTN;
    private javax.swing.JLabel newAccountLBL;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JLabel usernameLBL;

    public LoginFrame() {
        initComponents();
    }

    public LoginFrame(String username, String password) {
        initComponents();
        userNameTextField.setText(username);
        passwordTextField.setText(password);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        usernameLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        loginBTN = new javax.swing.JButton();
        newAccountLBL = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Utility and Banking System | Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        coloredPanel.setBackground(new java.awt.Color(51, 153, 255));

        headingLBL.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        headingLBL.setForeground(new java.awt.Color(255, 255, 255));
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("User Login");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coloredPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(headingLBL)
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        usernameLBL.setText("Username");

        passwordLBL.setText("Password");

        loginBTN.setText("Login");
        loginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTNMouseClicked(evt);
            }
        });

        newAccountLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newAccountLBL.setText("Create a new account");
        newAccountLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAccountLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAccountLBLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
                basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coloredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(basePanelLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                .addContainerGap(155, Short.MAX_VALUE)
                                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordLBL)
                                                        .addComponent(userNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(usernameLBL)
                                                        .addComponent(passwordTextField))
                                                .addGap(145, 145, 145))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                                .addComponent(newAccountLBL)
                                                .addGap(180, 180, 180))))
        );
        basePanelLayout.setVerticalGroup(
                basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basePanelLayout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(usernameLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(passwordLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newAccountLBL)
                                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void loginBTNMouseClicked(java.awt.event.MouseEvent evt) {

        if (userNameTextField.getText().isEmpty() || String.valueOf(passwordTextField.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username and password", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            boolean isSuccess = false;
            try {

                Connection connection = ServerConnection.createConnection();
                Statement statement = connection.createStatement();
                String query = "Select username, password from users where username = '" + userNameTextField.getText() + "' and password = '" + String.valueOf(passwordTextField.getPassword()) + "'";
                ResultSet resultSet = statement.executeQuery(query);

                String username = "";
                String userpassword = "";

                while (resultSet.next()) {
                    username = resultSet.getString("username");
                    userpassword = resultSet.getString("password");
                }
                statement.close();
                isSuccess = username.equals(userNameTextField.getText()) && userpassword.equals(String.valueOf(passwordTextField.getPassword()));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new AccountChoice().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Login failed", "Failure", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void newAccountLBLMouseClicked(java.awt.event.MouseEvent evt) {
        new SignUpFrame().setVisible(true);
        this.setVisible(false);
    }
}