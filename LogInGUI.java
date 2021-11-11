/*
LogInGUI
    The LogInGUI allows a user to log in to the app using a display name and a household code field.
    When the user clicks the log in button, if the household code provided is a valid household 
        code and there is a member in the member listof the Account with the household code that 
        matches the display name provided, the user successfully logged in and is sent to the 
        Dashboard GUI
    When the user clicks the sign up button, the user will be navigated to the SignUpGUI
        **Note: not implemented yet
*/
/**
 *
 * @author joahp
 */
public class LogInGUI extends javax.swing.JFrame 
{   
    public LogInGUI() {
        initComponents();
        errorLabel.setVisible(false);
        //TODO clear default text of text fields
    }
    
    public LogInGUI(Account acc, Member mem)
    {
        initComponents();
        displayNameField.setText(mem.getDisplayName());
        hhCodeField.setText(acc.getHouseholdCode());
        errorLabel.setText("There was an error accessing your account");
        errorLabel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        displayNameField = new javax.swing.JTextField();
        displayNameLabel = new javax.swing.JLabel();
        hhCodeLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        noAccLabel = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        hhCodeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Login");

        displayNameField.setText("M 1");
        displayNameField.setToolTipText("Enter your display name here");
        displayNameField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                displayNameFieldActionPerformed(evt);
            }
        });

        displayNameLabel.setText("Display Name:");

        hhCodeLabel.setText("Household Code:");

        signUpButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        signUpButton.setText("Sign Up!");
        signUpButton.setToolTipText("Please don't click. This has not been implemented yet");
        signUpButton.setPreferredSize(new java.awt.Dimension(50, 15));
        signUpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                signUpButtonActionPerformed(evt);
            }
        });

        noAccLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noAccLabel.setText("Don't have an account?");

        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logInButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("error Label");

        hhCodeField.setText("ABCDEFGHI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(noAccLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hhCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(hhCodeField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(logInButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hhCodeLabel)
                    .addComponent(hhCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logInButton)
                .addGap(16, 16, 16)
                .addComponent(noAccLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayNameFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_displayNameFieldActionPerformed
    {//GEN-HEADEREND:event_displayNameFieldActionPerformed
        //intentionally left blank
    }//GEN-LAST:event_displayNameFieldActionPerformed


    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add sign up functionality
    }

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        //get input from the text fields
        String dn = displayNameField.getText();
        String hhc = hhCodeField.getText();

        AccountDBH adbh = null;

        //check for empty text fields
        if (!dn.equals("") && !hhc.equals(""))
        {
            //try to make AccountDBH
            try
            {
                adbh = new AccountDBH();

            }
            //catch error and show ERROR
            //exit function
            catch (Exception ex)
            {
                errorLabel.setText("ERROR");
                errorLabel.setVisible(true);
                return;
            }

            //make sure AccountDBH is made
            if (adbh != null)
            {
                //see if the household code entered
                //is in the database
                if (adbh.isValidAccount(hhc))
                {
                    //make get account with the household code entered
                    Account acc = adbh.getAccount(hhc);
                    //see if the account has a member with the display name entered
                    if (acc.hasMember(dn))
                    {
                        //user has successfully logged in
                        //user is sent to the dashboard
                        this.dispose();
                        DashboardGUI dashboard = new DashboardGUI(acc, acc.getMember(dn));
                        dashboard.setVisible(true);
                    }
                    //there is no member with the display name entered
                    //tell user
                    else
                    {
                        errorLabel.setText("Incorrect display name");
                        errorLabel.setVisible(true);
                    }
                }
                //household code was not in the database
                //tell user
                else
                {
                    errorLabel.setText("Invalid household code");
                    errorLabel.setVisible(true);
                }
            }
        }
        //empty text field
        //show error message to user
        else
        {
            errorLabel.setText("Please input a Display Name and a Household Code");
            errorLabel.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField displayNameField;
    private javax.swing.JLabel displayNameLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField hhCodeField;
    private javax.swing.JLabel hhCodeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel noAccLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
