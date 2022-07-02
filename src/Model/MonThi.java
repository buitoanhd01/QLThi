/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLyMonThi;

/**
 *
 * @author admin
 */
public class MonThi {
    private String maMon;
    private String tenMon;
    private String thoiGianThi;
    private String phongThi;
    private String khoa;
    private String ky;
    private String dot;

    public MonThi(String maMon, String tenMon, String thoiGianThi, String phongThi, String khoa, String ky, String dot) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.thoiGianThi = thoiGianThi;
        this.phongThi = phongThi;
        this.khoa = khoa;
        this.ky = ky;
        this.dot = dot;
    }

    public MonThi(String maMon, String tenMon, String thoiGianThi, String phongThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.thoiGianThi = thoiGianThi;
        this.phongThi = phongThi;
    }

    
    public MonThi() {
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
    
    

    public String getThoiGianThi() {
        return thoiGianThi;
    }

    public void setThoiGianThi(String thoiGianThi) {
        this.thoiGianThi = thoiGianThi;
    }

    public String getPhongThi() {
        return phongThi;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyMonThi tennis = new QuanLyMonThi();
        tennis.show();
    }
    
    @Override
    public String toString() {
        return maMon + "," + tenMon + "," + thoiGianThi + "," + phongThi + "," + khoa + "," + ky + "," + dot;
    }
}
