/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author User
 */

import model.RentModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RentDao {
    
    private final String url = "jdbc:mysql://localhost:3306/carrental_management_system_db";
    private final String username = "carrental";
    private final String password = "pih8888";
    
    public void insertRent(RentModel rent) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO rentcar (plate, model, custname, rentdate, returndate, fee) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, rent.getPlateNum());
            pst.setString(2, rent.getModel());
            pst.setString(3, rent.getCustName());
            pst.setDate(4, rent.getRentDate());
            pst.setDate(5, rent.getReturnDate());
            pst.setDouble(6, rent.getRentFee());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Car Rented Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Error: " + e.getMessage());
        }
    }

    public void updateRent(RentModel rent) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "UPDATE rentcar SET plate=?, model=?, custname=?, rentdate=?, returndate=?, fee=? WHERE rentid=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, rent.getPlateNum());
            pst.setString(2, rent.getModel());
            pst.setString(3, rent.getCustName());
            pst.setDate(4, rent.getRentDate());
            pst.setDate(5, rent.getReturnDate());
            pst.setDouble(6, rent.getRentFee());
            pst.setInt(7, rent.getRentId());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Rent Record Updated!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Error: " + e.getMessage());
        }
    }

    public void deleteRent(int rentId) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM rentcar WHERE rentid=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rentId);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Rent Record Deleted!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Error: " + e.getMessage());
        }
    }

    public void fillRentModelById(RentModel rent, int rentId) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM rentcar WHERE rentid=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rentId);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                rent.setRentId(rs.getInt("rentid"));
                rent.setPlateNum(rs.getString("plate"));
                rent.setModel(rs.getString("model"));
                rent.setCustName(rs.getString("custname"));
                rent.setRentDate(rs.getDate("rentdate"));
                rent.setReturnDate(rs.getDate("returndate"));
                rent.setRentFee(rs.getDouble("fee"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading rent record: " + e.getMessage());
        }
    }
    public void getAllCustomers(JTable table) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customerstable");

            DefaultTableModel model = new DefaultTableModel(
                new Object[]{"CUSTID", "CUSTNAME", "CUSTADDR", "CUSTPHONE"}, 0
            );

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("CUSTID"),
                    rs.getString("CUSTNAME"),
                    rs.getString("CUSTADDR"),
                    rs.getString("CUSTPHONE")
                };
                model.addRow(row);
            }

            table.setModel(model);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet searchCars(String keyword) {
    ResultSet rs = null;
    String query = "SELECT * FROM carstable WHERE PLATENUM LIKE ? OR TYPE LIKE ? OR MODEL LIKE ? OR PRICE LIKE ? OR STATUS LIKE ?";
    try {
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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

