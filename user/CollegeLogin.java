/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Esha_1
 */
public class CollegeLogin extends javax.swing.JFrame {

    /**
     * Creates new form CollegeLogin
     */
    public CollegeLogin() {
        initComponents();
         getContentPane().setBackground(Color.LIGHT_GRAY);
          Date d=new Date();
       datelbl.setText(d.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        collusername = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        collpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        datelbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("College Login Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 0, -1, -1));

        jLabel2.setText("Enter Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 58, -1, -1));

        jLabel3.setText("Enter Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 118, -1, -1));

        collusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collusernameActionPerformed(evt);
            }
        });
        getContentPane().add(collusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 58, 100, -1));

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 178, -1, -1));
        getContentPane().add(collpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 108, 100, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("FORGOT PASSWORD");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
        getContentPane().add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 270, 20));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("All Fields Are Mandatory");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
       Connection con=null;
       ResultSet rs=null;
       Statement stmt=null;
        String name=collusername.getText();
       String pswrd=collpassword.getText();
        if(collusername.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"username should not be null");
       }
       else if(collpassword.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"password should not be null");
           
       }
       else if(!name.matches("[a-zA-Z_]+"))
       {
            JOptionPane.showMessageDialog(this,"username Should not contain number");
       }
     else if(pswrd.length()<6)
         
              {
                 JOptionPane.showMessageDialog(this,"Password Should be minimum 6 characters");
              }
        else
        {
      
       String sql="select * from collegeinfo where cusername ='"+collusername.getText()+"' and cpassword='"+collpassword.getText()+"'";
       try{
           con=ConnectionManager.getConnection();
           stmt=con.createStatement();
           rs=stmt.executeQuery(sql);
       
           if(rs.next())
           {
        
               JOptionPane.showMessageDialog(this, "login success");
               sessionclass s=new sessionclass();
               s.setusername(rs.getString(1));
                 new options().setVisible(true);
                 dispose();
            }
          else
            {
                JOptionPane.showMessageDialog(this,"Login Failed");
                jButton1.setEnabled(true);
                
            }
          }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e);
       }
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ques().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void collusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collusernameActionPerformed

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
            java.util.logging.Logger.getLogger(CollegeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField collpassword;
    private javax.swing.JTextField collusername;
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbtn;
    // End of variables declaration//GEN-END:variables
}