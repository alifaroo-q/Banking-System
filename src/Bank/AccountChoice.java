
package Bank;

public class AccountChoice extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup accountFunctions;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JRadioButton depositMoneyRD;
    private javax.swing.JPanel functionsPanel;
    private javax.swing.JLabel headingLBL;
    private javax.swing.JRadioButton newBankAccountRD;
    private javax.swing.JRadioButton toAnotherAccount;
    private javax.swing.JRadioButton viewDetailsRD;
    private javax.swing.JRadioButton withdrawMoneyRD;

    public AccountChoice() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        accountFunctions = new javax.swing.ButtonGroup();
        coloredPanel = new javax.swing.JPanel();
        headingLBL = new javax.swing.JLabel();
        btnProceed = new javax.swing.JButton();
        functionsPanel = new javax.swing.JPanel();
        newBankAccountRD = new javax.swing.JRadioButton();
        withdrawMoneyRD = new javax.swing.JRadioButton();
        depositMoneyRD = new javax.swing.JRadioButton();
        viewDetailsRD = new javax.swing.JRadioButton();
        toAnotherAccount = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);

        coloredPanel.setBackground(new java.awt.Color(102, 102, 102));
        coloredPanel.setForeground(new java.awt.Color(255, 255, 255));
        coloredPanel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        headingLBL.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        headingLBL.setForeground(new java.awt.Color(255, 255, 255));
        headingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLBL.setText("Account Options");

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headingLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coloredPanelLayout.setVerticalGroup(
                coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coloredPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(headingLBL)
                                .addContainerGap(71, Short.MAX_VALUE))
        );

        btnProceed.setText("Proceed");
        btnProceed.setFocusable(false);
        btnProceed.setMaximumSize(new java.awt.Dimension(70, 22));
        btnProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProceedMouseClicked(evt);
            }
        });

        functionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose from the following"));

        accountFunctions.add(newBankAccountRD);
        newBankAccountRD.setText("Create a new bank account");
        newBankAccountRD.setFocusable(false);

        accountFunctions.add(withdrawMoneyRD);
        withdrawMoneyRD.setText("Withdraw money from bank account");
        withdrawMoneyRD.setFocusable(false);

        accountFunctions.add(depositMoneyRD);
        depositMoneyRD.setText("Deposite money to bank account");
        depositMoneyRD.setFocusable(false);

        accountFunctions.add(viewDetailsRD);
        viewDetailsRD.setText("View bank account details");
        viewDetailsRD.setFocusable(false);

        accountFunctions.add(toAnotherAccount);
        toAnotherAccount.setText("Transfer money to another account");
        toAnotherAccount.setFocusable(false);

        javax.swing.GroupLayout functionsPanelLayout = new javax.swing.GroupLayout(functionsPanel);
        functionsPanel.setLayout(functionsPanelLayout);
        functionsPanelLayout.setHorizontalGroup(
                functionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(functionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(newBankAccountRD)
                                        .addComponent(withdrawMoneyRD)
                                        .addComponent(depositMoneyRD)
                                        .addComponent(viewDetailsRD)
                                        .addComponent(toAnotherAccount))
                                .addContainerGap(236, Short.MAX_VALUE))
        );
        functionsPanelLayout.setVerticalGroup(
                functionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionsPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(newBankAccountRD)
                                .addGap(18, 18, 18)
                                .addComponent(withdrawMoneyRD)
                                .addGap(18, 18, 18)
                                .addComponent(depositMoneyRD)
                                .addGap(18, 18, 18)
                                .addComponent(viewDetailsRD)
                                .addGap(18, 18, 18)
                                .addComponent(toAnotherAccount)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coloredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(functionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(coloredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(functionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {
        if (newBankAccountRD.isSelected()) {
            new NewBankAccount().setVisible(true);
            this.setVisible(false);
        }
        else if (withdrawMoneyRD.isSelected()) {
            new WithdrawMoneyFromBankAccount().setVisible(true);
            this.setVisible(false);
        }
        else if (depositMoneyRD.isSelected()) {
            new DepositMoneyToBankAccount().setVisible(true);
            this.setVisible(false);
        }
        else if (viewDetailsRD.isSelected()) {
            new BankAccountDetails().setVisible(true);
            this.setVisible(false);
        }
        else if (toAnotherAccount.isSelected()) {
            new TransferToAnotherAccount().setVisible(true);
            this.setVisible(false);
        }
    }
}