/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumus;

/**
 *
 * @author Dean
 */
public class Rumus {
    public int diameter;
    public String konversiAngka;
    public boolean kondisi;
    
    public double hitungJariJari(){
        return diameter / 2;
    }
    
    public double hitungLuas(){
        return Math.PI * hitungJariJari() * hitungJariJari();
    }
    
    public double hitungKeliling(){
        return 2 * Math.PI * hitungJariJari();
    }
    
    public void validasiAngka(){
        if(konversiAngka.matches("[0-9]*")){            
            diameter = Integer.parseInt(konversiAngka);
            kondisi = true;
        } else {
            System.err.println("Nilai Diameter Tidak Sesuai!");
            kondisi = false;
        }
    }
}
