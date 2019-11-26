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
public class Tugas_Luas_Segitiga {
        public static void main(String[] args) {
            
        int alas, tinggi, luas;
        
        String NilaiA = JOptionPane.showInputDialog("Alas ");
        String NilaiB = JOptionPane.showInputDialog("Tinggi ");
       
        alas = Integer.parseInt(NilaiA);
        tinggi = Integer.parseInt(NilaiB);
        
        luas = (alas * tinggi) / 2;
        
        JOptionPane.showMessageDialog(null, "Luas = Alas x Tinggi = " + alas + " x " + tinggi +  " / 2 = " + luas); 

            
        }

    
}
