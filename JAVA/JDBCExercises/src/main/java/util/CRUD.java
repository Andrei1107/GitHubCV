package util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD {


    public void insertIntoDB(Connection connection, String name, String lastname, Date start_date) {
        String INSERT = "INSERT INTO employee(first_name,last_name,start_date) VALUES(?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastname);
            preparedStatement.setDate(3, start_date);

            int result = preparedStatement.executeUpdate();

            if (result == 1) {
                System.out.println("Succesfully inseted into database");
            } else {

                throw new IllegalAccessException("ERROR");
            }


        } catch (IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteFromDB(Connection connection, int emp_id) {
        String sql = "DELETE FROM employee WHERE emp_id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, emp_id);

            int result = preparedStatement.executeUpdate();
            if (result == 1) {
                System.out.println("Successfully deleted from db");
            } else {
                throw new IllegalAccessException("ERROR ");
            }


        } catch (IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }


    }

    public void updateIntoDb(Connection connection, String title) {
        String sql = "UPDATE officer SET first_name= ? WHERE first_name LIKE ' %e%' ";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, title);

            int result = preparedStatement.executeUpdate();
            if (result == 1) {
                System.out.println("Successfully deleted from DB");
            } else {
                throw new IllegalAccessException("ERROR");
            }


        } catch (IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }


    }


}
