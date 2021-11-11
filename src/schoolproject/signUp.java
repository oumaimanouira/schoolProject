/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
    
public class signUp extends javax.swing.JFrame {
Connection con=null;
    Statement s;
    
    /**
     * Creates new form signUp
     */
    public signUp() {
        initComponents();
        con=new DbConnect().connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        signUpBtn = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        majorField = new javax.swing.JTextField();
        cinField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        birthDateField = new javax.swing.JTextField();
        genderBox = new javax.swing.JComboBox<>();
        gradeBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Sign Up");
        setPreferredSize(new java.awt.Dimension(688, 455));
        setResizable(false);
        getContentPane().setLayout(null);

        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        getContentPane().add(passwordField);
        passwordField.setBounds(360, 230, 300, 30);

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailField);
        emailField.setBounds(360, 170, 300, 30);

        signUpBtn.setBackground(new java.awt.Color(24, 150, 170));
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.setBorderPainted(false);
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBtnMouseClicked(evt);
            }
        });
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signUpBtn);
        signUpBtn.setBounds(460, 390, 100, 23);

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lastNameField);
        lastNameField.setBounds(520, 50, 140, 30);

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });
        getContentPane().add(phoneNumberField);
        phoneNumberField.setBounds(520, 110, 140, 30);

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameField);
        firstNameField.setBounds(360, 50, 140, 30);

        majorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorFieldActionPerformed(evt);
            }
        });
        getContentPane().add(majorField);
        majorField.setBounds(440, 350, 220, 30);

        cinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cinField);
        cinField.setBounds(360, 110, 140, 30);

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ageField);
        ageField.setBounds(360, 290, 60, 30);

        birthDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(birthDateField);
        birthDateField.setBounds(440, 290, 100, 30);

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        genderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderBox);
        genderBox.setBounds(560, 290, 100, 30);

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "A3" }));
        getContentPane().add(gradeBox);
        gradeBox.setBounds(360, 350, 60, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 280, 190, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 80, 140, 160);

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Major");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(440, 320, 130, 40);

        jLabel27.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Grade ");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(360, 320, 130, 40);

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Gender");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(560, 260, 80, 40);

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Date of birth");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(440, 260, 130, 40);

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Age");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(360, 260, 130, 40);

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Phone number\n");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(520, 80, 130, 40);

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setForeground(new java.awt.Color(0, 0, 54));
        loginBtn.setText("Login Page");
        loginBtn.setBorderPainted(false);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(110, 330, 100, 23);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("It's quick and easy. ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(100, 280, 130, 40);

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CIN ");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(360, 80, 130, 40);

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Last name");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(520, 20, 130, 40);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First name ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 20, 130, 40);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 210, 91, 16);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sign Up ");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(110, 240, 99, 29);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 140, 130, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg2.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, -16, 337, 450);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 375, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void majorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_majorFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void cinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderBoxActionPerformed

    private void birthDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateFieldActionPerformed

    private void signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseClicked
       String CIN=cinField.getText();
        String firstName=firstNameField.getText();
        String lastName=lastNameField.getText();
        String phoneNumber=phoneNumberField.getText();
        String email=emailField.getText();
        String studentPassword=passwordField.getText();
        String age=ageField.getText();
        String birthDate=birthDateField.getText();
        String gender=genderBox.getSelectedItem().toString();
        String grade=gradeBox.getSelectedItem().toString();
        String major=majorField.getText();

        String requete="insert into student(CIN,firstName,lastName,age,birthDate,gender,phoneNumber,email,grade,major,studentPassword)VALUES('"+CIN+"','"+firstName+"','"+lastName+"','"+age+"','"+birthDate+"','"+gender+"','"+phoneNumber+"','"+email+"','"+grade+"','"+major+"','"+studentPassword+"')";
        try
        {   
            s=con.createStatement();
            s.executeUpdate(requete);
            JOptionPane.showMessageDialog(null,"Successfully Registred");
            cinField.setText("");
            firstNameField.setText("");
            lastNameField.setText("");
            ageField.setText("");
            birthDateField.setText("");
            genderBox.setSelectedItem(2);
            phoneNumberField.setText("");
            emailField.setText("");
            gradeBox.setSelectedItem(2);
            majorField.setText("");
            passwordField.setText("");
          
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_signUpBtnMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
/* Set the Nimbus look and feel */

this.setVisible(false);
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() 
{
    
public void run() 
{
login loginPage = new login();
loginPage.setVisible(true);
}
});
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField birthDateField;
    private javax.swing.JTextField cinField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField majorField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
