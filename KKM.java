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
public class KKM {
    
      public static void main(String[] args) {
        
        int nilai;
        
                String NilaiKamu = JOptionPane.showInputDialog("Masukan Nilai ");
                nilai = Integer.parseInt(NilaiKamu);
                
                String ket = nilai >= 70 ? "LULUS" : "REMED";
                JOptionPane.showMessageDialog(null, "Nilai Anda, " + nilai + "\n" + ket);
                


     /**    
      
        if(nilai > 100) {
          
         JOptionPane.showMessageDialog(null,"Nilai Anda Tidak Terdaftar");
           
        }
        
         
         else if(nilai >= 70) {
                    
                 JOptionPane.showMessageDialog(null, "Nilai Anda " +nilai+ ", Anda Lulus");

                }
         
         else if(nilai < 70) {
                    
                 JOptionPane.showMessageDialog(null, "Nilai Anda " +nilai+ ", Anda Remedial");

                }         
         
         else{
                    
                 JOptionPane.showMessageDialog(null, "Masukan Nilai");

                }
                                        
    */
}

}