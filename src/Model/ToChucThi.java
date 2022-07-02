/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLySinhVien;
import View.QuanLyToChucThi;
import java.util.ArrayList;

/**
 *
 * @author MIS
 */
public class ToChucThi {
    private String lop;
    private String monthi;
    private String thoigianthi;
    private String phongthi;
    private String canbocoithi;
    ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
    
    public ToChucThi() {
    }

    public ToChucThi(String lop, String monthi, String thoigianthi, String phongthi, String canbocoithi) {
        this.lop = lop;
        this.monthi = monthi;
        this.thoigianthi = thoigianthi;
        this.phongthi = phongthi;
        this.canbocoithi = canbocoithi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMonthi() {
        return monthi;
    }

    public void setMonthi(String monthi) {
        this.monthi = monthi;
    }

    public String getThoigianthi() {
        return thoigianthi;
    }

    public void setThoigianthi(String thoigianthi) {
        this.thoigianthi = thoigianthi;
    }

    public String getPhongthi() {
        return phongthi;
    }

    public void setPhongthi(String phongthi) {
        this.phongthi = phongthi;
    }

    public String getCanbocoithi() {
        return canbocoithi;
    }

    public void setCanbocoithi(String canbocoithi) {
        this.canbocoithi = canbocoithi;
    }

    @Override
    public String toString() {
        return lop + "," + monthi + "," + thoigianthi + "," + phongthi + "," + canbocoithi;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyToChucThi tennis = new QuanLyToChucThi();
        tennis.show();
    }

}
