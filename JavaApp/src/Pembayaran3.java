
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Pembayaran3 extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran3
     */
    public Pembayaran3() {
        initComponents();
        showDate();
    }
    
       void showDate(){
       Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
       tanggal.setText(s.format(d));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nama_mhs = new javax.swing.JLabel();
        nim_mhs = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tampil_semester = new javax.swing.JLabel();
        tampil_gol = new javax.swing.JLabel();
        tampil_tertagih = new javax.swing.JLabel();
        tampil_prodi = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        bayar_skrg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Nama Mahasiswa :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        nama_mhs.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        nama_mhs.setText("Nama Mahasiswa");
        jPanel1.add(nama_mhs);
        nama_mhs.setBounds(10, 50, 170, 17);

        nim_mhs.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        nim_mhs.setText("NIM Mahasiswa");
        jPanel1.add(nim_mhs);
        nim_mhs.setBounds(10, 30, 108, 17);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(500, 0, 29, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Golongan UKT       :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 220, 110, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Jumlah Tertagih    :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 260, 120, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Semester                 :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 180, 110, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Program Studi        :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 140, 120, 30);

        tampil_semester.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(tampil_semester);
        tampil_semester.setBounds(150, 180, 170, 30);

        tampil_gol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(tampil_gol);
        tampil_gol.setBounds(150, 220, 170, 30);

        tampil_tertagih.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(tampil_tertagih);
        tampil_tertagih.setBounds(150, 260, 170, 30);

        tampil_prodi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(tampil_prodi);
        tampil_prodi.setBounds(150, 140, 170, 30);

        kembali.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        kembali.setText("Kembali");
        kembali.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(kembali);
        kembali.setBounds(270, 390, 130, 50);

        bayar_skrg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bayar_skrg.setText("Bayar Sekarang");
        bayar_skrg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(bayar_skrg);
        bayar_skrg.setBounds(40, 390, 130, 50);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Lakukan pembayaran sekarang juga dari jumlah rertagih di atas?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 360, 360, 14);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("Persetujuan Pembayaran");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 80, 260, 40);

        tanggal.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        tanggal.setText("Tanggal");
        jPanel1.add(tanggal);
        tanggal.setBounds(10, 10, 108, 17);

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cancel);
        cancel.setBounds(400, 0, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pembayaran3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayar_skrg;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel nama_mhs;
    private javax.swing.JLabel nim_mhs;
    private javax.swing.JLabel tampil_gol;
    private javax.swing.JLabel tampil_prodi;
    private javax.swing.JLabel tampil_semester;
    private javax.swing.JLabel tampil_tertagih;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}