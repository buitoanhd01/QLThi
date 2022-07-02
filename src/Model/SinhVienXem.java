/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import View.SinhVienXemLichThi;
/**
 *
 * @author ACER
 */
public class SinhVienXem {
    private String maSV;
    private String tenSV;
    private String monThi;
    private String phongThi;
    private String thoiGian;
    private String sBD;

    public SinhVienXem() {
    }

    @Override
    public String toString() {
        return "maSV=" + maSV + ", tenSV=" + tenSV + ", monThi=" + monThi + ", phongThi=" + phongThi + ", thoiGian=" + thoiGian ;
    }

    public String getsBD() {
        return sBD;
    }

    public void setsBD(String sBD) {
        this.sBD = sBD;
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

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    public String getPhongThi() {
        return phongThi;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public SinhVienXem(String maSV, String tenSV, String monThi, String phongThi, String thoiGian,String sBD) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.monThi = monThi;
        this.phongThi = phongThi;
        this.thoiGian = thoiGian;
        this.sBD=sBD;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienXemLichThi tennis = new SinhVienXemLichThi();
        tennis.show();
    }
}
