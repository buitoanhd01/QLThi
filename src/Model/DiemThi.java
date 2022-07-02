/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLyDiemThi;

/**
 *
 * @author admin
 */
public class DiemThi {
    private String maMon;
    private String tenMon;
    private String maSV;
    private String tenSV;
    private float diem;
    private String khoa;
    private String ky;
    private String dot;

    public DiemThi( String maSV, String tenSV, String tenMon, float diem) {
        this.tenMon = tenMon;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diem = diem;
    }
    
    
    public DiemThi(String mamon, String tenmon, String masv, String tensv,float diem, String khoa, String ky, String dot) {
        this.maMon = mamon;
        this.tenMon = tenmon;
        this.maSV = masv;
        this.tenSV = tensv;
        this.diem = diem;
        this.khoa = khoa;
        this.ky = ky;
        this.dot = dot;
        
    }

    public DiemThi() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
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

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getKy() {
        return ky;
    }

    public void setKy(String ky) {
        this.ky = ky;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    @Override
    public String toString() {
        return maSV + "," + tenSV + "," + tenMon + "," + diem;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyDiemThi tennis = new QuanLyDiemThi();
        tennis.show();
    }
}
