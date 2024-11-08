/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import kelas.user;


public class frameuser extends javax.swing.JFrame {

   
    public frameuser() {
        initComponents();
        loadTable();
    }
    void loadTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User Name");
        model.addColumn("email");
        model.addColumn("full name");
        model.addColumn("Status");

        try {
            user us = new user();
            ResultSet data = us.tampilUser();
            
            while(data.next()){
                model.addRow(new Object[]{
                data.getString("user_name"),
                data.getString("user_email"),
                data.getString("user_fullname"),
                data.getInt("user_status") == 1 ? "ACTIVE" : "INACTIVE"
                });
                
            }
            
        } catch (SQLException sQLException) {
            
        }
        
        dUser.setModel(model);
    
        
    }
    
    void reset(){
        bUSER.setText(null);
        bEMAIL.setText(null);
        bPASSWORD.setText(null);
        bFULLNAME.setText(null);
        bUSER.setEditable(true);
        
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        ftambah = new javax.swing.JButton();
        bUSER = new javax.swing.JTextField();
        bEMAIL = new javax.swing.JTextField();
        bPASSWORD = new javax.swing.JTextField();
        bFULLNAME = new javax.swing.JTextField();
        fSTATUS = new javax.swing.JComboBox<>();
        fhapus = new javax.swing.JButton();
        fubah = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        dUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel1.setText("USER");
        jlabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlabel2.setText("EMAIL");

        jlabel3.setText("PASSWORD");

        jlabel4.setText("FULLNAME");

        jlabel5.setText("STATUS");

        ftambah.setText("TAMBAH");
        ftambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftambahActionPerformed(evt);
            }
        });

        bUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUSERActionPerformed(evt);
            }
        });

        bFULLNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFULLNAMEActionPerformed(evt);
            }
        });

        fSTATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aktif", "tidak aktif" }));
        fSTATUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSTATUSActionPerformed(evt);
            }
        });

        fhapus.setText("HAPUS");
        fhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fhapusActionPerformed(evt);
            }
        });

        fubah.setText("UBAH");
        fubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fubahActionPerformed(evt);
            }
        });

        dUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dUser.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dUserAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dUserMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(dUser);

        jLabel1.setText("USER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlabel5)
                                    .addComponent(jlabel4)
                                    .addComponent(jlabel3)
                                    .addComponent(jlabel2)
                                    .addComponent(jlabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ftambah)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fubah, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bFULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(bUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(bEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel3)
                    .addComponent(bPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel4)
                    .addComponent(bFULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel5)
                    .addComponent(fSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftambah)
                    .addComponent(fhapus)
                    .addComponent(fubah))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fSTATUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSTATUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fSTATUSActionPerformed

    private void bFULLNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFULLNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFULLNAMEActionPerformed

    private void fhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fhapusActionPerformed
        try {
            
            user usr = new user();
            usr.setUser_name(bUSER.getText());
            usr.hapusdata();
        } catch (SQLException sQLException) {
            
        }
        
        reset();
        loadTable();
        
    }//GEN-LAST:event_fhapusActionPerformed

    private void jlabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabel1AncestorAdded

    private void ftambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftambahActionPerformed
        try {
            
            user user = new user();
            user.setUser_name(bUSER.getText());
            user.setUser_email(bEMAIL.getText());
            user.setUser_password(bPASSWORD.getText());
            user.setUser_fullname(bFULLNAME.getText());
            
            if (fSTATUS.getSelectedItem().equals("ACTIVE")) {
                user.setUser_status(1);
            } else {
                user.setUser_status(0);
            }
            
            user.tambahUser();
            
        } catch (Exception sQLException) {
        }


        loadTable();
        reset ();
    }//GEN-LAST:event_ftambahActionPerformed
           
    private void fubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fubahActionPerformed
        try {
            user usr = new  user();
            usr.setUser_name(bUSER.getText());
            usr.setUser_fullname(bFULLNAME.getText());
            usr.setUser_email(bEMAIL.getText());
            usr.setUser_password(bPASSWORD.getText());
            if (fSTATUS.getSelectedItem().equals("ACTIVE")){
                usr.setUser_status(1);
            }else {
                usr.setUser_status(0);
            }
            
            usr.ubahData();
        } catch (SQLException sQLException) {
        }
        
        
        reset();
        loadTable();
    }//GEN-LAST:event_fubahActionPerformed

    private void bUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUSERActionPerformed
      

    }//GEN-LAST:event_bUSERActionPerformed

    private void dUserAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dUserAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserAncestorAdded

    private void dUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dUserMouseClicked
        int baris = dUser.rowAtPoint(evt.getPoint());
        String username = dUser.getValueAt(baris,0).toString();
        String email = dUser.getValueAt(baris, 1).toString();
        String fullname = dUser.getValueAt(baris, 2).toString();
        String status = dUser.getValueAt(baris, 3).toString();
        
        bUSER.setText(username);
        bUSER.setEditable(false);
        bEMAIL.setText(email);
        bFULLNAME.setText(fullname);
        fSTATUS.setSelectedItem(status);
        
       

    }//GEN-LAST:event_dUserMouseClicked


        

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
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameuser().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bEMAIL;
    private javax.swing.JTextField bFULLNAME;
    private javax.swing.JTextField bPASSWORD;
    private javax.swing.JTextField bUSER;
    private javax.swing.JTable dUser;
    private javax.swing.JComboBox<String> fSTATUS;
    private javax.swing.JButton fhapus;
    private javax.swing.JButton ftambah;
    private javax.swing.JButton fubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    // End of variables declaration//GEN-END:variables
}

