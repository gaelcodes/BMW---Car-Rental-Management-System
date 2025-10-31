/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ReturnModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReturnDao {

    private final String url_db = "jdbc:mysql://localhost:3306/carrental_management_system_db";
    private final String username_db = "carrental";
    private final String password_db = "pih8888";

    public void insertReturnCar(ReturnModel returnCar) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            PreparedStatement pst = con.prepareStatement("INSERT INTO returntable VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, returnCar.getReturnId());
            pst.setString(2, returnCar.getPlateNum());
            pst.setString(3, returnCar.getModel());
            pst.setString(4, returnCar.getCustName());
            pst.setDate(5, returnCar.getReturnDate());
            pst.setString(6, returnCar.getDelay());
            pst.setString(7, returnCar.getFine());
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Return Car Added Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Error Returning Car");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRentCar(String plateNum) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            String query = "DELETE FROM renttable WHERE PLATENUM=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, plateNum);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteReturnCar(String plateNum) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            String query = "DELETE FROM returntable WHERE PLATENUM=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, plateNum);
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Car Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Error Deleting Car");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCarStatus(String plateNum) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            String query = "UPDATE carstable SET STATUS=? WHERE PLATENUM=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Available");
            pst.setString(2, plateNum);
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Car Has Been Returned Successfully, And Now Available For Rent");
            } else {
                JOptionPane.showMessageDialog(null, "Error While Updating Car");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayRentCars(JTable table) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM renttable");
            DefaultTableModel model = new DefaultTableModel(
                new Object[]{"RENTID", "PLATENUM", "MODEL", "CUSTNAME", "RENTDATE", "RETURNDATE", "RENTFEE"}, 0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("RENTID"),
                    rs.getString("PLATENUM"),
                    rs.getString("MODEL"),
                    rs.getString("CUSTNAME"),
                    rs.getDate("RENTDATE"),
                    rs.getDate("RETURNDATE"),
                    rs.getString("RENTFEE")
                });
            }
            table.setModel(model);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayReturnCars(JTable table) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM returntable");
            DefaultTableModel model = new DefaultTableModel(
                new Object[]{"RETURNID", "PLATENUM", "MODEL", "CUSTNAME", "RETURNDATE", "DELAY", "FINE"}, 0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("RETURNID"),
                    rs.getString("PLATENUM"),
                    rs.getString("MODEL"),
                    rs.getString("CUSTNAME"),
                    rs.getDate("RETURNDATE"),
                    rs.getString("DELAY"),
                    rs.getString("FINE")
                });
            }
            table.setModel(model);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getCustomers(JComboBox<String> comboBox) {
        try {
            Connection con = DriverManager.getConnection(url_db, username_db, password_db);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM customerstable");
            while (rs.next()) {
                comboBox.addItem(rs.getString("CustName"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet searchRent(String keyword) {
    ResultSet rs = null;
    String query = "SELECT * FROM renttable WHERE WHERE rentid=? plate=? OR model=? OR custname=? OR rentdate=? OR returndate=? OR fee=?";
    try {
        Connection con = DriverManager.getConnection(url_db, username_db, password_db);
        PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String searchPattern = "%" + keyword + "%";
        for (int i = 1; i <= 7; i++) {
            pst.setString(i, searchPattern);
        }
        rs = pst.executeQuery();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rs;
}

}
