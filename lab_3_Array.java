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
public class lab_3_Array {
    
    public static void main (String[] args) {
        
   /**     String kalimat = "ABCDEFGHI";
        System.out.println(kalimat);
        //String potongan2 = kalimat.substring(4,6);
        
        char huruf = kalimat.charAt(4);
        System.out.println("kalimat.charAt(4) = " +huruf);
        
        String potongan1 = kalimat.substring(4);
        System.out.println("kalimat.substring(4) = " +potongan1);
        
        String potongan2 = kalimat.substring(2,5);//indeks ke 5 mengurangi indeks ke 2, jadi 5 - 2 = 3, 3 = D
        System.out.println("kalimat.substring(4) = " +potongan2);
        
        kalimat = ("AB#CDE#FGHI");
        System.out.println(kalimat);
        int idx = kalimat.lastIndexOf('#');
        System.out.println("kalimat.lastIndexOf('#')= " +idx);

        String tipeDouble = Double.toString(14.2);
        String tipeFloat = Float.toString(1420000000);
        int nilai = 3;
        
        System.out.println(Integer.toString(nilai*4));
        System.out.println(tipeDouble);
        System.out.println(tipeFloat);
        
        char[] arrayC = new char[3];
        
        arrayC[0] = 'U';
        arrayC[1] = 'P';
        arrayC[2] = 'J';
        
        for(char hurufC:arrayC) {
            
            System.out.println(hurufC);
        }
        
    }
    
*/
   
  
char [] arrayC = {'k','a','k','i','k','a','k','a','k','k','e','n','a','k','a','y','u','t','a','k','b','e','r','p','a','k','u','k','a','k','u','k','a','k','u'};

  
  System.out.print("Isi object array : ");

        for(char c : arrayC) {
            
             System.out.print(c);
            
        }
        
         System.out.print("\n-----------------------------------\n");

        
        System.out.println("Jumlah character : "+arrayC.length);
        
        int jmlK = 0;
        
        for (char hurufK:arrayC) {
            
            if (hurufK == 'k') {
                
                jmlK++;
            }
        
        }
                       System.out.println("Isi Huruf K : " +jmlK);

        
        }
        
    }
    


