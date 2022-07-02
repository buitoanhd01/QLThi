/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.ToChucThi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MIS
 */
public class TableToChucThi extends AbstractTableModel{
    private String Name[] = {"Lớp","Môn thi","Thời gian","Phòng thi","Cán bộ coi thi"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<ToChucThi> dsToChuc = new ArrayList<ToChucThi>();
    
    public TableToChucThi(ArrayList<ToChucThi> tc) {
        dsToChuc = tc;
    }
    @Override
    public int getRowCount() {
        return dsToChuc.size();
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
            case 0: return dsToChuc.get(rowIndex).getLop();
            
            case 1: return dsToChuc.get(rowIndex).getMonthi();
            
            case 2: return dsToChuc.get(rowIndex).getThoigianthi();
             
            case 3: return dsToChuc.get(rowIndex).getPhongthi();
            
            case 4: return dsToChuc.get(rowIndex).getCanbocoithi();

            default : return null;
        }
    }
}
