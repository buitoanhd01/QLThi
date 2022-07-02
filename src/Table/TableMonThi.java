/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.Dot;
import Model.Khoa;
import Model.Ky;
import Model.MonThi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableMonThi extends AbstractTableModel{
    private String Name[] = {"Mã môn","Tên môn","Ngày thi" ,"Phòng thi","Khoa","Kỳ","Đợt"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<MonThi> dsMonThi = new ArrayList<MonThi>();
    ArrayList<Khoa> dsKhoa = new ArrayList<Khoa>();
    ArrayList<Ky> dsKy = new ArrayList<Ky>();
    ArrayList<Dot> dsDot = new ArrayList<Dot>();
    
    public TableMonThi(ArrayList<MonThi> monthi) {
        dsMonThi = monthi;
    }
    @Override
    public int getRowCount() {
        return dsMonThi.size();
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
            case 0: return dsMonThi.get(rowIndex).getMaMon();
            
            case 1: return dsMonThi.get(rowIndex).getTenMon();
            
            case 2: return dsMonThi.get(rowIndex).getThoiGianThi();
             
            case 3: return dsMonThi.get(rowIndex).getPhongThi();
            
            case 4: return dsMonThi.get(rowIndex).getKhoa();
            
            case 5: return dsMonThi.get(rowIndex).getKy();
            
            case 6: return dsMonThi.get(rowIndex).getDot();

            default : return null;
        }
    }
    
}
