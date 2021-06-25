package Bank;

import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class WithdrawMoneyFromBankAccount extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JLabel accountNoLBL;
    private javax.swing.JTextField accountNoTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JPanel depositDetailsPanel;
    private javax.swing.JLabel headingLBL;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel withdrawAmountLBL;
    private javax.swing.JTextField withdrawAmountTextField;
    private boolean secondTime = false;

    public WithdrawMoneyFromBankAccount() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        depositDetailsPanel = new javax.swing.JPanel();
        accountNoLBL = new javax.swing.JLabel();
        accountNoTextField = new javax.swing.JTextField();
        withdrawAmountLBL = new javax.swing.JLabel();
        withdrawAmountTextField = new javax.swing.JTextField();
        passwordLBL = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Withdraw Money from bank account");
        setBackground(new java.awt.Color(255, 255, 255));

        coloredPanel.setBackground(new java.awt.Color(199, 84, 80));

        headingLBL.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        headingLBL.setForeground(new java.awt.Color(255, 255, 255));
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("Withdraw Money");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coloredPanelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(headingLBL)
                                .addContainerGap(68, Short.MAX_VALUE))
        );

        depositDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Withdraw Details"));

        accountNoLBL.setText("Account No");

        withdrawAmountLBL.setText("Withdraw Amount");

        passwordLBL.setText("Password");

        javax.swing.GroupLayout depositDetailsPanelLayout = new javax.swing.GroupLayout(depositDetailsPanel);
        depositDetailsPanel.setLayout(depositDetailsPanelLayout);
        depositDetailsPanelLayout.setHorizontalGroup(
                depositDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(depositDetailsPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(depositDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordLBL)
                                        .addComponent(accountNoLBL)
                                        .addComponent(accountNoTextField)
                                        .addComponent(withdrawAmountLBL)
                                        .addComponent(withdrawAmountTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(passwordTextField))
                                .addContainerGap(223, Short.MAX_VALUE))
        );
        depositDetailsPanelLayout.setVerticalGroup(
                depositDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(depositDetailsPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(accountNoLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(withdrawAmountLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(withdrawAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
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
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(depositDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(depositDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(btnProceed))
                                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {

        String accountNo = accountNoTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        if (accountNo.isEmpty() || password.isEmpty() || withdrawAmountTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all of the fields", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            int amountToWithdraw = Integer.parseInt(withdrawAmountTextField.getText());
            String passwordFromDB = "";
            int currentBalance = 0;

            try {
                Connection connection = ServerConnection.createConnection();
                Statement statement = connection.createStatement();
                String query = "Select password, balance from bank_accounts where accountNo = '" + accountNo + "'";
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    passwordFromDB = resultSet.getString("password");
                    currentBalance = resultSet.getInt("balance");
                }
                statement.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (password.equals(passwordFromDB)) {
                if (amountToWithdraw <= currentBalance) {
                    if (!secondTime) {
                        try {
                            Connection connection = ServerConnection.createConnection();
                            String query = "update bank_accounts set balance = " + (currentBalance - amountToWithdraw) + " where accountNo = " + "'" + accountNo + "'";
                            PreparedStatement preparedStatement = connection.prepareStatement(query);
                            preparedStatement.executeUpdate();
                            preparedStatement.close();
                            secondTime = true;
                            JOptionPane.showMessageDialog(this, "Amount withdrawn from the account", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You have already withdrawn the amount", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance in bank account", "Error", JOptionPane.ERROR_MESSAGE);
                }
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