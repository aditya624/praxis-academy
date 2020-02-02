/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Kasus2;

import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/3NF", "root", null)) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                //execute query
                try (ResultSet rs = stmt.executeQuery("SELECT M2.Full_names, M1.Movies_rented FROM Movies AS M1 JOIN Member AS M2 ON M1.Membership_id=M2.Membership_id WHERE Full_names='Janet Jones'")) 
                {
                    int i=1;
                    System.out.println();
                    while (rs.next()) {
                        System.out.println(i+". "+rs.getString(2));
                        i++;
                    }                    
                }
            }
        }
    }
}
