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
 * 
 */

public class MobilGue {
    
    public static void main(String[] args) {
        
        kelasMobil mobilSaya = new kelasMobil();

        JOptionPane.showMessageDialog(null, mobilSaya.getId());
        
        //atribut pemilik
        
        mobilSaya.sPemilik = "Chan";
        JOptionPane.showMessageDialog(null, "Setelah di-update pemilik mobil" + "\n" + mobilSaya.getId());
        
        //ganti Id
        
        mobilSaya.setId("XPander", "Silver", "B 22 Can", "Chaerul");
        JOptionPane.showMessageDialog(null, "Setelah di-update identitas" + "\n" + mobilSaya.getId());
        
        kelasMobil mobilKantor = new kelasMobil("Fortuner", "Putih", "B 888 UPJ", "Universitas Pembangunan Jaya");
        JOptionPane.showMessageDialog(null,"Setelah di-update" + "\n" + mobilKantor.getId());
        
        String warna = JOptionPane.showInputDialog(null, "Ganti Warna");
        mobilSaya.setColor(warna);
        
        //JOptionPane.showMessageDialog(null, "Warna Sudah Diganti" + "\n" + mobilSaya.getId());
        //String pemilik = JOptionPane.showInputDialog(null, "Ganti Pemilik");
        
        mobilSaya.sPemilik = JOptionPane.showInputDialog(null, "Ganti Pemilik");
        
        JOptionPane.showMessageDialog(null, "Pemilik dan Warna Sudah Diganti" + "\n" + mobilSaya.getId());
        
        
    }
    
}
