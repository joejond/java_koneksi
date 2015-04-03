/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dua_mysql;

import java.sql.Connection;

/**
 *
 * @author jono
 */
public class Dua_mysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection koneksi = new DBkoneksi().konek();
        new Frame1().setVisible(true);
//        fr.setvisible(true);
    }
    
}
