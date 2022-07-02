/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import Model.AccountModel;
import View.Login;

/**
 *
 * @author .K
 */
public class Account {
    public static ArrayList danh_sach_TK() throws FileNotFoundException, IOException{
        ArrayList<AccountModel> list = new ArrayList<>();
        String url = "account.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            while (scanner.hasNextLine()) {
                AccountModel a = new AccountModel();
                a.setUsername(scanner.nextLine());
                a.setPassword(scanner.nextLine());
                a.setTen(scanner.nextLine());
                list.add(a);
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                 java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
