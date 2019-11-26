/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

/**
 *
 * @author User
 */
public class LoopingPerkalian {
        public static void main(String[] args) {

            System.out.println("TABEL PERKALIAN");
                 
            System.out.println("=======================");
            
            for(int baris=1; baris<=10; baris++){
                              
                for(int kolom=1; kolom<=10; kolom++){
                    
                     int hasil = baris * kolom;
                    
                 
                 System.out.print(kolom + " x " + baris + " = " + hasil + "\t" );

                }   
                 
                    System.out.println("");
                    
                }
            
            
        }
}
