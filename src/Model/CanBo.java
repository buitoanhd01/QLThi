/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.QuanLyCanBoCoiThi;

/**
 *
 * @author admin
 */
public class CanBo {
    private String maCanBo;
    private String tenCanBo;
   
    
    public CanBo(String maCanBo, String tenCanBo) {
        this.maCanBo = maCanBo;
        this.tenCanBo = tenCanBo;
        
    }

    public CanBo() {
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getTenCanBo() {
        return tenCanBo;
    }

    public void setTenCanBo(String tenCanBo) {
        this.tenCanBo = tenCanBo;
    }

    

    @Override
    public String toString() {
        return maCanBo + "," + tenCanBo;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyCanBoCoiThi tennis = new QuanLyCanBoCoiThi();
        tennis.show();
    }
}
