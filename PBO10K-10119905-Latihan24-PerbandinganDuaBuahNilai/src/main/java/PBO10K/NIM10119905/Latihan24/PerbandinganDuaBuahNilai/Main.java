/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan24.PerbandinganDuaBuahNilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program untuk membandingkan dua buah nilai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        int a, b ;
        String ulang = "ya"; 
        
       
        System.out.println("====== Program Perbandingan Nilai ======");
        for(String x = "x"; x.equals("x");){
            if(ulang.equals("ya")){    
                System.out.println("Masukan Nilai Pertama : ");
                a = scanner.nextInt();
                System.out.println("Masukan Nilai Kedua   : ");
                b = scanner.nextInt();

               if (a>b){
                   System.out.println("Hasil : "+a +" lebih Besar dari "+b);
               }  
               else if (a<b){
                   System.out.println("Hasil : "+a +" Lebih kecil dari "+b);
               } 
               else if (a==b){
                   System.out.println("Hasil : "+a +" Sama dengan "+b);
               }
               System.out.println("Ulangi Aktivitas ? (Ya/Tidak) : ");
               ulang = scanner.next();
               ulang = ulang.toLowerCase();
               
            }
                else if(ulang.equals("tidak"))
            {
                System.exit(0);
            }    
            else
            {
                System.out.println("Pilihan salah ");
                System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
                ulang = scanner.next();
                ulang = ulang.toLowerCase();
                System.out.println();
            }
}
    }  
}
    
