/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLyKy;

/**
 *
 * @author admin
 */
public class Khoa {
    private String maKhoa;
    private String tenKhoa;
   
    
    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa =  maKhoa;
        this.tenKhoa = tenKhoa;
        
    }

    public Khoa() {
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return maKhoa + "," + tenKhoa;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyKy tennis = new QuanLyKy();
        tennis.show();
    }
}
