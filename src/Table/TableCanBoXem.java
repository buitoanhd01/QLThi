/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.CanBo;
import Model.ChiTietCaThi;
import Model.ToChucThi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableCanBoXem extends AbstractTableModel{
    private String Name[] = {"Mã cán bộ","Tên cán bộ","Phòng thi"};
    
    private Class classess[]  = {String.class,String.class,String.class};
    
    ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
    
    ArrayList<ToChucThi> dsCanBoCoiThi = new ArrayList<ToChucThi>();
    
    public TableCanBoXem(ArrayList<CanBo> canbo) {
        dsCanBo = canbo;
    }
    
    public TableCanBoXem(ArrayList<CanBo> canbo, ArrayList<ToChucThi> canbocoithi) {
        dsCanBo = canbo;
        dsCanBoCoiThi = canbocoithi;
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
            
            case 2: return dsCanBoCoiThi.get(rowIndex).getPhongthi();
            
            default : return null;
        }
    }
    
}
