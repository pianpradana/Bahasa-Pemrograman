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
public class lab_3_String {
    
    public static void main(String[] args) {
        
        String kalimat = JOptionPane.showInputDialog("Masukan Kalimat");
                
        System.out.println(kalimat);
        
        char[] kata = kalimat.toCharArray();
        
        for (char huruf:kata){
            
            if(huruf==' '){

                System.out.println("\n");
                
                continue;}
            
                System.out.println(huruf);
            }
            
        }
        
        
    }
    

