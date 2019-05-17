
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Putri
 */


public class koneksi{
    private Connection koneksi;
    public Connection getKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException ex){
            
        }
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/loket_ukt","root","");
            if(koneksi != null){
                System.out.println("Berhasil Koneksi!");
            }
        } catch(SQLException ex){
            System.out.println("Koneksi Gagal!");
        }
        return koneksi;
    }
}

/*
public class MyConnection {
    
    public static Connection getConnection()
    {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/loket_ukt","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}

*/