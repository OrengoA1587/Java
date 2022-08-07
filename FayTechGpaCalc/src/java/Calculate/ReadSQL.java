package Calculate;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oreng
 */
public class ReadSQL {
    public ResourceBundle reader = null;

    public void ReadSQL() throws SQLException, FileNotFoundException, IOException, ClassNotFoundException{ 
    try{ 
            Properties props = new Properties();
        try (FileInputStream in = new FileInputStream("C:\\Users\\oreng\\OneDrive\\Desktop\\config.properties")) {
            props.load(in);
        }

        String driver = props.getProperty("jdbc.driver");
        if (driver != null) {
            Class.forName(driver) ;
        }

        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        Connection con = DriverManager.getConnection(url, username, password);
    }catch(SQLException e){
    }
        
    }  
    public Connection getConnections(){
        return con;
    }
 
      
}
 
 