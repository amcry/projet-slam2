package fr.dampierre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDonnees {
    public static void main(String[] args) {
        try {
         
                if (conn != null) {
                    System.out.println("Connected");
                }
                
            } 
            
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        insert();
        
}
    
    public static Connection connection() throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/salon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(dbURL, username, password);
 
        return conn;    
    }

    public static void insert() {
        
        String sql = "INSERT INTO inscrit (IN_nom,IN_prenom,IN_age,IN_sexe,IN_cp,IN_mail,IN_inscription_internet,IN_present) values (?,?,?,?,?,?,?,?);";
 
        PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Gump");
            statement.setString(2, "Forest");
            statement.setString(3, "35");
            statement.setString(4, "M");
            statement.setString(5, "59305");
            statement.setString(6, "courtForest@gmail.com");
            statement.setString(7, "oui");
            statement.setString(8, "1");
            
 
    int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
             System.out.println("A new user was inserted successfully!");
    }
}


    
}
    
    
