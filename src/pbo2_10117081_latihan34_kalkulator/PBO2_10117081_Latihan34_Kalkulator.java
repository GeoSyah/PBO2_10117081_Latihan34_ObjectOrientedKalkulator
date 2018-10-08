/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan34_kalkulator;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program untuk membantu perhitungan
 */
public class PBO2_10117081_Latihan34_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner hitung = new Scanner(System.in);
        Kalkulator bilangan = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Bilangan ke-1 : ");
        bilangan.value1 = hitung.nextDouble();
        System.out.print("Masukkan Bilangan ke-2 : ");
        bilangan.value2 = hitung.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan : "+bilangan.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+bilangan.kurangBilangan());
        System.out.println("Hasil Perkalian : "+bilangan.kaliBilangan());
        System.out.println("Hasil Pembagian : "+bilangan.bagiBilangan());
        System.out.println("Sisa Hasil : "+bilangan.sisaBilangan());
    }
    
}
