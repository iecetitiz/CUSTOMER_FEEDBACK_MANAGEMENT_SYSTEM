package Screens;

//imports libraries
import Connection.My_Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mailConfig.Mail;

public class Registration extends javax.swing.JFrame {

    //Holds darkness information from Communication class
    boolean isDark = Communication.isDark();

    //Holds language information from Communication class
    boolean isTurkish = Communication.isTurkish();

    public Registration() {
        initComponents();

        //Calls setComponentsNames method
        setComponentsNames();

        //Checks language whether it is Turkish or not
        //If Turkish option is selected from the application page, sets language as Turkish 
        if (isTurkish) {
            //Calls setTurkish method
            setTurkish();
        } else {
            //Calls setEnglish method
            setEnglish();
        }

        //Checks darkness whether it is Dark or not
        //If DarkTheme option is selected from the application page, sets background color as black
        if (isDark) {
            //Calls setDark method
            setDark();
        } else {
            //Calls setLight method
            setLight();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_createAccount = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jButton_signUp = new javax.swing.JButton();
        jLabel_userName = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jLabel_warningLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton_darkThemeButton = new javax.swing.JButton();
        jButton_lightThemeButton = new javax.swing.JButton();
        jPasswordField_passwordField = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton_signUp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(543, 467));

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(602, 517));

        jLabel_createAccount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_createAccount.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_createAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_createAccount.setText("Create an Account");

