/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.Khoa;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableKhoa extends AbstractTableModel{
    private String Name[] = {"Mã khoa","Tên khoa"};
    
    private Class classess[]  = {String.class,String.class};
    
    ArrayList<Khoa> dsKhoa = new ArrayList<Khoa>();
    
    public TableKhoa(ArrayList<Khoa> khoa) {
        dsKhoa = khoa;
    }
    @Override
    public int getRowCount() {
        return dsKhoa.size();
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
            case 0: return dsKhoa.get(rowIndex).getMaKhoa();
            
            case 1: return dsKhoa.get(rowIndex).getTenKhoa();
            
            
            
            default : return null;
        }
    }
    
}
