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
public class LulusPelajaran {
    
    public static void main(String[] args) {
         
        String nama = JOptionPane.showInputDialog("Nama Anda");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai Pelajaran 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai Pelajaran 2"));
        
        if ((n1>=75) && (n2>=60)){
            
                 String ket = "LULUS";
                  JOptionPane.showMessageDialog(null, "Nama Anda : " + nama + "\n" + 
                         "Nilai Pelajaran 1 : " + n1 + "\n" + 
                         "Nilai Pelajaran 2 : " + n2 + "\n" + 
                         "Keterangan : " + ket );
        }
        
        else{
                String ket = "Salah satu/keduanya belum lulus";
                 JOptionPane.showMessageDialog(null, "Nama Anda : " + nama + "\n" + 
                         "Nilai Pelajaran 1 : " + n1 + "\n" + 
                         "Nilai Pelajaran 2 : " + n2 + "\n" + 
                         "Keterangan : " + ket );

            
        }
         
     }
    
    
    
}
