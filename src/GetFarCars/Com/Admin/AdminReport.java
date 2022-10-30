/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GetFarCars.Com.Admin;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import com.carrentalsystem.system.DBConnector;
import com.gerfarcars.report.Report;
import com.gerfarcars.report.ReportImp;
import com.getfarcar.common.User;
import com.getfarcar.common.UserImp;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KA VI YA
 */
public class AdminReport extends javax.swing.JFrame {
    
    DBConnector obj=DBConnector.getObject();
    java.sql.Connection conn=DBConnector.getConnection();
    
    PreparedStatement pst1;
    CardLayout cardLayout;
    CardLayout cardLayout1;
    String UserID;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }
    
    public AdminReport() {
        
        initComponents();
        Load();
        cardLayout =(CardLayout)(jPanel1.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        priCard2 = new javax.swing.JPanel();
        priCard4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Ttable = new rojeru_san.complementos.RSTableMetro();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        priCard1 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ADR1 = new rojeru_san.complementos.RSTableMetro();
        jScrollPane7 = new javax.swing.JScrollPane();
        CAV = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle4 = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        priCard2.setBackground(new java.awt.Color(255, 255, 255));

        priCard4.setBackground(new java.awt.Color(255, 255, 255));
        priCard4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Admin Report>Transaction->");
        priCard4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 41));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel45.setText("jLabel18");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        priCard4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 20, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel46.setText("jLabel29");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        priCard4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 20, -1));

        Ttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Customer Name", "Vehicale Model", "Date ", "Amount"
            }
        ));
        Ttable.setColorBackgoundHead(new java.awt.Color(51, 204, 255));
        Ttable.setColorFilasForeground1(new java.awt.Color(204, 51, 0));
        Ttable.setColorFilasForeground2(new java.awt.Color(255, 0, 0));
        Ttable.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ttable.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ttable.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(Ttable);
        if (Ttable.getColumnModel().getColumnCount() > 0) {
            Ttable.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        priCard4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 670, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/Get_far_cars_logo copy.png"))); // NOI18N
        priCard4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Get Far Cars");
        priCard4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("23 Octomber, 2022");
        priCard4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("NO10,  Neluwa Road, Galle");
        priCard4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("getfarcars@gmail.com");
        priCard4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 255));

        jLabel23.setBackground(new java.awt.Color(0, 51, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TRANSACTION REPORT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(185, 185, 185))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        priCard4.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 660, 40));

        amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amount.setText("RS: 1500.00");
        priCard4.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Total Amount");
        priCard4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        javax.swing.GroupLayout priCard2Layout = new javax.swing.GroupLayout(priCard2);
        priCard2.setLayout(priCard2Layout);
        priCard2Layout.setHorizontalGroup(
            priCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priCard4, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        priCard2Layout.setVerticalGroup(
            priCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priCard4, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        jPanel1.add(priCard2, "priCard2");

        priCard1.setBackground(new java.awt.Color(255, 255, 255));
        priCard1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel36.setText("jLabel29");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        priCard1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 20, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel44.setText("jLabel18");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        priCard1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 20, -1));

        jLabel50.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel50.setText("User Management >Admin Report->");
        priCard1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 41));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/Get_far_cars_logo copy.png"))); // NOI18N
        priCard1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Get Far Cars");
        priCard1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("NO10,  Neluwa Road, Galle");
        priCard1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("getfarcars@gmail.com");
        priCard1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("23 Octomber, 2022");
        priCard1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 20));

        jPanel5.setBackground(new java.awt.Color(0, 51, 255));

        jLabel28.setBackground(new java.awt.Color(0, 51, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ADMIN REPORT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(229, 229, 229))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        priCard1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 660, 40));

        ADR1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Customer Name", "Car Model", "Start Date", "End Date"
            }
        ));
        ADR1.setColorBackgoundHead(new java.awt.Color(51, 204, 255));
        ADR1.setColorFilasForeground1(new java.awt.Color(204, 51, 0));
        ADR1.setColorFilasForeground2(new java.awt.Color(255, 0, 0));
        ADR1.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADR1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADR1.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(ADR1);
        if (ADR1.getColumnModel().getColumnCount() > 0) {
            ADR1.getColumnModel().getColumn(0).setPreferredWidth(40);
            ADR1.getColumnModel().getColumn(3).setHeaderValue("Start Date");
            ADR1.getColumnModel().getColumn(4).setResizable(false);
            ADR1.getColumnModel().getColumn(4).setHeaderValue("End Date");
        }

        priCard1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 660, 100));

        CAV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Car Model", "Total Cars", "Available Cars"
            }
        ));
        CAV.setAltoHead(25);
        CAV.setColorBackgoundHead(new java.awt.Color(51, 204, 255));
        CAV.setColorFilasForeground1(new java.awt.Color(204, 51, 0));
        CAV.setColorFilasForeground2(new java.awt.Color(255, 0, 0));
        CAV.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CAV.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CAV.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane7.setViewportView(CAV);
        if (CAV.getColumnModel().getColumnCount() > 0) {
            CAV.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        priCard1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 420, 80));

        jPanel1.add(priCard1, "priCard1");

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 690, 620));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/get.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/home.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, 40));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonRectangle2.setText("TRANSACTION REPORT");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 50));

        rSMaterialButtonRectangle4.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonRectangle4.setText("SUMMARY REPORT");
        rSMaterialButtonRectangle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle4ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonRectangle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/Update1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, 100));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Reports");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
PreparedStatement insert;
private void Load(){
 
        DefaultTableModel UFT=(DefaultTableModel) Ttable.getModel();
        UFT.setRowCount(0);
        ReportImp reportImp = new ReportImp();
        List<Report> report=reportImp.ReportList();
        for(Report rep:report){
            UFT.addRow(new Object[]{rep.getInvoiceNo(),rep.getCustomerName(),rep.getVehicaleType(),rep.getDate(),rep.getAmount()});
        }
        
        //ReportImp reportImp1 = new ReportImp();
        //amount.setText(String.valueOf(reportImp1.getTamount()));
        
        
        DefaultTableModel BK=(DefaultTableModel) ADR1.getModel();
        BK.setRowCount(0);
        ReportImp reportImp2 = new ReportImp();
        List<Report> report1=reportImp2.AdminReportList();
        
        for(Report re:report1){
            BK.addRow(new Object[]{re.getBookingID(),re.getCustomerName(),re.getVehicaleID(),re.getStartDate(),re.getEndDate()});
        }
        
        DefaultTableModel CA=(DefaultTableModel) CAV.getModel();
        CA.setRowCount(0);
        ReportImp reportImp3 = new ReportImp();
        List<Report> report2=reportImp3.AdminCarAvailability();
        
        for(Report repo:report2){
            CA.addRow(new Object[]{repo.getVehicaleType(),repo.getTcars(),repo.getAcars()});
        }
        
        
        
        

}


    private void rSMaterialButtonRectangle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle4ActionPerformed
       cardLayout.show(jPanel1,"priCard1");

    }//GEN-LAST:event_rSMaterialButtonRectangle4ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        cardLayout.show(jPanel1,"priCard2");
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed




    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Admindashboard add=new Admindashboard();
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Admindashboard add=new Admindashboard();
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel36MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminUserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUserManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro ADR1;
    private rojeru_san.complementos.RSTableMetro CAV;
    private rojeru_san.complementos.RSTableMetro Ttable;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel priCard1;
    private javax.swing.JPanel priCard2;
    private javax.swing.JPanel priCard4;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle4;
    // End of variables declaration//GEN-END:variables
}