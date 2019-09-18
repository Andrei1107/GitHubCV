import util.CRUD;
import util.DBConnection;
import util.ImageRepository;

import java.sql.Connection;
import java.sql.Date;

public class Application {

    public static void main(String[] args) {

        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();

        CRUD crud = new CRUD();
        Date date1 = new Date(2019, 8, 2);
        // crud.insertIntoDB(connection, "Daniela", "Neagu", date1);
        //  crud.deleteFromDB(connection, 19);
        //  crud.updateIntoDb(connection, "Mihaela");
        ImageRepository imageRepository = new ImageRepository();
        imageRepository.insertImageIntoDB(connection, "Code", "C:\\Users\\oprea\\Desktop\\Java\\JDBCExercises\\src\\main\\resources\\codecode.jpg");
        imageRepository.insertImageIntoDB(connection,"Picture" ,"C:\\Users\\oprea\\Desktop\\Java\\JDBCExercises\\src\\main\\resources\\picture.jpg");

    }

}
