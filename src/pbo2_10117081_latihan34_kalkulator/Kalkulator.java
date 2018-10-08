/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan34_kalkulator;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Kelas : Program untuk program utama berisi rumusan penjumlahan
 * pengurangan, pengkalian, pembagian, dan sisa pembagian
 */
public class Kalkulator {
    
    public double value1;
    public double value2;

    public double tambahBilangan() {

        return value1 + value2;
    }

    public double kurangBilangan() {

        return value1 - value2;
    }

    public double kaliBilangan() {

        return value1 * value2;
    }

    public double bagiBilangan() {

        return value1 / value2;
    }

    public double sisaBilangan() {

        return value1 % value2;
    }
}
