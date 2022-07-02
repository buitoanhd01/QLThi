/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.Ky;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableKy extends AbstractTableModel{
    private String Name[] = {"Mã kỳ","Tên kỳ"};
    
    private Class classess[]  = {String.class,String.class};
    
    ArrayList<Ky> dsKy = new ArrayList<Ky>();
    
    public TableKy(ArrayList<Ky> ky) {
        dsKy = ky;
    }
    @Override
    public int getRowCount() {
        return dsKy.size();
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
            case 0: return dsKy.get(rowIndex).getMaKy();
            
            case 1: return dsKy.get(rowIndex).getTenKy();
            
            
            
            default : return null;
        }
    }
    
}
