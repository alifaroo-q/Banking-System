package Bank;

import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransferToAnotherAccount extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JLabel amountToTransferLBL;
    private javax.swing.JTextField amountToTransferTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel fromAccountLBL;
    private javax.swing.JTextField fromAccountTextField;
    private javax.swing.JLabel headingLBL;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel toAccountLBL;
    private javax.swing.JTextField toAccountTextField;
    private javax.swing.JPanel transferDetailsPanel;

    public TransferToAnotherAccount() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        transferDetailsPanel = new javax.swing.JPanel();
        fromAccountLBL = new javax.swing.JLabel();
        fromAccountTextField = new javax.swing.JTextField();
        toAccountLBL = new javax.swing.JLabel();
        toAccountTextField = new javax.swing.JTextField();
        amountToTransferLBL = new javax.swing.JLabel();
        amountToTransferTextField = new javax.swing.JTextField();
        passwordLBL = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer money to another account");

        coloredPanel.setBackground(new java.awt.Color(255, 102, 0));

        headingLBL.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        headingLBL.setForeground(new java.awt.Color(255, 255, 255));
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("Transfer To Another Account");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        transferDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Account Details"));

        fromAccountLBL.setText("From Account");

        toAccountLBL.setText("To Account");

        amountToTransferLBL.setText("Amount To Transfer");

        passwordLBL.setText("Password");

        javax.swing.GroupLayout transferDetailsPanelLayout = new javax.swing.GroupLayout(transferDetailsPanel);
        transferDetailsPanel.setLayout(transferDetailsPanelLayout);
        transferDetailsPanelLayout.setHorizontalGroup(
                transferDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(transferDetailsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(transferDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fromAccountLBL)
                                        .addComponent(fromAccountTextField)
                                        .addComponent(toAccountLBL)
                                        .addComponent(toAccountTextField)
                                        .addComponent(amountToTransferLBL)
                                        .addComponent(amountToTransferTextField)
                                        .addComponent(passwordLBL)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transferDetailsPanelLayout.setVerticalGroup(
                transferDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(transferDetailsPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(fromAccountLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fromAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(toAccountLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amountToTransferLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountToTransferTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(transferDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(transferDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnProceed)
                                        .addComponent(btnBack))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {

        String sourceAccountNo = fromAccountTextField.getText();
        String sourceAccountPassword = String.valueOf(passwordTextField.getPassword());
        String destinationAccountNo = toAccountTextField.getText();

        if (sourceAccountNo.isEmpty() || sourceAccountPassword.isEmpty() || destinationAccountNo.isEmpty() || amountToTransferTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all of the fields", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            int amountToTransfer = Integer.parseInt(amountToTransferTextField.getText());
            String sourcePasswordFromDB = "";
            int sourceAccountBalance = 0;

            try {
                Connection connection = ServerConnection.createConnection();
                Statement statement = connection.createStatement();
                String query = "Select password, balance from bank_accounts where accountNo = '" + sourceAccountNo + "'";
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    sourcePasswordFromDB = resultSet.getString("password");
                    sourceAccountBalance = resultSet.getInt("balance");
                }
                statement.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            try {
                Connection connection = ServerConnection.createConnection();
                String query = "update bank_accounts set balance = " + (sourceAccountBalance - amountToTransfer) + " where accountNo = " + "'" + sourceAccountNo + "'";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            int destinationAccountBalance = 0;

            if (sourceAccountPassword.equals(sourcePasswordFromDB)) {
                if (amountToTransfer <= sourceAccountBalance) {
                    try {
                        Connection connection = ServerConnection.createConnection();
                        Statement statement = connection.createStatement();
                        String query = "Select balance from bank_accounts where accountNo = '" + destinationAccountNo + "'";
                        ResultSet resultSet = statement.executeQuery(query);

                        while (resultSet.next()) {
                            destinationAccountBalance = resultSet.getInt("balance");
                        }
                        statement.close();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                    try {
                        Connection connection = ServerConnection.createConnection();
                        String query = "update bank_accounts set balance = " + (amountToTransfer + destinationAccountBalance) + " where accountNo = " + "'" + destinationAccountNo + "'";
                        PreparedStatement preparedStatement = connection.prepareStatement(query);
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
                        JOptionPane.showMessageDialog(this, "Amount transferred to the account", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance in the account", "Error", JOptionPane.ERROR_MESSAGE);
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