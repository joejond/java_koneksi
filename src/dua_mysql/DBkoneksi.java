package dua_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jono
 */
public class DBkoneksi {
    private Connection con; 
    
    public Connection konek(){
        try{
            //untuk koneksi ke database
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/skripsi";
            con = DriverManager.getConnection(url,"root","");
            
            //debug koneksi
            System.out.println("berhasil load driver MYSQL");     
            System.out.println("Berhasil koneksi");
            //JOptionPane.showMessageDialog(null,"Horeee.... Mysql sudah terkoneksi");
        
        }
        catch(ClassNotFoundException e){
            System.out.println("gagal : "+e.getMessage());
        }
        catch(SQLException e){
            System.out.println("Gagal koneksi : "+e.getMessage());
            //JOptionPane.showMessageDialog(null,”Gagal koneksi…MySQL server belum aktif”);
        }        
        return con;
    }
}
