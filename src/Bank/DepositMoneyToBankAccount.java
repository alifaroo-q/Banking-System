package Bank;

import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DepositMoneyToBankAccount extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JLabel accountNoLBL;
    private javax.swing.JTextField accountNoTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel depositAmountLBL;
    private javax.swing.JTextField depositAmountTextField;
    private javax.swing.JPanel depositDetailsPanel;
    private javax.swing.JLabel headingLBL;
    private boolean secondTime = false;

    public DepositMoneyToBankAccount() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        depositDetailsPanel = new javax.swing.JPanel();
        accountNoLBL = new javax.swing.JLabel();
        accountNoTextField = new javax.swing.JTextField();
        depositAmountLBL = new javax.swing.JLabel();
        depositAmountTextField = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit money to bank account");
        setBackground(new java.awt.Color(255, 255, 255));

        coloredPanel.setBackground(new java.awt.Color(102, 102, 0));

        headingLBL.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("Deposit Money");

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

        depositDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Deposit Details"));

        accountNoLBL.setText("Account No");

        depositAmountLBL.setText("Deposit Amount");

        javax.swing.GroupLayout depositDetailsPanelLayout = new javax.swing.GroupLayout(depositDetailsPanel);
        depositDetailsPanel.setLayout(depositDetailsPanelLayout);
        depositDetailsPanelLayout.setHorizontalGroup(
                depositDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(depositDetailsPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(depositDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(accountNoLBL)
                                        .addComponent(accountNoTextField)
                                        .addComponent(depositAmountLBL)
                                        .addComponent(depositAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(224, Short.MAX_VALUE))
        );
        depositDetailsPanelLayout.setVerticalGroup(
                depositDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositDetailsPanelLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(accountNoLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(depositAmountLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(depositAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
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
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(btnProceed))
                                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {

        String accountNo = accountNoTextField.getText();

        if (accountNo.isEmpty() || depositAmountTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter account no and deposit amount", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            int amountToDeposit = Integer.parseInt(depositAmountTextField.getText());
            boolean isSuccess = false;
            int currentBalance = 0;

            try {
                Connection connection = ServerConnection.createConnection();
                Statement statement = connection.createStatement();
                String query = "Select accountNo, balance from bank_accounts where accountNo = '" + accountNo + "'";
                ResultSet resultSet = statement.executeQuery(query);

                String accountNO = "";
                while (resultSet.next()) {
                    accountNO = resultSet.getString("accountNo");
                    currentBalance = resultSet.getInt("balance");
                }
                statement.close();
                isSuccess = accountNO.equals(accountNo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }


            if (isSuccess) {
                if (!secondTime) {
                    try {
                        Connection connection = ServerConnection.createConnection();
                        String query = "update bank_accounts set balance = " + (amountToDeposit + currentBalance) + " where accountNo = " + "'" + accountNo + "'";
                        PreparedStatement preparedStatement = connection.prepareStatement(query);

                        preparedStatement.executeUpdate();
                        preparedStatement.close();
                        secondTime = true;

                        JOptionPane.showMessageDialog(this, "Amount deposited to the account", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "You have already deposited the amount", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No account with this username exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        new AccountChoice().setVisible(true);
        this.setVisible(false);
    }
}