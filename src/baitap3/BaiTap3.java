/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bao Lam
 */
public class BaiTap3 extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDien
     */
    CreateTable cr = new CreateTable();
    InsertData in = new InsertData();
    
    public BaiTap3() {
        
        initComponents();
        setTableView();
        cr.createTable();
        in.insertData();
        hienThiTacGia(controller.hienThiTacGia());
        hienThiSach(controller.hienThiSach());
        hienThiChiTietSach(controller.hienThiChiTietSach());
        hienThiSachTG(controller.hienThiSachTG());
        hienThiDocGia(controller.hienThiDocGia());
    }
    
    DefaultTableModel tableModelTG = new DefaultTableModel();
    DefaultTableModel tableModelS = new DefaultTableModel();
    DefaultTableModel tableModelCT = new DefaultTableModel();
    DefaultTableModel tableModelSTG = new DefaultTableModel();
    DefaultTableModel tableModelDG = new DefaultTableModel();
    DefaultTableModel tableModelSM = new DefaultTableModel();
    
    DatabaseController controller = new DatabaseController();
    
    public void setTableView(){
        String[] titleTG = {"Mã TG", "Họ tên", "Địa chỉ"};
        tableModelTG.setColumnIdentifiers(titleTG);
        tblTacGia.setModel(tableModelTG);
        
        String[] titleS = {"Mã sách", "Tên sách", "Tủ sách",
            "Số trang","Mã TG","Năm XB","Tủ Khóa","NXB"};
        tableModelS.setColumnIdentifiers(titleS);
        tblSach.setModel(tableModelS);
        
        String[] titleCT = {"Mã sách", "Mã cá biệt", "Tình trạng sách",
            "Tình trạng phục vụ"};
        tableModelCT.setColumnIdentifiers(titleCT);
        tblChiTietSach.setModel(tableModelCT);
        
        String[] titleSTG = {"Mã sách", "Mã tác giả"};
        tableModelSTG.setColumnIdentifiers(titleSTG);
        tblSachTG.setModel(tableModelSTG);
        
        String[] titleDG = {"Số thẻ", "Họ tên", "DVCT"};
        tableModelDG.setColumnIdentifiers(titleSTG);
        tblDocGia.setModel(tableModelDG);
        
        String[] titleSM = {"Số thẻ", "Mã cá biệt", "Ngày mượn",
            "Ngày phải trả","Ngày trả"};
        tableModelSM.setColumnIdentifiers(titleSTG);
        tblSachMuon.setModel(tableModelSM);
    }

    public void hienThiTacGia(ResultSet result) {
        try {
            ResultSet res = result;
            tableModelTG.setRowCount(0);
            while (res.next()) {
                String[] row = new String[3];
                row[0] = res.getString("MaTG");
                row[1] = res.getString("TenTG");
                row[2] = res.getString("DCLienHe");
                
                tableModelTG.addRow(row);
            }
            tableModelTG.fireTableDataChanged();
            res.close();
        } catch (Exception e) {
            
        }
    }
    
    public void hienThiSach(ResultSet result) {
        try {
            ResultSet res = result;
            tableModelS.setRowCount(0);
            while (res.next()) {
                String[] row = new String[7];
                row[0] = res.getString("MaSach");
                row[1] = res.getString("TuaSach");
                row[2] = res.getString("SoTrang");
                row[3] = res.getString("MaTG");
                row[4] = res.getString("NamXB");
                row[5] = res.getString("TuKhoa");
                row[6] = res.getString("NXB");
                
                tableModelS.addRow(row);
            }
            tableModelS.fireTableDataChanged();
            res.close();
        } catch (Exception e) {
            
        }
    }
    
    public void hienThiChiTietSach(ResultSet result) {
        try {
            ResultSet res = result;
            tableModelCT.setRowCount(0);
            while (res.next()) {
                String[] row = new String[4];
                row[0] = res.getString("MaCaBiet");
                row[1] = res.getString("MaSach");
                row[2] = res.getString("TinhTrangSach");
                row[3] = res.getString("TinhTrangPhucVu");
                
                
                tableModelCT.addRow(row);
            }
            tableModelCT.fireTableDataChanged();
            res.close();
        } catch (Exception e) {
            
        }
    }
    
    public void hienThiSachTG(ResultSet result) {
        try {
            ResultSet res = result;
            tableModelSTG.setRowCount(0);
            while (res.next()) {
                String[] row = new String[2];
                row[0] = res.getString("MaTG");
                row[1] = res.getString("MaSach");
            
                tableModelSTG.addRow(row);
            }
            tableModelSTG.fireTableDataChanged();
            res.close();
        } catch (Exception e) {
            
        }
    }
    
    public void hienThiDocGia(ResultSet result) {
        try {
            ResultSet res = result;
            tableModelDG.setRowCount(0);
            while (res.next()) {
                String[] row = new String[3];
                row[0] = res.getString("SoThe");
                row[1] = res.getString("HoTen");
                row[2] = res.getString("DVCT");
            
                tableModelDG.addRow(row);
            }
            tableModelDG.fireTableDataChanged();
            res.close();
        } catch (Exception e) {
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietSach = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSachTG = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTacGia = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSachMuon = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDocGia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblChiTietSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblChiTietSach);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 480, 240));

        tblSachTG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblSachTG);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 500, 280));

        jLabel20.setText("Sách");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        tblTacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblTacGia);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 490, 240));

        jLabel21.setText("Độc giả");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));

        jLabel22.setText("Tác Giả");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel23.setText("Sách TG");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel24.setText("Chi tiết sách");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 40, -1, -1));

        jLabel25.setText("Sách Mượn");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 390, -1, -1));

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblSach);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 480, 240));

        tblSachMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblSachMuon);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 420, 480, 270));

        tblDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tblDocGia);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 480, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BaiTap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTap3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tblChiTietSach;
    private javax.swing.JTable tblDocGia;
    private javax.swing.JTable tblSach;
    private javax.swing.JTable tblSachMuon;
    private javax.swing.JTable tblSachTG;
    private javax.swing.JTable tblTacGia;
    // End of variables declaration//GEN-END:variables
}
