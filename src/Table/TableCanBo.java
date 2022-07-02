/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.CanBo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableCanBo extends AbstractTableModel{
    private String Name[] = {"Mã cán bộ","Tên cán bộ"};
    
    private Class classess[]  = {String.class,String.class};
    
    ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
    
    public TableCanBo(ArrayList<CanBo> canbo) {
        dsCanBo = canbo;
    }
    @Override
    public int getRowCount() {
        return dsCanBo.size();
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
            case 0: return dsCanBo.get(rowIndex).getMaCanBo();
            
            case 1: return dsCanBo.get(rowIndex).getTenCanBo();
            
            
            
            default : return null;
        }
    }
    
}
