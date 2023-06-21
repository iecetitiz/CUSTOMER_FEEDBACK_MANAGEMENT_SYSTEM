package Screens;

//imports libraries
import Connection.My_Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteFeedback extends javax.swing.JFrame {

    //Holds darkness information from Communication class
    boolean isDark = Communication.isDark();

    //Holds language information from Communication class
    boolean isTurkish = Communication.isTurkish();

    //Holds customer ID 
    int customerID = Communication.getCustomerID();

    public DeleteFeedback() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton_delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton_mainPage = new javax.swing.JButton();
        jButton_darkThemeButton = new javax.swing.JButton();
        jButton_lightThemeButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 204, 113));
        jPanel1.setPreferredSize(new java.awt.Dimension(562, 561));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter your FeedbackID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Feedback ID:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton_mainPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_mainPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_orange.png"))); // NOI18N
        jButton_mainPage.setText("Main Page");
        jButton_mainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mainPageActionPerformed(evt);
            }
        });

        jButton_darkThemeButton.setBackground(new java.awt.Color(51, 51, 51));
        jButton_darkThemeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_darkThemeButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton_darkThemeButton.setText("DarkTheme");
        jButton_darkThemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_darkThemeButtonActionPerformed(evt);
            }
        });

        jButton_lightThemeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_lightThemeButton.setText("LightTheme");
        jButton_lightThemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lightThemeButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("TR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("EN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_mainPage))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_lightThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_darkThemeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_darkThemeButton)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_lightThemeButton)
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton_mainPage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        //Holds FeedbackID which from FeedbackID textfield
        String feedbackID = jTextField1.getText();

        //If feedbackID field is empty, a warning message appears on the page
        if (feedbackID.equals("")) {
            if (Communication.isTurkish()) {
                //If Turkish language is selected sets warningtext label in Turkish
                jLabel4.setText("Yorum ID boş bırakılamaz!");
            } else {
                //If Turkish language is not selected sets warningtext label in English
                jLabel4.setText("Feedback field can not be empty!");
            }
            //If feedbackID field is not empty, a warning message appears on the page
        } else {
            try {
                //Connects relevant database 
                My_Connection connection = new My_Connection("customerfeedbackmanagement");
                java.sql.Statement stm = connection.getcon().createStatement();

                //SQL query finds the FeedbackID whether it exists on Database or not
                //String sql = "select * from feedback where id_feedback = '" + feedbackID + "'  ";
                String sql = "select * from feedback where id_feedback = '" + feedbackID + "'  and id_customer='" + customerID + "'";
                //ResultSet object holds the tabular data returned by the method that execute the sql statements which quires the database 
                ResultSet rs = stm.executeQuery(sql);

                //Checks whether FeedbackID exists on Database or not
                //rs.next() returns true if stm.executeQuery(sql) find a record that satisfies the sql query, otherwise it returns false
                if (rs.next()) {
                    //Query for deleting the feedback table based on the data that user choose from the UpdateFeedback screen
                    String query = "delete from feedback where"
                            + " id_feedback='" + feedbackID + "';";

                    try {
                        //Updates the feedback table and deletes Feedback based on the entered data that user enters the DeleteFeedback screen
                        stm.executeUpdate(query);
                    } catch (SQLException ex) {
                        //Throws an exception if a database query problem occurs
                        Logger.getLogger(UpdateFeedback.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (Communication.isTurkish()) {
                        //If Turkish language is selected sets warningtext label in Turkish
                        jLabel4.setText("Başarıyla Silindi!");
                    } else {
                        //If Turkish language is not selected sets warningtext label in English
                        jLabel4.setText("Deleted Successfully!");
                    }

                    //If there is no FeedbackID that exists on Database, a message appears on the page
                } else {
                    if (Communication.isTurkish()) {
                        //If Turkish language is selected sets warningtext label in Turkish
                        jLabel4.setText("Böyle bir Yorum ID bulunmamaktadır!");
                    } else {
                        //If Turkish language is not selected sets warningtext label in English
                        jLabel4.setText("There is no feedback with this Feedback ID!");
                    }

                }
            } catch (SQLException ex) {
                //Throws an exception if a database query problem occurs
                Logger.getLogger(UpdateFeedback.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton_mainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mainPageActionPerformed
        //Delete page will switches to the SelectProcess screen
        SelectProcess sp = new SelectProcess();
        sp.show();

        //Disappears current page
        dispose();
    }//GEN-LAST:event_jButton_mainPageActionPerformed

    private void jButton_darkThemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_darkThemeButtonActionPerformed
        //Calls setDark method
        setDark();
    }//GEN-LAST:event_jButton_darkThemeButtonActionPerformed

    private void jButton_lightThemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lightThemeButtonActionPerformed
        //Calls setLight method
        setLight();
    }//GEN-LAST:event_jButton_lightThemeButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Calls setTurkish method
        setTurkish();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Calls setEnglish method
        setEnglish();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFeedback().setVisible(true);
            }
        });
    }

    //Gives names to the components
    private void setComponentsNames() {
        jLabel4.setName("warningText");
        jTextField1.setName("feedBackID");
        jButton_delete.setName("deleteButton");

    }

    public void setDark() {
        //Sets color of panel as black
        jPanel1.setBackground(Color.black);

        //Sets isDark variable as True in Communication class
        Communication.setDarkness(true);
    }

    public void setLight() {
        //Sets color of panel as light
        jPanel1.setBackground(new Color(46, 204, 113));

        //Sets isDark variable as False in Communication class
        Communication.setDarkness(false);
    }

    public void setTurkish() {
        //Sets text of components as Turkish
        jLabel1.setText("Lütfen Yorum ID giriniz");
        jLabel3.setText("Yorum ID:");
        jButton_delete.setText("Sil");
        jButton_mainPage.setText("Ana Sayfa");
        jButton_darkThemeButton.setText("KoyuTema");
        jButton_lightThemeButton.setText("AçıkTema");

        //Sets isTurkish variable as True in Communication class
        Communication.setLanguage(true);
    }

    public void setEnglish() {
        //Sets text of components as English
        jLabel1.setText("Please enter your FeedbackID");
        jLabel3.setText("Feedback ID:");
        jButton_delete.setText("Delete");
        jButton_mainPage.setText("Main Page");
        jButton_darkThemeButton.setText("DarkTheme");
        jButton_lightThemeButton.setText("LightTheme");

        //Sets isTurkish variable as False in Communication class
        Communication.setLanguage(false);
    }
    
    //Sets customer ID on the Communication page
     public void setCustomerID(int id) {
        Communication.setCustomerID(id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_darkThemeButton;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_lightThemeButton;
    private javax.swing.JButton jButton_mainPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
