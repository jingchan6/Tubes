/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
/**
 * @author DZGIGABYTE
 */
public class menuhome extends javax.swing.JFrame {
    private String username;
    /**
     * Creates new form menuhome
     */
    public menuhome() {
        initComponents();
        
   
    }
    public void setUsername(String username){
        this.username=username;
        namaadmin.setText(username);
        Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
       tanggalloginadmin.setText(s.format(d));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        namaadmin = new javax.swing.JTextField();
        tanggalloginadmin = new javax.swing.JTextField();
        laporan = new javax.swing.JLabel();
        pembayaran = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(680, 566));
        setSize(new java.awt.Dimension(680, 566));
        getContentPane().setLayout(null);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 96, 30, 30);

        namaadmin.setEditable(false);
        namaadmin.setBackground(new java.awt.Color(255, 255, 255));
        namaadmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        namaadmin.setBorder(null);
        namaadmin.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        namaadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaadminActionPerformed(evt);
            }
        });
        getContentPane().add(namaadmin);
        namaadmin.setBounds(340, 40, 210, 22);

        tanggalloginadmin.setEditable(false);
        tanggalloginadmin.setBackground(new java.awt.Color(255, 255, 255));
        tanggalloginadmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tanggalloginadmin.setBorder(null);
        tanggalloginadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalloginadminActionPerformed(evt);
            }
        });
        getContentPane().add(tanggalloginadmin);
        tanggalloginadmin.setBounds(340, 60, 210, 22);

        laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanMouseClicked(evt);
            }
        });
        getContentPane().add(laporan);
        laporan.setBounds(460, 270, 160, 60);

        pembayaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembayaranMouseClicked(evt);
            }
        });
        getContentPane().add(pembayaran);
        pembayaran.setBounds(70, 270, 160, 60);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(620, 20, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TubesImage/home new1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 566);

        setSize(new java.awt.Dimension(680, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void pembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranMouseClicked
        String a=this.username;
        pembayaran pembayar = new pembayaran(a);
       pembayar.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_pembayaranMouseClicked

    private void laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_laporanMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        uilogin login = new uilogin();
        login.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tanggalloginadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalloginadminActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tanggalloginadminActionPerformed

    private void namaadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaadminActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel laporan;
    private javax.swing.JTextField namaadmin;
    private javax.swing.JLabel pembayaran;
    private javax.swing.JTextField tanggalloginadmin;
    // End of variables declaration//GEN-END:variables
}