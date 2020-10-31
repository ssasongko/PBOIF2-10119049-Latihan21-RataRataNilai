/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan21.rataratanilai;
import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program menampilkan rata rata nilai mahasiswa
 */
public class PBOIF210119049Latihan21RataRataNilai {
    public static Scanner scan = new Scanner(System.in);
    
    public static int getBanyakNilai(int banyakNilai){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        return banyakNilai =  scan.nextInt();
    }
    
    public static double[] setNilaiMahasiswa(int banyakNilai, double[] nilaiMahasiswa){
//        init var i for looping
        int i;
                     
//       set values and loop through maximum number of input banyakNilai
        for(i = 0; i < banyakNilai; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa[i] = scan.nextDouble();       
        }  
        
        return nilaiMahasiswa;
    }

     public static double getTotal(int banyakNilai, double[] nilaiMahasiswa){
         double total;
          
//        iterate using recursion
        if (banyakNilai == 1){
            total = nilaiMahasiswa[0];
        }
        else{
            total = getTotal(banyakNilai - 1, nilaiMahasiswa) + nilaiMahasiswa[banyakNilai-1];
        }      
        return total;
    }
     
    public static double getAVG(double total, int jumlah){
        return total/jumlah;
    }

   public static void tampilHasil(double avg){
       System.out.println("Maka rata-rata nilainya adalah : " + avg);
       System.out.println("Developed by : Nur Sasongko");
   }
    
    public static void main(String[] args) {
        // init
        int banyakNilai = 0;
        double total,avg;
        double[] nilaiMahasiswa = new double[255];  
        
        banyakNilai = getBanyakNilai(banyakNilai);
        
        // call proc
        setNilaiMahasiswa(banyakNilai, nilaiMahasiswa);
        
        total = getTotal(banyakNilai,nilaiMahasiswa);
        avg = getAVG(total, banyakNilai);
        tampilHasil(avg);    
   
    }
}


//     public static double getNilaiRataRata(int banyakNilai, double[] nilaiMahasiswa){
//         double total,avg = 0;
//          
////        iterate using recursion
//        if (banyakNilai == 1){
//            total = nilaiMahasiswa[0];
////            System.out.println("Banyak Nilai ? " + total);
//        }
//        else{
//            total = getNilaiRataRata(banyakNilai - 1, nilaiMahasiswa) + nilaiMahasiswa[banyakNilai-1];
////            System.out.println("Banyak Nilai ? " + banyakNilai + " : " +  nilaiMahasiswa[banyakNilai-1]);
//        }      
//        
////        System.out.println("Banyak Nilai akhir " + banyakNilai);
////        System.out.println("total Saat ini " + total);
//        System.out.println(avg);
//        avg = total/banyakNilai;
//        return avg;
//    }
