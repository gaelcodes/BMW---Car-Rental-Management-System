/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.CustomerModel;

public class CustomerDao {

    private final String url = "jdbc:mysql://localhost:3306/carrental_management_system_db";
    private final String username = "carrental";
    private final String password = "pih8888";

    // Insert Customer
    public void insertCustomer(CustomerModel customer) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO customerstable (CUSTID, CUSTNAME, CUSTADDR, CUSTPHONE) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, customer.getCustId());
            pst.setString(2, customer.getCustName());
            pst.setString(3, customer.getCustAddr());
            pst.setString(4, customer.getCustPhone());

            pst.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Customer
    public void updateCustomer(CustomerModel customer) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "UPDATE customerstable SET CUSTNAME=?, CUSTADDR=?, CUSTPHONE=? WHERE CUSTID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, customer.getCustName());
            pst.setString(2, customer.getCustAddr());
            pst.setString(3, customer.getCustPhone());
            pst.setInt(4, customer.getCustId());

            pst.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Customer
    public void deleteCustomer(int custId) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM customerstable WHERE CUSTID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, custId);
            pst.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display all customers in JTable
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
    public ResultSet searchCustomer(String keyword) {
    ResultSet rs = null;
    String query = "SELECT * FROM customerstable WHERE CUSTID LIKE ? OR CUSTNAME LIKE ? OR CUSTADDR LIKE ? OR CUSTPHONE LIKE ? ";
    try {
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String searchPattern = "%" + keyword + "%";
        for (int i = 1; i <= 4; i++) {
            pst.setString(i, searchPattern);
        }
        rs = pst.executeQuery();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rs;
}
}


