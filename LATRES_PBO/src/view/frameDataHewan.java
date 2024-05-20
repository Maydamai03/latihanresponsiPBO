/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JTable;
import controller.datahewancontroller;
import javax.swing.JTextField;

public class frameDataHewan extends javax.swing.JFrame {
        datahewancontroller dc ;
    public frameDataHewan() {
        initComponents();
        dc = new datahewancontroller(this);
        dc.isitabel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataHewan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTxtNamaHewan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTxtKelas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTxtMakanan = new javax.swing.JTextField();
        tambahbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        hapusbtn = new javax.swing.JButton();
        keMenubtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTxtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelDataHewan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelDataHewan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataHewanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataHewan);

        jLabel1.setText("Nama Hewan :");

        jLabel2.setText("Kelas Hewan :");

        jLabel3.setText("Jenis Makanan :");

        tambahbtn.setText("Tambah");
        tambahbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahbtnActionPerformed(evt);
            }
        });

        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        hapusbtn.setText("Hapus");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        keMenubtn.setText("Kembali");
        keMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keMenubtnActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        JTxtID.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(tambahbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keMenubtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtID)
                    .addComponent(JTxtNamaHewan))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtNamaHewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tambahbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(keMenubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelDataHewanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataHewanMouseClicked
          int baris = tabelDataHewan.getSelectedRow();
    if (baris != -1) { // Pastikan baris yang dipilih valid (tidak -1)
         
        int id = Integer.parseInt(tabelDataHewan.getValueAt(baris, 0).toString());
        String nama = tabelDataHewan.getValueAt(baris, 1).toString();
        String kelas = tabelDataHewan.getValueAt(baris, 2).toString();
        String makanan = tabelDataHewan.getValueAt(baris, 3).toString();
        JTxtID.setText(String.valueOf(id));
        JTxtNamaHewan.setText(nama);
        JTxtKelas.setText(kelas);
        JTxtMakanan.setText(makanan);
        //JTxtakting.setText(String.valueOf(akting));
    }
    }//GEN-LAST:event_tabelDataHewanMouseClicked

    private void tambahbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahbtnActionPerformed
        dc.insert();
        dc.isitabel();
    }//GEN-LAST:event_tambahbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        dc.update();
        dc.isitabel();
    }//GEN-LAST:event_editbtnActionPerformed
 
    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
        dc.delete();
        dc.isitabel();
    }//GEN-LAST:event_hapusbtnActionPerformed

    private void keMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keMenubtnActionPerformed
        frameMenu v1 = new frameMenu();
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_keMenubtnActionPerformed

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
            java.util.logging.Logger.getLogger(frameDataHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameDataHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameDataHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameDataHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDataHewan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtID;
    private javax.swing.JTextField JTxtKelas;
    private javax.swing.JTextField JTxtMakanan;
    private javax.swing.JTextField JTxtNamaHewan;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton hapusbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keMenubtn;
    private javax.swing.JTable tabelDataHewan;
    private javax.swing.JButton tambahbtn;
    // End of variables declaration//GEN-END:variables

    
    
    public JTable getTabelDataHewan() {
        return tabelDataHewan;
    }

    public void setTabelDataHewan(JTable tabelDataHewan) {
        this.tabelDataHewan = tabelDataHewan;
    }

    public JTextField getJTxtKelas() {
        return JTxtKelas;
    }

    public void setJTxtKelas(JTextField JTxtKelas) {
        this.JTxtKelas = JTxtKelas;
    }

    public JTextField getJTxtMakanan() {
        return JTxtMakanan;
    }

    public void setJTxtMakanan(JTextField JTxtMakanan) {
        this.JTxtMakanan = JTxtMakanan;
    }

    public JTextField getJTxtNamaHewan() {
        return JTxtNamaHewan;
    }

    public void setJTxtNamaHewan(JTextField JTxtNamaHewan) {
        this.JTxtNamaHewan = JTxtNamaHewan;
    }

    public JTextField getJTxtID() {
        return JTxtID;
    }

    public void setJTxtID(JTextField JTxtID) {
        this.JTxtID = JTxtID;
    }
    

    
}
