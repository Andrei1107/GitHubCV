package util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageRepository {

    public void insertImageIntoDB(Connection connection, String name, String path) {
Path path1=Paths.get(path);

        String sql = "INSERT INTO images(name,photo) VALUES(?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            InputStream inputStream=Files.newInputStream(path1);
            preparedStatement.setString(1,name);
            preparedStatement.setBinaryStream(2,inputStream);

int result=preparedStatement.executeUpdate();
if(result==1){
    System.out.println("ADDED WITH SUCCSESSFULLY ");
}else{
    throw new IllegalAccessException("ERROR");
}

        }catch (IllegalAccessException|IOException|SQLException e){
            e.printStackTrace();
        }

    }


}
