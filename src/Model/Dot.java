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
public class Dot {
    private String maDot;
    private String tenDot;
   
    
    public Dot(String maDot, String tenDot) {
        this.maDot = maDot;
        this.tenDot = tenDot;
        
    }

    public Dot() {
    }

    public String getMaDot() {
        return maDot;
    }

    public void setMaDot(String maDot) {
        this.maDot = maDot;
    }

    public String getTenDot() {
        return tenDot;
    }

    public void setTenDot(String tenDot) {
        this.tenDot = tenDot;
    }

    @Override
    public String toString() {
        return maDot + "," + tenDot;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyKy tennis = new QuanLyKy();
        tennis.show();
    }
}
