/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil load driver MYSQL");
            
        
        }
        catch(ClassNotFoundException e){
            System.out.println("gagal : "+e.getMessage());
        }
        
        //untuk koneksi ke database
        try{
            String url="jdbc:mysql://localhost:3306/skripsi";
            con = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi");
                    
        }
        catch(SQLException e){
            System.out.println("Gagal koneksi : "+e.getMessage());
            //JOptionPane.showMessageDialog(null,”Gagal koneksi…MySQL server belum aktif”);
        }
        
        
        return con;
    
    }
    
    
}
