/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */

public class CustomerModel {
    private int custId;
    private String custName;
    private String custAddr;
    private String custPhone;

    public CustomerModel(int custId, String custName, String custAddr, String custPhone) {
        this.custId = custId;
        this.custName = custName;
        this.custAddr = custAddr;
        this.custPhone = custPhone;
    }

    // Getters
    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public String getCustPhone() {
        return custPhone;
    }

    // Setters
    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}

