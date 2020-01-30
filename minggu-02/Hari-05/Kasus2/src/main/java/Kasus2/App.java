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
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Movies")) {
                    //position result to first
                    rs.first();
                    System.out.println("1."+rs.getString(2)); //result is "Hello World!"
                }

            }
        }
    }
}
