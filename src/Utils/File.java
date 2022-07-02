/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Model.MonThi;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author MIS
 */
public class File {
    private String filename;
    

    public File(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public ArrayList<String> ReadFromFile(){
        ArrayList<String> list= new ArrayList<String>();
        try {
            list.clear();
            FileReader fr = new FileReader(this.getFilename());
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true){
                line = br.readLine();
                if(line == null)
                    break;
//                txt = line.split(",");
                list.add(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public void WriteToFile(String txt){
        try {
            FileWriter fr = new FileWriter(this.getFilename(),true);
            fr.write("\n" + txt);
            
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    public static void main(String[] args) {
//        File f = new File("danhSachMonThi.txt");
//        f.WriteToFile(new MonThi("asa", "huhs", "2331", "232").toString());
//    }
}
