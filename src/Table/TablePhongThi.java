/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.PhongThi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TablePhongThi extends AbstractTableModel{
    private String Name[] = {"Mã phòng","Tên phòng"};
    
    private Class classess[]  = {String.class,String.class};
    
    ArrayList<PhongThi> dsPhongThi = new ArrayList<PhongThi>();
    
    public TablePhongThi(ArrayList<PhongThi> phongthi) {
        dsPhongThi = phongthi;
    }
    @Override
    public int getRowCount() {
        return dsPhongThi.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    public String getColumnName(int column){
        return Name[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsPhongThi.get(rowIndex).getMaPhong();
            
            case 1: return dsPhongThi.get(rowIndex).getTenPhong();
            


            default : return null;
        }
    }
    
}
