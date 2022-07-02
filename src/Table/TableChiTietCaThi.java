/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.ChiTietCaThi;
import Model.ToChucThi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MIS
 */
public class TableChiTietCaThi extends AbstractTableModel{
    private String Name[] = {"ID","Mã Sinh Vien","Tên Sinh Vien","SBD"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class};
    
    ArrayList<ChiTietCaThi> dsChiTiet = new ArrayList<ChiTietCaThi>();
    
    public TableChiTietCaThi(ArrayList<ChiTietCaThi> ct) {
        dsChiTiet = ct;
    }
    @Override
    public int getRowCount() {
        return dsChiTiet.size();
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
            case 0: return dsChiTiet.get(rowIndex).getId();
            
            case 1: return dsChiTiet.get(rowIndex).getMasv();
            
            case 2: return dsChiTiet.get(rowIndex).getTensv();
             
            case 3: return dsChiTiet.get(rowIndex).getSbd();

            default : return null;
        }
    }
}
