package UserAccount;

import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SignUpFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel existingAccountLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel userNameLBL;
    private javax.swing.JTextField userNameTextField;

    public SignUpFrame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        coloredPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        userNameLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        existingAccountLBL = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Utility and Banking System | SignUp");

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        coloredPanel.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Sign Up");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coloredPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1)
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        userNameLBL.setText("Username");

        passwordLBL.setText("Password");

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        existingAccountLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        existingAccountLBL.setText("Login to existing account");
        existingAccountLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        existingAccountLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                existingAccountLBLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
                basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coloredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                .addContainerGap(155, Short.MAX_VALUE)
                                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                                .addComponent(existingAccountLBL)
                                                .addGap(164, 164, 164))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(passwordLBL, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(userNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(userNameLBL, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, basePanelLayout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(145, 145, 145))))
        );
        basePanelLayout.setVerticalGroup(
                basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basePanelLayout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(userNameLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(passwordLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(existingAccountLBL)
                                .addContainerGap(61, Short.MAX_VALUE))
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

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {

        String userName = userNameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());


        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username and password", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            try {

                Connection connection = ServerConnection.createConnection();

                String query = "insert into users(username,password) values(?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, password);
                preparedStatement.executeUpdate();
                preparedStatement.close();

                JOptionPane.showMessageDialog(this, "New account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                int toNewAccount = JOptionPane.showConfirmDialog(this, "Do you want to login to newly created account");

                if (toNewAccount == 0) {
                    new LoginFrame(userName, password).setVisible(true);
                    this.setVisible(false);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void existingAccountLBLMouseClicked(java.awt.event.MouseEvent evt) {
        new LoginFrame().setVisible(true);
        this.setVisible(false);
    }
}