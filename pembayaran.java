/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;
import static TubesPBO.uilogin.conn;
import java.awt.Color;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author DZGIGABYTE
 */
public class pembayaran extends javax.swing.JFrame {
    private String username;
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost/loket_ukt";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;/**
     * Creates new form pembayaran
     */
    public pembayaran(String username) {
        initComponents();
        this.username =username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lanjut = new javax.swing.JLabel();
        batal = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lanjut.setAutoscrolls(true);
        lanjut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lanjutMouseClicked(evt);
            }
        });
        getContentPane().add(lanjut);
        lanjut.setBounds(340, 170, 80, 30);

        batal.setAutoscrolls(true);
        batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });
        getContentPane().add(batal);
        batal.setBounds(150, 170, 80, 30);

        nim.setBorder(null);
        nim.setOpaque(false);
        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });
        getContentPane().add(nim);
        nim.setBounds(210, 100, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TubesImage/PEMBAYARAN.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(3, 1, 562, 242);

        setSize(new java.awt.Dimension(562, 242));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed

    }//GEN-LAST:event_nimActionPerformed

    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
        menuhome home = new menuhome();
        home.setUsername(this.username);
        home.setVisible(true);
        this.dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_batalMouseClicked

    private void lanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanjutMouseClicked
        String a = nim.getText();
        String c;    
        try{
         Class.forName(DB_DRIVER);
         conn = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
         stmt = conn.createStatement();
         String sql = "Select * FROM mahasiswa";
         rs = stmt.executeQuery(sql);
         while(rs.next()){
           c = rs.getString("nim");
           if (a.equals(c)){
               System.out.println("berhasil");
               break;
           }
           else {
               System.out.println("anda suram nih Nimnya : "+c+" ");
            }
           }
         }
         catch (Exception e){
                 e.printStackTrace();
                 }
               
    }//GEN-LAST:event_lanjutMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lanjut;
    private javax.swing.JTextField nim;
    // End of variables declaration//GEN-END:variables
}
