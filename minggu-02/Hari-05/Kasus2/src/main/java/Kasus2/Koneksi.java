package Kasus2;
import java.sql.*;
public class Koneksi{
    private String dataBase;
    public void setKoneksi(String dataBase){
        this.dataBase=dataBase;
    }
    public Connection getKoneksi(){
        try {
            return DriverManager.getConnection("jdbc:mariadb://localhost/"+dataBase, "root", null);
        } catch (Exception e) {
            System.out.println("Koneksi Gagal");
            return null;
        }
    }
    public Statement getStatement(Connection In){
        try {
            return In.createStatement();    
        } catch (Exception e) {
            return null;
        }
        
    }
}