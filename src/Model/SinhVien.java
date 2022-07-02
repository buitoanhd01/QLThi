/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLySinhVien;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String queQuan;
    private String ngaySinh;
    private String soDienThoai;
    private String khoa;
    private String dieuKienThi;
    
    public SinhVien(String maSV, String tenSV,String dieuKienThi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.dieuKienThi = dieuKienThi;
        
    }

    public SinhVien(String maSV, String tenSV, String queQuan, String ngaySinh, String soDienThoai, String khoa, String dieuKienThi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.queQuan=queQuan;
        this.ngaySinh=ngaySinh;
        this.soDienThoai=soDienThoai;
        this.khoa=khoa;
        this.dieuKienThi = dieuKienThi;
    }
    
    

    
    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getDieuKienThi() {
        return dieuKienThi;
    }

    public void setDieuKienThi(String dieuKienThi) {
        this.dieuKienThi = dieuKienThi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }


    @Override
    public String toString() {
        return maSV + "," + tenSV + "," + queQuan + "," + ngaySinh + "," + soDienThoai + "," + khoa + "," + dieuKienThi;
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        QuanLySinhVien tennis = new QuanLySinhVien();
        tennis.show();
    }
}
