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

public class kelasMobil {
    
    private String sMerek; //Atribut
    private String sWarna; 
    private String sNoPol;
    String sPemilik;

   public kelasMobil() {

   sMerek = "Avanza";
   sWarna = "Putih";
   sNoPol = "B1231";
   sPemilik = ""; 
   
   
    }
   
   public kelasMobil(String s1, String s2, String s3, String s4){
       
       sMerek = s1;
       sWarna = s2;
       sNoPol = s3;
       sPemilik = s4;
       
   }


   public String getId(){ //method untuk mengambil return value
       
       String output;
       output = "Merek: " + sMerek + "\n" + "Warna: " + sWarna + "\n" + "Nomor Polisi: " + sNoPol + "\n" + "Pemilik: " + sPemilik;
       
       return output;
       
   }
   
   public void setId(String merek, String warna, String noPol, String pemilik){ //method untuk mengisi atribut kelas 
       
       sMerek = merek;
       sWarna = warna;
       sNoPol = noPol;
       sPemilik = pemilik;
       
       
   }
   
   
   public void setColor(String warna){
       
       sWarna = warna;
       
   }
   
   public void setPemilik(String pemilik){
       
       sPemilik = pemilik;
       
   }
    
    }
   



   

    