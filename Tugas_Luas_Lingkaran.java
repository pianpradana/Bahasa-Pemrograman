/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tugas_Luas_Lingkaran {
    
    public static void main(String[] args) {
        
        int r;
        double phi, luas, keliling;
        
        phi = (double) 3.14;
        
        String Jari2 = JOptionPane.showInputDialog("Jari-Jari ");
       
        r = Integer.parseInt(Jari2);
        
        luas = phi * (r * r);
        keliling = 2 * phi * r;
        
        JOptionPane.showMessageDialog(null, "Luas Lingkaran = " + luas + "\n" + "Keliling Lingkaran = " + keliling ); 

            
        }
    
}
