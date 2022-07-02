/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.DiemThi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableDiemThi extends AbstractTableModel{
    private String Name[] = {"Mã sinh viên","Tên sinh viên","Môn" ,"Điểm"};
    
    private Class classess[]  = {String.class,String.class,String.class,Float.class};
    
    ArrayList<DiemThi> dsDiemThi = new ArrayList<DiemThi>();
    
    public TableDiemThi(ArrayList<DiemThi> diemthi) {
        dsDiemThi = diemthi;
    }
    @Override
    public int getRowCount() {
        return dsDiemThi.size();
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
            case 0: return dsDiemThi.get(rowIndex).getMaSV();
            
            case 1: return dsDiemThi.get(rowIndex).getTenSV();
            
            case 2: return dsDiemThi.get(rowIndex).getTenMon();
             
            case 3: return dsDiemThi.get(rowIndex).getDiem();

            default : return null;
        }
    }
    
}
