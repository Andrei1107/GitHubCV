package util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {


    public Connection getConnection(){
        YmlReader ymlReader=new YmlReader();
        Properties properties=null;


        try{
            properties=ymlReader.readFile(Paths.get(this.getClass().getClassLoader().getResource("connection.yml").toURI()));

return DriverManager.getConnection(
        properties.getProperty("url"),
        properties.getProperty("username"),
        properties.getProperty("password"));


        }catch (SQLException |URISyntaxException e){
            e.printStackTrace();
        }


        return null;

    }


}
