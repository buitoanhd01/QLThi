/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author admin
 */
public class Btl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login  f = new Login();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
    }
    
}
