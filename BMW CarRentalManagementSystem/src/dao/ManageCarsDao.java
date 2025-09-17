package dao;

import java.sql.*;
import model.ManageCar;

public class ManageCarsDao {

    private final String url = "jdbc:mysql://localhost:3306/carrental_management_system_db";
    private final String user = "carrental";
    private final String password = "pih8888";

    public void insertCar(ManageCar car) {
        String query = "INSERT INTO carstable VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, car.getPlateNum());
            pst.setString(2, car.getType());
            pst.setString(3, car.getModel());
            pst.setString(4, car.getPrice());
            pst.setString(5, car.getStatus());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // You can replace this with proper logging
        }
    }

    public void updateCar(ManageCar car) {
        
        String query = "UPDATE carstable SET TYPE=?, MODEL=?, PRICE=?, STATUS=? WHERE PLATENUM=?";
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, car.getType());
            pst.setString(2, car.getModel());
            pst.setString(3, car.getPrice());
            pst.setString(4, car.getStatus());
            pst.setString(5, car.getPlateNum());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCar(String plateNum) {
        String query = "DELETE FROM carstable WHERE PLATENUM=?";
        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, plateNum);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getAllCars() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM carstable");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet searchCars(String keyword) {
        ResultSet rs = null;
        String query = "SELECT * FROM carstable WHERE PLATENUM LIKE ? OR TYPE LIKE ? OR MODEL LIKE ? OR PRICE LIKE ? OR STATUS LIKE ?";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String searchPattern = "%" + keyword + "%";
            for (int i = 1; i <= 5; i++) {
                pst.setString(i, searchPattern);
            }
            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

}
