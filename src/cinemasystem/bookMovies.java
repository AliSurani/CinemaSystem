/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemasystem;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class bookMovies extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public bookMovies() throws SQLException, ClassNotFoundException {
        initComponents();
        table.getTableHeader().setBackground(Color.orange);
        table.getTableHeader().setForeground(Color.black);
        Font font = new Font("Candara", Font.BOLD, 18);
        table.getTableHeader().setFont(font);
        table.getTableHeader().setSize(40, 40);
        
        tableUpdate();
        idTF.setEditable(false);
        titleTF.setEditable(false);
        genreTF.setEditable(false);
        ratingTF.setEditable(false);
        durationTF.setEditable(false);
        dateTF.setEditable(false);
        timeTF.setEditable(false);
        hallTF.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genreTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ratingTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        durationTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        timeTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        hallTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Movies");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("MOVIE SHOWS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 300, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 338, 10));

        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SHOW ID", "MOVIE TITLE", "GENRE", "RATING", "DURATION", "DATE", "SHOW TIME", "HALL CATEGORY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 1110, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("showID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        idTF.setBackground(new java.awt.Color(0, 0, 0));
        idTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idTF.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 88, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Movie Title :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 436, -1, -1));

        titleTF.setBackground(new java.awt.Color(0, 0, 0));
        titleTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleTF.setForeground(new java.awt.Color(255, 255, 255));
        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });
        getContentPane().add(titleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 434, 284, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Genre :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 436, -1, -1));

        genreTF.setBackground(new java.awt.Color(0, 0, 0));
        genreTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genreTF.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(genreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 434, 247, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Rating :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, -1, -1));

        ratingTF.setBackground(new java.awt.Color(0, 0, 0));
        ratingTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ratingTF.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ratingTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 434, 81, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Duration :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        durationTF.setBackground(new java.awt.Color(0, 0, 0));
        durationTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        durationTF.setForeground(new java.awt.Color(255, 255, 255));
        durationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTFActionPerformed(evt);
            }
        });
        getContentPane().add(durationTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 499, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Date :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 501, -1, -1));

        dateTF.setBackground(new java.awt.Color(0, 0, 0));
        dateTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dateTF.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 499, 284, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Show Time :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        timeTF.setBackground(new java.awt.Color(0, 0, 0));
        timeTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        timeTF.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(timeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 499, 136, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Hall Category :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        hallTF.setBackground(new java.awt.Color(0, 0, 0));
        hallTF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hallTF.setForeground(new java.awt.Color(255, 255, 255));
        hallTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallTFActionPerformed(evt);
            }
        });
        getContentPane().add(hallTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1036, 499, 133, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("CLICK ON THE MOVIE SHOW TO BOOK TICKETS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 112, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 385, -1, -1));

        bookButton.setBackground(new java.awt.Color(0, 255, 0));
        bookButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/add-video (1).png"))); // NOI18N
        bookButton.setBorderPainted(false);
        bookButton.setContentAreaFilled(false);
        bookButton.setFocusPainted(false);
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 100, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 132, 370, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 290, -1));

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/previous (2) (1).png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        jLabel13.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BOOK SHOW");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 610, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/movies.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void hallTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallTFActionPerformed

    private void durationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTFActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        if (!idTF.getText().isEmpty()) {
            movie m = new movie(Integer.parseInt(idTF.getText()), titleTF.getText(), genreTF.getText(), ratingTF.getText(), durationTF.getText(), dateTF.getText(), timeTF.getText(), hallTF.getText());
            new customerDetail(m).setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Movie Show to proceed.");

        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        int index = table.getSelectedRow();
        titleTF.setText(model.getValueAt(index, 1).toString());
        genreTF.setText(model.getValueAt(index, 2).toString());
        ratingTF.setText(model.getValueAt(index, 3).toString());
        durationTF.setText(model.getValueAt(index, 4).toString());
        dateTF.setText(model.getValueAt(index, 5).toString());
        timeTF.setText(model.getValueAt(index, 6).toString());
        hallTF.setText(model.getValueAt(index, 7).toString());
        idTF.setText(model.getValueAt(index, 0).toString());
        
    }//GEN-LAST:event_tableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    public void tableUpdate() throws SQLException, ClassNotFoundException
    {
 
        
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", "cinema", "cinema");
            pst = con.prepareStatement("select * from movies order by show_id");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            DefaultTableModel dft = (DefaultTableModel)table.getModel();
            dft.setRowCount(0);
            while(rs.next())
            {
                Object[] array = new Object[8];
                
                    array[0] = rs.getInt("show_ID");
                    array[1] = rs.getString("title");
                    array[2] = rs.getString("genre");                   
                    array[3] = rs.getString("rating");
                    
                    //Object[] duration = rs.getString("duration").split(" ");
                    array[4] = rs.getString("hours") + " hours " + rs.getString("minutes") + " mins";
                    //Object[] date = rs.getString("datee").split(" ");
                    array[5] = rs.getInt("day") + "-" + rs.getString("month") + "-2021";
                    array[6] = rs.getString("time");
                    array[7] = rs.getString("hall_category");
               
                dft.addRow(array);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        /*try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Movies.accdb");
            pst = con.prepareStatement("select * from movies");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            DefaultTableModel dft = (DefaultTableModel)table.getModel();
            dft.setRowCount(0);
            while(rs.next())
            {
                Object[] array = new Object[8];
                
                    array[0] = rs.getString("showID");
                    array[1] = rs.getString("title");
                    array[2] = rs.getString("genre");                   
                    array[3] = rs.getString("rating");
                    Object[] duration = rs.getString("duration").split(" ");
                    array[4] = duration[0] + " hours " + duration[1] + " mins";
                    Object[] date = rs.getString("datee").split(" ");
                    array[5] = date[0];
                    array[6] = rs.getString("time");
                    array[7] = rs.getString("hall");
               
                dft.addRow(array);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bookMovies.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            
      
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(bookMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new bookMovies().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(bookMovies.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(bookMovies.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookButton;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField durationTF;
    private javax.swing.JTextField genreTF;
    private javax.swing.JTextField hallTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField ratingTF;
    private javax.swing.JTable table;
    private javax.swing.JTextField timeTF;
    private javax.swing.JTextField titleTF;
    // End of variables declaration//GEN-END:variables
}
