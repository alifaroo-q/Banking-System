package Bank;

import Database.ServerConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

public class NewBankAccount extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JPanel accountDetailsPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JLabel cnicLBL;
    private javax.swing.JTextField cnicTextField;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel firstNameLBL;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel headingLBL;
    private javax.swing.JLabel lastNameLBL;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTextField;

    public NewBankAccount() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        accountDetailsPanel = new javax.swing.JPanel();
        passwordTextField = new javax.swing.JPasswordField();
        passwordLBL = new javax.swing.JLabel();
        cnicTextField = new javax.swing.JTextField();
        cnicLBL = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        lastNameLBL = new javax.swing.JLabel();
        firstNameLBL = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Bank Account");
        setBackground(new java.awt.Color(255, 255, 255));

        coloredPanel.setBackground(new java.awt.Color(153, 153, 255));

        headingLBL.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        headingLBL.setForeground(new java.awt.Color(255, 255, 255));
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("New Bank Account");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coloredPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(headingLBL)
                                .addContainerGap(84, Short.MAX_VALUE))
        );

        accountDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("New Account"));
        passwordLBL.setText("Password");
        cnicLBL.setText("CNIC");
        lastNameLBL.setText("Last Name");
        firstNameLBL.setText("First Name");

        javax.swing.GroupLayout accountDetailsPanelLayout = new javax.swing.GroupLayout(accountDetailsPanel);
        accountDetailsPanel.setLayout(accountDetailsPanelLayout);
        accountDetailsPanelLayout.setHorizontalGroup(
                accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameLBL)
                                        .addComponent(lastNameLBL)
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cnicLBL)
                                        .addComponent(cnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLBL))
                                .addContainerGap(226, Short.MAX_VALUE))
        );
        accountDetailsPanelLayout.setVerticalGroup(
                accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(firstNameLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cnicLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnProceed.setText("Proceed");
        btnProceed.setFocusable(false);
        btnProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProceedMouseClicked(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.setFocusable(false);
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
                                .addComponent(accountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(accountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(btnProceed))
                                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {

        if (firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() || cnicTextField.getText().isEmpty() || String.valueOf(passwordTextField.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Some of the fields are empty", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();
            String CNIC = cnicTextField.getText();
            String password = String.valueOf(passwordTextField.getPassword());

            String userName = firstName.toLowerCase() + lastName.toLowerCase() + CNIC.substring(0, 3);

            // accountNo algorithm
            String characters = firstName + lastName + CNIC;
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 9) {
                int index = (int) (rnd.nextFloat() * characters.length());
                salt.append(characters.charAt(index));
            }
            String accountNo = salt.toString();

            try {

                Connection connection = ServerConnection.createConnection();

                String query = "insert into bank_accounts(firstName,lastName,userName,accountNo,password,cnic,balance) values(?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                preparedStatement.setString(3, userName);
                preparedStatement.setString(4, accountNo);
                preparedStatement.setString(5, password);
                preparedStatement.setString(6, CNIC);
                preparedStatement.setInt(7, 0);

                preparedStatement.executeUpdate();
                preparedStatement.close();

                JTextArea accountANdUser = new JTextArea();
                accountANdUser.setText("Username: " + userName + "\nAccount No: " + accountNo);
                accountANdUser.setEditable(false);
                accountANdUser.setCaretPosition(0);

                JOptionPane.showMessageDialog(this, "New bank account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, accountANdUser, "Success", JOptionPane.INFORMATION_MESSAGE);


            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        new AccountChoice().setVisible(true);
        this.setVisible(false);
    }
}