/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.CanBo;
import Model.ChiTietCaThi;
import Model.MonThi;
import Model.PhongThi;
import Model.SinhVien;
import Model.ToChucThi;
import Table.TableToChucThi;
import Table.TableChiTietCaThi;
import Utils.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MIS
 */
public class QuanLyToChucThi extends javax.swing.JFrame {
    ArrayList<ToChucThi> dsToChuc = new ArrayList<ToChucThi>();
    ArrayList<MonThi> dsmon = new ArrayList<MonThi>();
    ArrayList<PhongThi> dsphong = new ArrayList<PhongThi>();
    ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
    ArrayList<ChiTietCaThi> dschitiet = new ArrayList<ChiTietCaThi>();
    ArrayList<ChiTietCaThi> dschitietnew = new ArrayList<ChiTietCaThi>();
    ArrayList<SinhVien> dssinhVien = new ArrayList<SinhVien>();
    /**
     * Creates new form ToChucThi
     */
    int dongchon = -1;
    int dongchon1 = -1;
    int id = -1;
    ToChucThi tc = new ToChucThi();
    MonThi mon = new MonThi();
    PhongThi phong = new PhongThi();
    CanBo cb = new CanBo();
    ChiTietCaThi ct = new ChiTietCaThi();
    SinhVien sv = new SinhVien();
    
    public QuanLyToChucThi() {
        initComponents();
        LoadTableToChucFromFile();
        LoadTableToChuc();
        
        LoadListMonThi();
        LoadListPhongThi();
        LoadListCanBo();
        
        LoadListMaSv();
        LoadTableChiTietFromFile();
        LoadTableChiTiet();
    }
    
    public void LoadListMaSv(){
        //danh sách 
        File f = new File("danhSachSinhVien.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            sv = new SinhVien(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],txt[6]);
            dssinhVien.add(sv);
            txtMaSv.addItem(sv.getMaSV());
        }
    }
    
    public void LoadListCanBo(){
        //danh sách phòng thi
        File f = new File("danhSachCanBo.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            cb = new CanBo(txt[0],txt[1]);
            dsCanBo.add(cb);
            txtCanBo.addItem(cb.getTenCanBo());
        }
    }
    
    public void LoadListMonThi(){
        //danh sách phòng thi
        File f = new File("danhSachMonThi.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            mon = new MonThi(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],txt[6]);
            dsmon.add(mon);
            txtMon.addItem(mon.getTenMon());
        }
    }
    
    public void LoadListPhongThi(){
        //danh sách phòng thi
        File f = new File("danhSachPhongThi.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            phong = new PhongThi(txt[0], txt[1]);
            dsphong.add(phong);
            txtPhong.addItem(phong.getTenPhong());
        }
    }
    
    void LoadTableToChucFromFile(){
        File f = new File("danhSachToChucThi.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            tc = new ToChucThi(txt[0],txt[1],txt[2],txt[3],txt[4]);
            dsToChuc.add(tc);
        }
    }
    
