/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Table.TableDiemThi;
import Model.DiemThi;
import Model.Khoa;
import Model.MonThi;
import Model.SinhVien;
import Utils.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class QuanLyDiemThi extends javax.swing.JFrame {
    
    ArrayList<DiemThi> dsDiemThi = new ArrayList<DiemThi>();
    ArrayList<MonThi> dsMonThi = new ArrayList<MonThi>();
    ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
    
    
    int dongchon = -1;
    
    DiemThi diemthi = new DiemThi();
    MonThi monthi =new MonThi();
    SinhVien sinhvien=new SinhVien();
    
    /**
     * Creates new form QuanLyDiemThi
     */
    public QuanLyDiemThi() {
        initComponents();
        LoadTableFromFile();
        LoadTableDiemThi();
        indexComboBox();
    }
    
    void LoadTableFromFile(){
        File f = new File("danhSachDiemThi.txt");
        File f1 = new File("danhSachSinhVien.txt");
        File f2 = new File("danhSachMonThi.txt");
        
        ArrayList<String> list = f.ReadFromFile();
        ArrayList<String> listsv = f1.ReadFromFile();
        ArrayList<String> listmon = f2.ReadFromFile();
        
        for(String s : list){
            String[] txt = s.split(",");
            diemthi = new DiemThi(txt[0],txt[1],txt[2],Float.parseFloat(txt[3]));
            dsDiemThi.add(diemthi);
        }
        for(String s : listmon){
            String[] txt = s.split(",");
            monthi = new MonThi(txt[0],txt[1],txt[2],txt[3]);
            dsMonThi.add(monthi);
        }
        for(String s : listsv){
            String[] txt = s.split(",");
            sinhvien = new SinhVien(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],txt[6]);
            dsSinhVien.add(sinhvien);
        }
       
    }
    
    private void WriteTableToFile(){
        try {
                FileWriter fr = new FileWriter("danhSachDiemThi.txt");
                for(int i=0;i<dsDiemThi.size();i++){
                    if(dsDiemThi.indexOf(dsDiemThi.get(i))<dsDiemThi.size()-1)
                    {
                    fr.write(dsDiemThi.get(i).toString() + "\n");
                    }
                    else
                        fr.write(dsDiemThi.get(i).toString());
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(QuanLyDiemThi.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void LoadTableDiemThi(){
       jTableQuanLyDiemThi.setModel(new TableDiemThi(dsDiemThi));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbMaSV = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuanLyDiemThi = new javax.swing.JTable();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        cbMon = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfield_tensv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonThoat.setText("Tho??t");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QU???N L?? ??I???M THI");

        jLabel2.setText("M??n:");

        jLabel3.setText("M?? sinh vi??n:");

        cbMaSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaSVActionPerformed(evt);
            }
        });

        jLabel7.setText("??i???m:");

        jTableQuanLyDiemThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? sinh vi??n", "T??n sinh vi??n", "M??n", "??i???m"
            }
        ));
        jTableQuanLyDiemThi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableQuanLyDiemThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQuanLyDiemThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableQuanLyDiemThi);

        jButtonThem.setText("Th??m");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonSua.setText("S???a");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setText("X??a");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        cbMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonActionPerformed(evt);
            }
        });

        jLabel4.setText("T??n SV:");

        tfield_tensv.setEditable(false);
        tfield_tensv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfield_tensvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonThoat)
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonXoa)
                            .addComponent(jButtonSua)
                            .addComponent(jButtonThem))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfield_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThoat)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfield_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonThem)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSua)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonXoa)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        // TODO add your handling code here:

        try{
              if(Float.parseFloat(jTextFieldDiem.getText()) <0||Float.parseFloat(jTextFieldDiem.getText())>10 )
              {
                  JOptionPane.showMessageDialog(rootPane," L???i nh???p ??i???m");
              }
              else
              {
                String tenmon = cbMon.getSelectedItem().toString();
                String masv = cbMaSV.getSelectedItem().toString();
                String tensv = tfield_tensv.getText().toString();      
                float diem = Float.parseFloat(jTextFieldDiem.getText());
                diemthi = new DiemThi(masv ,tensv ,tenmon,diem);
                File f = new File("danhSachDiemThi.txt");
                f.WriteToFile(diemthi.toString());
                dsDiemThi.add(diemthi);
                LoadTableDiemThi();
               }
        }   
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        // TODO add your handling code here:
        dongchon = jTableQuanLyDiemThi.getSelectedRow();
        if(dongchon !=-1){
        try{
              if(Float.parseFloat(jTextFieldDiem.getText()) <0 ||Float.parseFloat(jTextFieldDiem.getText())>10 )
              {
                  JOptionPane.showMessageDialog(rootPane," L???i Sua ??i???m");
              }
              else
              {
                String tensv=tfield_tensv.getText().toString();

                String tenmon = cbMon.getSelectedItem().toString();
                String masv = cbMaSV.getSelectedItem().toString();
                float diem = Float.parseFloat(jTextFieldDiem.getText());

                    DiemThi diemthiNew = new DiemThi(masv ,tensv, tenmon,diem);
                    dsDiemThi.set(dongchon, diemthiNew);
                    WriteTableToFile();
                    LoadTableDiemThi();
                    }
        }   
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        }else{
            JOptionPane.showConfirmDialog(this,"chua chon dong sua","thong bao", WIDTH);
        }
    
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        dongchon = jTableQuanLyDiemThi.getSelectedRow();
        if(dongchon !=-1){
            dsDiemThi.remove(dongchon);
            WriteTableToFile();
            
            LoadTableDiemThi();
        }else{
            JOptionPane.showConfirmDialog(this,"B???n ch??a ch???n d??ng ????? x??a!","Th??ng b??o", WIDTH);
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jTableQuanLyDiemThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuanLyDiemThiMouseClicked
        // TODO add your handling code here:
        dongchon = jTableQuanLyDiemThi.getSelectedRow();
        if(dongchon !=-1){
            diemthi = dsDiemThi.get(dongchon);
            cbMon.setSelectedItem(diemthi.getTenMon()+"");
            cbMaSV.setSelectedItem(diemthi.getMaSV()+"");
            jTextFieldDiem.setText(diemthi.getDiem()+"");
        }
    }//GEN-LAST:event_jTableQuanLyDiemThiMouseClicked

    private void cbMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaSVActionPerformed
        // TODO add your handling code here:
        for(SinhVien i :dsSinhVien)
        {
            if(cbMaSV.getSelectedItem()==null){
                tfield_tensv.setText("");
            }
            else if((i.getMaSV()).equals(cbMaSV.getSelectedItem().toString()))
            {
                tfield_tensv.setText(i.getTenSV());
            }
        }
    }//GEN-LAST:event_cbMaSVActionPerformed

    private void cbMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbMonActionPerformed

    private void tfield_tensvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfield_tensvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfield_tensvActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        int ret=JOptionPane.showConfirmDialog(null,
                "b???n ch???c ch???n mu???n tho??t?", "Tho??t",
                JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION){
            new Home().setVisible(true);
            this.setVisible(false);
        }   
    }//GEN-LAST:event_jButtonThoatActionPerformed

    void indexComboBox(){
        
        cbMaSV.removeAllItems();
        for(SinhVien i: dsSinhVien){
            cbMaSV.addItem(i.getMaSV());
        }
        cbMon.removeAllItems();
        for(MonThi i: dsMonThi){
            cbMon.addItem(i.getTenMon());
        }
    }
    
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
            java.util.logging.Logger.getLogger(QuanLyDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiemThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMaSV;
    private javax.swing.JComboBox<String> cbMon;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQuanLyDiemThi;
    private javax.swing.JTextField jTextFieldDiem;
    private javax.swing.JTextField tfield_tensv;
    // End of variables declaration//GEN-END:variables
}
