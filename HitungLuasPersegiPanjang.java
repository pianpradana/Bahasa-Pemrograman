/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

import javax.swing.JOptionPane;

/**
 * Program Menghitung Luas Persegi Panjang
 * Ditampilkan menggunakan JOptionPane.showMessageDialog
 * Dibuat Oleh Alfian Rifqi Pradana
 * Prodi Sistem Informasi
 * NIM 2019081046
 */
public class HitungLuasPersegiPanjang {
    
    public static void main(String[] args) {

    byte panjang = 15;
    byte lebar = 30;
    short luas = (short) (panjang * lebar);
    
    JOptionPane.showMessageDialog(null, "Luas = Panjang x Lebar = " + panjang + " x " + lebar + " = " + luas);
        
        }
}
