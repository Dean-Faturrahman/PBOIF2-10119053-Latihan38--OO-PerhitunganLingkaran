/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan38.oo.perhitunganlingkaran;

import java.util.Scanner;
import rumus.Rumus;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program menghitung rata rata nilai
 */
public class PBOIF210119053Latihan38OOPerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rumus rum = new Rumus();
        
        System.out.println("======Perhitungan Lingkaran======");
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            rum.konversiAngka = input.next();
            rum.validasiAngka();
        } while (!rum.kondisi);
        
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = " + String.format("%.0f", rum.hitungJariJari()).replace('.', ','));
        System.out.println(" cm");
        System.out.printf("Luas Lingkaran      = " + String.format("%.2f", rum.hitungLuas()).replace('.', ','));
        System.out.println(" cm");
        System.out.printf("Keliling Lingkaran  = " + String.format("%.2f", rum.hitungKeliling()).replace('.', ','));
        System.out.println(" cm");
    }
    
}
