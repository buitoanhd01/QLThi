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
public class Ky {
    private String maKy;
    private String tenKy;
   
    
    public Ky(String maKy, String tenKy) {
        this.maKy = maKy;
        this.tenKy = tenKy;
        
    }

    public Ky() {
    }

    public String getMaKy() {
        return maKy;
    }

    public void setMaKy(String maKy) {
        this.maKy = maKy;
    }

    public String getTenKy() {
        return tenKy;
    }

    public void setTenKy(String tenKy) {
        this.tenKy = tenKy;
    }

    @Override
    public String toString() {
        return maKy + "," + tenKy;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyKy tennis = new QuanLyKy();
        tennis.show();
    }
}
