package view;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ManageCars extends javax.swing.JFrame {

    /**
     * Creates new form CarServices
     */
    public ManageCars() {
        initComponents();
        DisplayCars();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    // Database connection details
    private final String url_db = "jdbc:mysql://localhost:3306/carrental_management_system_db";
    private final String username_db = "carrental";
    private final String password_db = "pih8888";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ManageCarBtn = new usu.widget.ButtonGlass();
        RegisterCustomerBtn = new usu.widget.ButtonGlass();
        RentCarBtn = new usu.widget.ButtonGlass();
        ReturnCarBtn = new usu.widget.ButtonGlass();
        LogOutBtn = new usu.widget.ButtonGlass();
        CloseClick = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PlateNumTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        ModelTb = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();
        EditBtn1 = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        DeleteBtn3 = new javax.swing.JButton();
        TypeCb = new javax.swing.JComboBox<String>();
        StatusCb = new javax.swing.JComboBox<String>();
        PrintBtn = new javax.swing.JButton();
        SearchTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageCarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ManageCarBtn.setText("Manage Cars");
        ManageCarBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        ManageCarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageCarBtnMouseClicked(evt);
            }
        });
        ManageCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ManageCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 30));

        RegisterCustomerBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterCustomerBtn.setText("Register Customer");
        RegisterCustomerBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        RegisterCustomerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterCustomerBtnMouseClicked(evt);
            }
        });
        RegisterCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterCustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 30));

        RentCarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RentCarBtn.setText("Rent Car");
        RentCarBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        RentCarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarBtnMouseClicked(evt);
            }
        });
        RentCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentCarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RentCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 30));

        ReturnCarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReturnCarBtn.setText("Return Car");
        ReturnCarBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        ReturnCarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnCarBtnMouseClicked(evt);
            }
        });
        ReturnCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnCarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 30));

        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("Logout");
        LogOutBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 610));

        CloseClick.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        CloseClick.setForeground(new java.awt.Color(0, 0, 102));
        CloseClick.setText("x");
        CloseClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseClickMouseClicked(evt);
            }
        });
        getContentPane().add(CloseClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(0, 0, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Cars Available");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Plate Number");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 71, -1, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Type");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Model");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Status");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Search");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        PlateNumTb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        PlateNumTb.setForeground(new java.awt.Color(0, 0, 102));
        jPanel5.add(PlateNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 149, 32));

        PriceTb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(0, 0, 102));
        jPanel5.add(PriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 149, 32));

        ModelTb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        ModelTb.setForeground(new java.awt.Color(0, 0, 102));
        jPanel5.add(ModelTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 149, 32));

        SaveBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(0, 0, 102));
        SaveBtn.setText("Register Car");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel5.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 130, 30));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Manage Cars");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        CarsTable.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "PLATENUM", "TYPE", "MODEL", "PRICE", "STATUS"
            }
        ));
        CarsTable.setRowHeight(25);
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CarsTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 880, 240));

        EditBtn1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditBtn1.setForeground(new java.awt.Color(0, 0, 102));
        EditBtn1.setText("Update Car");
        EditBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtn1ActionPerformed(evt);
            }
        });
        jPanel5.add(EditBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 110, 30));

        ResetBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(0, 0, 102));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        jPanel5.add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 110, 30));

        DeleteBtn3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteBtn3.setForeground(new java.awt.Color(0, 0, 102));
        DeleteBtn3.setText("Delete Car");
        DeleteBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn3ActionPerformed(evt);
            }
        });
        jPanel5.add(DeleteBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 110, 30));

        TypeCb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        TypeCb.setForeground(new java.awt.Color(0, 0, 102));
        TypeCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SUV", "Sedan", "Coupe", "Sport Car", "Classic", "Track Car", "Luxury", "CSL" }));
        TypeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeCbActionPerformed(evt);
            }
        });
        jPanel5.add(TypeCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 30));

        StatusCb.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        StatusCb.setForeground(new java.awt.Color(0, 0, 102));
        StatusCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Booked" }));
        StatusCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusCbActionPerformed(evt);
            }
        });
        jPanel5.add(StatusCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 180, 30));

        PrintBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 0, 102));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });
        jPanel5.add(PrintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 110, 30));

        SearchTb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        SearchTb.setForeground(new java.awt.Color(0, 0, 102));
        jPanel5.add(SearchTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 180, 30));

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Rent Fee");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        SearchBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(0, 0, 102));
        SearchBtn.setText("Search");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        jPanel5.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 100, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 1060, 600));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("BMW-Bayerische Motoren Werke");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 230, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("/");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 80));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("/");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 80));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("/");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 80));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("BMW Car Rental Software");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 490, -1));

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("The Ultimate Driving Machine");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 230, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageCarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageCarBtnMouseClicked
        // TODO add your handling code here:
        new ManageCars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManageCarBtnMouseClicked

    private void ManageCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageCarBtnActionPerformed

    private void RegisterCustomerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterCustomerBtnMouseClicked
        // TODO add your handling code here:
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterCustomerBtnMouseClicked

    private void RegisterCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCustomerBtnActionPerformed

    private void RentCarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarBtnMouseClicked
        // TODO add your handling code here:
        new RentCar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RentCarBtnMouseClicked

    private void RentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentCarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentCarBtnActionPerformed

    private void ReturnCarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnCarBtnMouseClicked
        // TODO add your handling code here:
        new ReturnCar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnCarBtnMouseClicked

    private void ReturnCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnCarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnCarBtnActionPerformed

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
        try {
            CarsTable.print(JTable.PrintMode.NORMAL, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        // TODO add your handling code here:
        try {
            CarsTable.print(JTable.PrintMode.NORMAL, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        // TODO add your handling code here:
        SearchCars();
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void LogOutClickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_LogOutClickMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_LogOutClickMouseClicked

    private void CarsClickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CarsClickMouseClicked
        // TODO add your handling code here:
        new Customer().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_CarsClickMouseClicked

    private void RentCarClickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_RentCarClickMouseClicked
        // TODO add your handling code here:
        new RentCar().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_RentCarClickMouseClicked

    private void ReturnCarClickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ReturnCarClickMouseClicked
        // TODO add your handling code here:
        new ReturnCar().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_ReturnCarClickMouseClicked

    private void CloseClickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CloseClickMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_CloseClickMouseClicked

    private void CustomerClickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CustomerClickMouseClicked
        // TODO add your handling code here:
        new Customer().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_CustomerClickMouseClicked

    private void TypeCbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TypeCbActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TypeCbActionPerformed

    private void StatusCbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_StatusCbActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_StatusCbActionPerformed
    
    private void SearchCars() {
    String keyword = SearchTb.getText().trim();
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a search keyword.");
        return;
    }
    try {
        ResultSet rs = new dao.ManageCarsDao().searchCars(keyword);
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[]{"PLATENUM", "TYPE", "MODEL", "PRICE", "STATUS"}, 0);

        while (rs.next()) {
            model.addRow(new Object[]{
                    rs.getString("PLATENUM"),
                    rs.getString("TYPE"),
                    rs.getString("MODEL"),
                    rs.getString("PRICE"),
                    rs.getString("STATUS")
            });
        }
        CarsTable.setModel(model);
        rs.getStatement().getConnection().close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    

    private void EditBtn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EditBtn1ActionPerformed
    // Read and trim input values
    String plateNum = PlateNumTb.getText().trim();
    String price = PriceTb.getText().trim();
    String model = ModelTb.getText().trim();
    int typeIndex = TypeCb.getSelectedIndex();
    int statusIndex = StatusCb.getSelectedIndex();

    if (plateNum.isEmpty() || price.isEmpty() || model.isEmpty() || typeIndex == -1 || statusIndex == -1) {
        JOptionPane.showMessageDialog(this, "Input all the Data of the Car to be Edited.");
    } 
    else if (!price.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Price must be a valid number.");
    } 
    else if (plateNum.length() > 1 && plateNum.length() < 7) {
        JOptionPane.showMessageDialog(this, "Plate Number is too long (max 7 characters).");
    } 
    else if (model.length() > 15) {
        JOptionPane.showMessageDialog(this, "Model name is too long (max 15 characters).");
    } 
    else {
        try {
            model.ManageCar car = new model.ManageCar(
                    plateNum,
                    TypeCb.getSelectedItem().toString(),
                    model,
                    price,
                    StatusCb.getSelectedItem().toString()
            );
            new dao.ManageCarsDao().updateCar(car);
            JOptionPane.showMessageDialog(this, "Car Updated Successfully");

            // Refresh car list and reset form
            DisplayCars();
            Reset();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Updating Car. See console for details.");
        }
    }
}// GEN-LAST:event_EditBtn1ActionPerformed


    private void Reset() {
        PlateNumTb.setText("");
        TypeCb.setSelectedIndex(-1);
        ModelTb.setText("");
        PriceTb.setText("");
        StatusCb.setSelectedIndex(-1);
    }

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        Reset();

    }// GEN-LAST:event_ResetBtnActionPerformed

    private void DeleteBtn3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        if (PlateNumTb.getText().isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(this, "Input the Plate Number to delete a Car");

        } else {

            try {
                String plate = PlateNumTb.getText();
                new dao.ManageCarsDao().deleteCar(plate);
                
                Con.close();
                
                // Clear the input fields after deleting
                PlateNumTb.setText("");
                TypeCb.setSelectedIndex(0);
                ModelTb.setText("");
                PriceTb.setText("");
                StatusCb.setSelectedIndex(0);
                // Refresh the table data
                DisplayCars();
                // Reset
                Reset();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }// GEN-LAST:event_DeleteeBtnActionPerformed
    }

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CarsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CarsTable.getModel();
        int MyIndex = CarsTable.getSelectedRow();
        PlateNumTb.setText(model.getValueAt(MyIndex, 0).toString());
        TypeCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        ModelTb.setText(model.getValueAt(MyIndex, 2).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 3).toString());
        StatusCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());

    }// GEN-LAST:event_CarsTableMouseClicked

    private void DisplayCars() {
        // Implement the method to load cars from the database and display them in
        // CarsTable
        try {
            ResultSet rs = new dao.ManageCarsDao().getAllCars();
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                    new Object[] { "PLATENUM", "TYPE", "MODEL", "PRICE", "STATUS" }, 0);

            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getString("PLATENUM"),
                        rs.getString("TYPE"),
                        rs.getString("MODEL"),
                        rs.getString("PRICE"),
                        rs.getString("STATUS")
                });
            }
            CarsTable.setModel(model);
            rs.getStatement().getConnection().close(); // close the connection
        } catch (Exception e) {
        }
    }

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SaveBtnActionPerformed

        String plateNum = PlateNumTb.getText().trim();
        String price = PriceTb.getText().trim();
        String model = ModelTb.getText();
        int typeIndex = TypeCb.getSelectedIndex();
        int statusIndex = StatusCb.getSelectedIndex();

    if (plateNum.isEmpty() || price.isEmpty() || model.isEmpty() || typeIndex == -1 || statusIndex == -1) {
        JOptionPane.showMessageDialog(this, "Missing Data. Please fill all fields.");
    } 
    else if (!price.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Price must be a valid number.");
    } 
    else if (plateNum.length() > 1 && plateNum.length() < 7) {
        JOptionPane.showMessageDialog(this, "Plate Number is too long (max 7 characters).");
    } 
    else if (model.length() > 20) {
        JOptionPane.showMessageDialog(this, "Model name is too long (max 20 characters).");
    } 
    else {
        try {

            model.ManageCar car = new model.ManageCar(
                    plateNum,
                    TypeCb.getSelectedItem().toString(),
                    model,
                    price,
                    StatusCb.getSelectedItem().toString()
            );
            new dao.ManageCarsDao().insertCar(car);
            JOptionPane.showMessageDialog(this, "Car Added Successfully");

            DisplayCars();
            Reset();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Adding Car. See console for details.");
        }
    }
}// GEN-LAST:event_SaveBtnActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CarsTable;
    private javax.swing.JLabel CloseClick;
    private javax.swing.JButton DeleteBtn3;
    private javax.swing.JButton EditBtn1;
    private usu.widget.ButtonGlass LogOutBtn;
    private usu.widget.ButtonGlass ManageCarBtn;
    private javax.swing.JTextField ModelTb;
    private javax.swing.JTextField PlateNumTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private usu.widget.ButtonGlass RegisterCustomerBtn;
    private usu.widget.ButtonGlass RentCarBtn;
    private javax.swing.JButton ResetBtn;
    private usu.widget.ButtonGlass ReturnCarBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchTb;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JComboBox<String> TypeCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
