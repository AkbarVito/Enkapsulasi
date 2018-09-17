/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Latihan5 {
    public static void main(String[] args){
        Scanner masukan = new Scanner (System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir pbo");
        nilai = masukan.nextInt();
        if (nilai < 70)
            System.out.println("siswa tidak lulus");
        if (nilai >= 70)
            System.out.println("Siswa Lulus");
    }
}
