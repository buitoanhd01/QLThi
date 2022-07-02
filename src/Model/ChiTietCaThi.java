/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MIS
 */
public class ChiTietCaThi {
    private String id;
    private String masv;
    private String tensv;
    private String sbd;

    public ChiTietCaThi() {
    }

    public ChiTietCaThi(String id, String masv, String tensv, String sbd) {
        this.id = id;
        this.masv = masv;
        this.tensv = tensv;
        this.sbd = sbd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    @Override
    public String toString() {
        return id + "," + masv + "," + tensv + "," + sbd;
    }
    
    
}
