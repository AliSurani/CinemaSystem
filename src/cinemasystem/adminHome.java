/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemasystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public adminHome() {
        initComponents();
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
        jSeparator1 = new javax.swing.JSeparator();
        addMoviesButton = new javax.swing.JButton();
        updateMoviesButton = new javax.swing.JButton();
        btnUpdateHalls = new javax.swing.JButton();
        btnUpdateCredentials = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("DASHBOARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 260, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 250, 10));

        addMoviesButton.setBackground(new java.awt.Color(204, 255, 204));
        addMoviesButton.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        addMoviesButton.setForeground(new java.awt.Color(255, 255, 255));
        addMoviesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/addmovies.jpeg"))); // NOI18N
        addMoviesButton.setText("  Add Movies");
        addMoviesButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addMoviesButton.setContentAreaFilled(false);
        addMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoviesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addMoviesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, 100));

        updateMoviesButton.setBackground(new java.awt.Color(255, 255, 255));
        updateMoviesButton.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        updateMoviesButton.setForeground(new java.awt.Color(255, 255, 255));
        updateMoviesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\newac\\Downloads\\updatemovies.jpeg")); // NOI18N
        updateMoviesButton.setText(" Update Movies");
        updateMoviesButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateMoviesButton.setContentAreaFilled(false);
        updateMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMoviesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateMoviesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 230, 100));

        btnUpdateHalls.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateHalls.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnUpdateHalls.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateHalls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/updatehalls.jpeg"))); // NOI18N
        btnUpdateHalls.setText("Update Halls");
        btnUpdateHalls.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnUpdateHalls.setContentAreaFilled(false);
        btnUpdateHalls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHallsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateHalls, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 230, 100));

        btnUpdateCredentials.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateCredentials.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnUpdateCredentials.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCredentials.setIcon(new javax.swing.ImageIcon("C:\\Users\\newac\\Downloads\\updatecredentials.jpeg")); // NOI18N
        btnUpdateCredentials.setText("Update Credentials");
        btnUpdateCredentials.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnUpdateCredentials.setContentAreaFilled(false);
        btnUpdateCredentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCredentialsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateCredentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 230, 100));

        logoutButton.setBackground(new java.awt.Color(204, 0, 0));
        logoutButton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/logout.jpeg"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setContentAreaFilled(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 50));

        Orders.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        Orders.setForeground(new java.awt.Color(255, 255, 255));
        Orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/bookinghistory.jpeg"))); // NOI18N
        Orders.setText("Booking History");
        Orders.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Orders.setContentAreaFilled(false);
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });
        getContentPane().add(Orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 230, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\newac\\Downloads\\WhatsApp Image 2021-12-08 at 9.00.32 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoviesButtonActionPerformed
        new addMovies().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addMoviesButtonActionPerformed

    private void btnUpdateHallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHallsActionPerformed
        try {
            new editHall().setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateHallsActionPerformed

    private void btnUpdateCredentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCredentialsActionPerformed
        try {
            new updateCredentials().setVisible(true);
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateCredentialsActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void updateMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMoviesButtonActionPerformed
        try {
            new updateMovies().setVisible(true);
            this.setVisible(false);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_updateMoviesButtonActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        try {
            // TODO add your handling code here:
            new BookingHistory().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_OrdersActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Orders;
    private javax.swing.JButton addMoviesButton;
    private javax.swing.JButton btnUpdateCredentials;
    private javax.swing.JButton btnUpdateHalls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton updateMoviesButton;
    // End of variables declaration//GEN-END:variables
}
