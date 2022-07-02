/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLyPhongThi;

/**
 *
 * @author admin
 */
public class PhongThi {
    private String maPhong;
    private String tenPhong;  
    
    public PhongThi(String maphong, String tenphong) {
        this.maPhong = maphong;
        this.tenPhong = tenphong;
        
       
    }

    public PhongThi() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    @Override
    public String toString() {
        return maPhong;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyPhongThi tennis = new QuanLyPhongThi();
        tennis.show();
    }
}
