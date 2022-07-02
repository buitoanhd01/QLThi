/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import Model.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableSinhVien extends AbstractTableModel{
    private String Name[] = {"Mã sinh viên","Tên sinh viên","Quê Quán","Ngày Sinh","SDT","Khoa","Điều kiện thi"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
    
    public TableSinhVien(ArrayList<SinhVien> sinhvien) {
        dsSinhVien = sinhvien;
    }
    @Override
    public int getRowCount() {
        return dsSinhVien.size();
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
            case 0: return dsSinhVien.get(rowIndex).getMaSV();
            
            case 1: return dsSinhVien.get(rowIndex).getTenSV();
            
            case 2: return dsSinhVien.get(rowIndex).getQueQuan();
             
            case 3: return dsSinhVien.get(rowIndex).getNgaySinh();
            
            case 4: return dsSinhVien.get(rowIndex).getSoDienThoai();
            
            case 5: return dsSinhVien.get(rowIndex).getKhoa();
            
            case 6: return dsSinhVien.get(rowIndex).getDieuKienThi();
            

            default : return null;
        }
    }
    
}
