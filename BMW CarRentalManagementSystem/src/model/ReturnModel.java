/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */

import java.sql.Date;

public class ReturnModel {
    private String returnId;
    private String plateNum;
    private String model;
    private String custName;
    private Date returnDate;
    private String delay;
    private String fine;

    public ReturnModel(String returnId, String plateNum, String model, String custName, Date returnDate, String delay, String fine) {
        this.returnId = returnId;
        this.plateNum = plateNum;
        this.model = model;
        this.custName = custName;
        this.returnDate = returnDate;
        this.delay = delay;
        this.fine = fine;
    }

    // Getters and Setters
    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }
}