        jButton_signUp.setBackground(new java.awt.Color(0, 250, 154));
        jButton_signUp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_signUp.setText("Sign Up");
        jButton_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signUpActionPerformed(evt);
            }
        });

        jLabel_userName.setText("username");

        jLabel_email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_email.setText("email");

        jLabel_password.setText("password");

        jLabel_warningLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_warningLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("TR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("EN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_darkThemeButton.setBackground(new java.awt.Color(51, 51, 51));
        jButton_darkThemeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_darkThemeButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton_darkThemeButton.setText("DarkTheme");
        jButton_darkThemeButton.setMaximumSize(new java.awt.Dimension(104, 23));
        jButton_darkThemeButton.setMinimumSize(new java.awt.Dimension(104, 23));
        jButton_darkThemeButton.setPreferredSize(new java.awt.Dimension(104, 23));
        jButton_darkThemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_darkThemeButtonActionPerformed(evt);
            }
        });

        jButton_lightThemeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_lightThemeButton.setText("LightTheme");
        jButton_lightThemeButton.setMaximumSize(new java.awt.Dimension(104, 23));
        jButton_lightThemeButton.setMinimumSize(new java.awt.Dimension(104, 23));
        jButton_lightThemeButton.setPreferredSize(new java.awt.Dimension(104, 23));
        jButton_lightThemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lightThemeButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 255, 153));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 153, 0));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton_signUp1.setBackground(new java.awt.Color(0, 250, 154));
        jButton_signUp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_signUp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_1.png"))); // NOI18N
        jButton_signUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signUp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_lightThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_userName)
                            .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel_password, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_username)
                    .addComponent(jTextField_email)
                    .addComponent(jPasswordField_passwordField)
                    .addComponent(jButton_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_signUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_darkThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton_darkThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_lightThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_userName)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_email))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addComponent(jLabel_warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_signUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signUpActionPerformed

        //Holds email input that is entered 
        String enteredEmail = jTextField_email.getText();

        //Holds username input that is entered 
        String enteredUsername = jTextField_username.getText();

        //Holds password input that is entered 
        String enteredPassword = new String(jPasswordField_passwordField.getPassword());

        //Sets warning message based on username and password status
        //If the username, password or email is empty, a warning message appears
        if (enteredUsername.equals("") || enteredPassword.equals("") || enteredEmail.equals("")) {
            if (Communication.isTurkish()) {
                //If Turkish language is selected sets warningtext label in Turkish
                jLabel_warningLabel.setText("Tüm alanları doldurunuz!");
            } else {
                //If English language is selected sets warningtext label in English
                jLabel_warningLabel.setText("Please fill all fields!");
            }
            //If the username, password or email is not empty, a warning message appears
        } else {
            //Checks length of the password 
            //If length of the password is less than 8, a warning message appears
            if (enteredPassword.length() < 8) {
                if (Communication.isTurkish()) {
                    //If Turkish language is selected sets warningtext label in Turkish
                    jLabel_warningLabel.setText("Şifre en az 8 karakterden oluşmalı!");

                    //A message dialog pane appears
                    JOptionPane.showMessageDialog(null, "Şifre en az 8 karakterden oluşmalı!");
                } else {
                    //If English language is selected sets warningtext label in English
                    jLabel_warningLabel.setText("Password should be at least 8 characters!");

                    //A message dialog pane appears
                    JOptionPane.showMessageDialog(null, "Password should be at least 8 characters!");
                }
                //If all fields are filled and length of password is equal or grater than 8, SQL query runs
            } else {

                //Connects relevant database
                My_Connection connection = new My_Connection("customerfeedbackmanagement");

                try {
                    //stm is for executing the SQL query
                    java.sql.Statement stm = connection.getcon().createStatement();

                    //SQL query finds the username and email that user entered
                    String sql = "select * from customer where username = '" + enteredUsername + "'  or email='" + enteredEmail + "'";

                    //ResultSet object holds the tabular data returned by the method that execute the sql statements which quires the database 
                    ResultSet rs = stm.executeQuery(sql);

                    //Checks whether username and password match with the username or email from the database
                    //rs.next() returns true if stm.executeQuery(sql) find a record that satisfies the sql query, otherwise it returns false
                    if (rs.next()) {
                        //After sending mail successfully, an informing message appears on the page 
                        if (Communication.isTurkish()) {
                            //If Turkish language is selected sets warningtext label in Turkish
                            jLabel_warningLabel.setText("Kullanıcı adı veya email zaten kayıtlı!");
                        } else {
                            //If English language is selected sets warningtext label in English
                            jLabel_warningLabel.setText("Username or email is already exists!");
                        }

                    } else {
                        //SQL query inserts the username, password, email that user entered to the database
                        String query = "Insert Into customer (username,password,email) VALUES(" + "'" + enteredUsername + "'," + "'" + enteredPassword + "'," + "'" + enteredEmail + "')";

                        //stm is for executing the SQL query
                        stm.executeUpdate(query);

                        //Creates a Mail object that holds the methods which includes Mail Configuration
                        Mail mailSender = new Mail();

                        //Sends an email to the relevant company which includes feedback
                        mailSender.sendMail("Registration", "Here is the Link!");

                        //After sending mail successfully, an informing message appears on the page 
                        if (Communication.isTurkish()) {
                            //If Turkish language is selected sets warningtext label in Turkish
                            jLabel_warningLabel.setText("Hesabınız Oluşturuldu, Lütfen Emailinize Gönderdiğimiz Linki Onaylayınız!");
                        } else {
                            //If Turkish language is not selected sets warningtext label in English
                            jLabel_warningLabel.setText("Succesfully Signed Up, Please Confirm The Link We Have Sent To Your Email!");
                        }

                    }

                } catch (SQLException ex) {
                    //Throws an exception if a database query problem occurs
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }//GEN-LAST:event_jButton_signUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Calls setTurkish method
        setTurkish();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Calls setEnglish method
        setEnglish();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_darkThemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_darkThemeButtonActionPerformed
        //Calls setDark method
        setDark();
    }//GEN-LAST:event_jButton_darkThemeButtonActionPerformed

    private void jButton_lightThemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lightThemeButtonActionPerformed
        //Calls setLight method
        setLight();
    }//GEN-LAST:event_jButton_lightThemeButtonActionPerformed

    //Shows or hides the password based on the status of checkbox
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //If checkbox is selected shows the password characters
        if (jCheckBox1.isSelected()) {
            jPasswordField_passwordField.setEchoChar((char) 0);
            
        //If checkbox is not selected hides the password characters    
        } else {           
            jPasswordField_passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton_signUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signUp1ActionPerformed
        //Registration page will switches to the Login page
        LoginPage lp = new LoginPage();
        lp.show();

        //Disappears current page
        dispose();
    }//GEN-LAST:event_jButton_signUp1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    //Gives names to the components
    private void setComponentsNames() {
        jButton_signUp.setName("signUpButton");
        jLabel_warningLabel.setName("warningText");
        jTextField_email.setName("email");
        jTextField_username.setName("username");
        jPasswordField_passwordField.setName("password");
    }

    public void setTurkish() {
        //Sets text of components as Turkish
        jLabel_createAccount.setText("Hesap Oluştur");
        jLabel_email.setText("eposta");
        jLabel_userName.setText("kullanıcı adı");
        jLabel_password.setText("parola");
        jButton_signUp.setText("Kaydol");
        jButton_darkThemeButton.setText("KoyuTema");
        jButton_lightThemeButton.setText("AçıkTema");
        jCheckBox1.setText("Şifreyi Göster");

        //Sets isTurksh variable as True in Communication class
        Communication.setLanguage(true);
    }

    public void setEnglish() {
        //Sets text of components as English
        jLabel_createAccount.setText("Create an Account");
        jLabel_email.setText("email");
        jLabel_userName.setText("username");
        jLabel_password.setText("password");
        jButton_signUp.setText("Sign Up");
        jButton_darkThemeButton.setText("DarkTheme");
        jButton_lightThemeButton.setText("LightTheme");
        jCheckBox1.setText("Show Password");

        //Sets isTurksh variable as False in Communication class
        Communication.setLanguage(false);
    }

    public void setDark() {
        //Sets color of panel as black
        jPanel1.setBackground(Color.black);

        //Sets color of "Create Account" text as green
        jLabel_createAccount.setForeground(new Color(0, 255, 153));

        //Sets color of "email" text as green
        jLabel_email.setForeground(new Color(0, 255, 153));

        //Sets color of "password" text as green
        jLabel_password.setForeground(new Color(0, 255, 153));

        //Sets color of "username" text as green
        jLabel_userName.setForeground(new Color(0, 255, 153));

        //Sets color of "warning" text as green
        jLabel_warningLabel.setForeground(new Color(0, 255, 153));

        //Sets isDark variable as True in Communication class
        Communication.setDarkness(true);
    }

    public void setLight() {
        //Sets color of panel as light
        jPanel1.setBackground(new Color(0, 255, 153));

        //Sets color of "Create Account" text as black
        jLabel_createAccount.setForeground(Color.black);

        //Sets color of "email" text as black
        jLabel_email.setForeground(Color.black);

        //Sets color of "password" text as black
        jLabel_password.setForeground(Color.black);

        //Sets color of "username" text as black
        jLabel_userName.setForeground(Color.black);

        //Sets color of "warning" text as black
        jLabel_warningLabel.setForeground(Color.black);

        //Sets isDark variable as False in Communication class
        Communication.setDarkness(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_darkThemeButton;
    private javax.swing.JButton jButton_lightThemeButton;
    private javax.swing.JButton jButton_signUp;
    private javax.swing.JButton jButton_signUp1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel_createAccount;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JLabel jLabel_warningLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_passwordField;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
