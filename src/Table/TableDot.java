/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.Dot;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableDot extends AbstractTableModel{
    private String Name[] = {"Mã đợt","Tên đợt"};
    
    private Class classess[]  = {String.class,String.class};
    
    ArrayList<Dot> dsDot = new ArrayList<Dot>();
    
    public TableDot(ArrayList<Dot> dot) {
        dsDot = dot;
    }
    @Override
    public int getRowCount() {
        return dsDot.size();
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
            case 0: return dsDot.get(rowIndex).getMaDot();
            
            case 1: return dsDot.get(rowIndex).getTenDot();
           
            
            
            default : return null;
        }
    }
    
}