    private void WriteTableToFile(){
        try {
                FileWriter fr = new FileWriter("danhSachToChucThi.txt");
                for(int i=0;i<dsToChuc.size();i++){
                    if(dsToChuc.indexOf(dsToChuc.get(i))<dsToChuc.size()-1)
                    {
                    fr.write(dsToChuc.get(i).toString() + "\n");
                    }
                    else
                        fr.write(dsToChuc.get(i).toString());
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(QuanLyToChucThi.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void WriteTableChiTietToFile(){
        try {
                FileWriter fr = new FileWriter("danhSachChiTietCaThi.txt");
                for(ChiTietCaThi t : dschitietnew){
                    fr.write(t.toString() + "\n");
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(QuanLyToChucThi.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void LoadTableToChuc(){
       jtableListToChucThi.setModel(new TableToChucThi(dsToChuc));
    }
    
    void LoadTableChiTietFromFile(){
        File f = new File("danhSachChiTietCaThi.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            ct = new ChiTietCaThi(txt[0],txt[1],txt[2],txt[3]);
            dschitiet.add(ct);
        }
    }
    public void LoadTableChiTiet(){
       tableChiTiet.setModel(new TableChiTietCaThi(dschitietnew));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableChiTietCaThi = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChiTiet = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txtMaSv = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtsbd = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txttensv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtThoiGian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableListToChucThi = new javax.swing.JTable();
        txtLop = new javax.swing.JComboBox<>();
        txtMon = new javax.swing.JComboBox<>();
        txtPhong = new javax.swing.JComboBox<>();
        txtCanBo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        tableChiTietCaThi.setMinimumSize(new java.awt.Dimension(700, 400));
        tableChiTietCaThi.setModal(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CHI TIẾT CA THI");

        tableChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Mã Sinh Viên", "Tên Sinh Viên", "SBD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChiTietMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableChiTiet);

        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã Sinh Viên:");

        jLabel9.setText("SBD:");

        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên Sinh Viên:");

        javax.swing.GroupLayout tableChiTietCaThiLayout = new javax.swing.GroupLayout(tableChiTietCaThi.getContentPane());
        tableChiTietCaThi.getContentPane().setLayout(tableChiTietCaThiLayout);
        tableChiTietCaThiLayout.setHorizontalGroup(
            tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton3)
                .addGap(127, 127, 127)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsbd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttensv, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        tableChiTietCaThiLayout.setVerticalGroup(
            tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableChiTietCaThiLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tableChiTietCaThiLayout.createSequentialGroup()
                        .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txttensv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(tableChiTietCaThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtsbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("TỔ CHỨC THI");

        jLabel2.setText("Lớp:");

        jLabel3.setText("Môn:");

        jLabel4.setText("Thời gian:");

        jLabel5.setText("Phòng thi:");

        jLabel6.setText("Cán bộ coi thi:");

        jtableListToChucThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lớp", "Môn Thi", "Thời Gian", "Phòng Thi", "Cán Bộ Coi Thi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableListToChucThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableListToChucThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableListToChucThi);

        txtLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "201", "202", "203", "304", "205" }));

        txtCanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanBoActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Chi tiết");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Thoát");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1)
                        .addGap(201, 201, 201)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
                if(txtLop.getSelectedItem().toString().equals("")|| txtMon.getSelectedItem().toString().equals("") 
                        || txtThoiGian.getText().equals("") || txtPhong.getSelectedItem().toString().equals("") || txtCanBo.getSelectedItem().toString().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane," Bạn cần điền đầy đủ dữ kiện");
                }
                else{
                    String lop = txtLop.getSelectedItem().toString();
                    String mon = txtMon.getSelectedItem().toString();
                    String thoigian = txtThoiGian.getText();
                    String phongthi = txtPhong.getSelectedItem().toString();
                    String canbo = txtCanBo.getSelectedItem().toString();
                    tc = new ToChucThi(lop, mon, thoigian, phongthi, canbo);
                    File f = new File("danhSachToChucThi.txt");
                    f.WriteToFile(tc.toString());
                    dsToChuc.add(tc);
                    LoadTableToChuc();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtableListToChucThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableListToChucThiMouseClicked
        dongchon = jtableListToChucThi.getSelectedRow();
        dschitietnew.clear();
        if(dongchon !=-1){
            id = dongchon;
            for(ChiTietCaThi c : dschitiet){
                if(Integer.parseInt(c.getId()) == dongchon){
                    dschitietnew.add(c);
                }
            }
            
        }
        LoadTableChiTiet();
    }//GEN-LAST:event_jtableListToChucThiMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dongchon = jtableListToChucThi.getSelectedRow();
//        if(dongchon !=-1){
//            tc = dsToChuc.get(dongchon);
//            
//        }
        tableChiTietCaThi.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableChiTietCaThi.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        int id = (int)Math.random()*10 + 1;
        try{
                if(txtMaSv.getSelectedItem().toString().equals("")|| txttensv.getText().equals("") || txtsbd.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane," Bạn cần điền đầy đủ dữ kiện");
                }
                else{
                    String masv = txtMaSv.getSelectedItem().toString();
                    String tensv = txttensv.getText();
                    String sbd = txtsbd.getText();
                    ct = new ChiTietCaThi(String.valueOf(id), masv, tensv, sbd);
                    File f = new File("danhSachChiTietCaThi.txt");
                    f.WriteToFile(ct.toString());
                    dschitietnew.add(ct);
                    LoadTableChiTiet();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChiTietMouseClicked
        dongchon1 = tableChiTiet.getSelectedRow();
        if(dongchon1 !=-1){
            ct = dschitietnew.get(dongchon1);
            txtMaSv.setSelectedItem(ct.getMasv()+"");
            txttensv.setText(ct.getTensv()+"");
            txtsbd.setText(ct.getSbd()+"");
        }
        System.out.println(dongchon1);
    }//GEN-LAST:event_tableChiTietMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dongchon1 = tableChiTiet.getSelectedRow();
        if(dongchon1 !=-1){
            try{
                if(txtMaSv.getSelectedItem().toString().equals("")|| txttensv.getText().equals("") || txtsbd.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane," Bạn cần điền đầy đủ dữ kiện");
                }
                else{
                    String masv = txtMaSv.getSelectedItem().toString();
                    String tensv = txttensv.getText();
                    String sbd = txtsbd.getText();
                    ChiTietCaThi ctcathhi = new ChiTietCaThi(String.valueOf(dongchon),masv,tensv,sbd);
                    dschitietnew.set(dongchon1,ctcathhi);
                    WriteTableChiTietToFile();
                    LoadTableChiTiet();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
        }else{
            JOptionPane.showConfirmDialog(this,"Bạn chưa chọn dòng để sửa!","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dongchon1 = tableChiTiet.getSelectedRow();
        if(dongchon1 !=-1){
            dschitietnew.remove(dongchon1);
            WriteTableChiTietToFile();
            LoadTableChiTiet();
        }else{
            JOptionPane.showConfirmDialog(this,"Bạn chưa chọn dòng để xóa!","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int ret=JOptionPane.showConfirmDialog(null,
                "bạn chắc chắn muốn thoát?", "Thoát",
                JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION){
            new Home().setVisible(true);
            this.setVisible(false);
        }    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtCanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanBoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanBoActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyToChucThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyToChucThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyToChucThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyToChucThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyToChucThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtableListToChucThi;
    private javax.swing.JTable tableChiTiet;
    private javax.swing.JDialog tableChiTietCaThi;
    private javax.swing.JComboBox<String> txtCanBo;
    private javax.swing.JComboBox<String> txtLop;
    private javax.swing.JComboBox<String> txtMaSv;
    private javax.swing.JComboBox<String> txtMon;
    private javax.swing.JComboBox<String> txtPhong;
    private javax.swing.JTextField txtThoiGian;
    private javax.swing.JTextField txtsbd;
    private javax.swing.JTextField txttensv;
    // End of variables declaration//GEN-END:variables
}
