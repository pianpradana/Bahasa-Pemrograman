/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

import javax.print.DocFlavor;
import javax.swing.JOptionPane;

/**
 * Program Menghitung Luas Persegi Panjang
 * Ditampilkan menggunakan JOptionPane.showMessageDialog
 * Dibuat Oleh Alfian Rifqi Pradana
 * Prodi Sistem Informasi
 * NIM 2019081046
 */

public class VisualLuasPersegiPanjang {
    public static void main(String[] args) {
        
        byte panjang, lebar;
        
        
        String NilaiA = JOptionPane.showInputDialog("Panjang ");
        String NilaiB = JOptionPane.showInputDialog("Lebar ");
       
        panjang = Byte.parseByte(NilaiA);
        lebar = Byte.parseByte(NilaiB);

        short luas = (short) (panjang * lebar);
        
        JOptionPane.showMessageDialog(null, "Luas = Panjang x Lebar = " + panjang + " x " + lebar + " = " + luas);
    }
    
}
