/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.SinhVien;
import Model.SinhVienXem;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableSinhVienXem extends AbstractTableModel{
    private String Name[] = {"Mã sinh viên","Tên sinh viên","Môn Thi","Phòng Thi","Thòi gian","SBD"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class};
    
    SinhVienXem sv=new SinhVienXem();
    
    public TableSinhVienXem(SinhVienXem sinhvien) {
        sv = sinhvien;
    }
    @Override
    public int getRowCount() {
        return 1;
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
            case 0: return sv.getMaSV();
            
            case 1: return sv.getTenSV();
            
            case 2: return sv.getMonThi();
             
            case 3: return sv.getPhongThi();
            
            case 4: return sv.getThoiGian();
            
            case 5: return sv.getsBD();
            default : return null;
        }
    }
    
}
