package Bank;

import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BankAccountDetails extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JPanel accountDetailsPanel;
    private javax.swing.JTextArea accountDetailsTextArea;
    private javax.swing.JLabel accountNoLBL;
    private javax.swing.JTextField accountNoTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel headingLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPanel userDetailsPanel;

    public BankAccountDetails() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        userDetailsPanel = new javax.swing.JPanel();
        accountNoLBL = new javax.swing.JLabel();
        accountNoTextField = new javax.swing.JTextField();
        passwordLBL = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        accountDetailsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountDetailsTextArea = new javax.swing.JTextArea();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Account Details");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        coloredPanel.setBackground(new java.awt.Color(0, 51, 51));

        headingLBL.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        headingLBL.setForeground(new java.awt.Color(255, 255, 255));
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("Bank Account Details");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        userDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));

        accountNoLBL.setText("Account No");

        passwordLBL.setText("Password");

        javax.swing.GroupLayout userDetailsPanelLayout = new javax.swing.GroupLayout(userDetailsPanel);
        userDetailsPanel.setLayout(userDetailsPanelLayout);
        userDetailsPanelLayout.setHorizontalGroup(
                userDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userDetailsPanelLayout.createSequentialGroup()
                                .addGroup(userDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(userDetailsPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(accountNoLBL))
                                        .addGroup(userDetailsPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(accountNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                        .addGroup(userDetailsPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(passwordLBL))
                                        .addGroup(userDetailsPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(passwordTextField)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userDetailsPanelLayout.setVerticalGroup(
                userDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userDetailsPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(accountNoLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        accountDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Account Details"));

        accountDetailsTextArea.setEditable(false);
        accountDetailsTextArea.setColumns(20);
        accountDetailsTextArea.setRows(5);
        jScrollPane1.setViewportView(accountDetailsTextArea);

        javax.swing.GroupLayout accountDetailsPanelLayout = new javax.swing.GroupLayout(accountDetailsPanel);
        accountDetailsPanel.setLayout(accountDetailsPanelLayout);
        accountDetailsPanelLayout.setHorizontalGroup(
                accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        accountDetailsPanelLayout.setVerticalGroup(
                accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
        );

        btnProceed.setText("Proceed");
        btnProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProceedMouseClicked(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coloredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(accountDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(userDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(accountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnProceed)
                                        .addComponent(btnBack))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {
        String accountNo = accountNoTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        String passwordFromDB = "";
        String firstName = "";
        String lastName = "";
        String userName = "";
        String cnic = "";
        int balance = 0;

        if (accountNo.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter account no and password", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                Connection connection = ServerConnection.createConnection();
                Statement statement = connection.createStatement();
                String query = "Select * from bank_accounts where accountNo = '" + accountNo + "'";
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    passwordFromDB = resultSet.getString("password");
                    firstName = resultSet.getString("firstName");
                    lastName = resultSet.getString("lastName");
                    userName = resultSet.getString("userName");
                    cnic = resultSet.getString("cnic");
                    balance = resultSet.getInt("balance");
                }
                statement.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            if (password.equals(passwordFromDB)) {
                accountDetailsTextArea.setText("First Name: " + firstName + "\nLast Name: " + lastName + "\nUsername: " + userName + "\nCNIC: " + cnic + "\nBalance: " + balance);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong account no or password", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        new AccountChoice().setVisible(true);
        this.setVisible(false);
    }
}