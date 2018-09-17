package modul1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Latihan3LuasBalok {
    public static void main (String[] args){
        int p=5;
        int l=10;
        int t=5;
        System.out.print("nilai Panjang Balok : " + p);
        System.out.print("nilai Lebar Balok : " + l);
        System.out.print("nilai Tinggi Balok : " + t);
        System.out.print("==========================");
        System.out.print("Menghitung Luas permukaan Balok");
        System.out.print("==========================");
        System.out.print("Luas Permukaan Balok Balok : " + ((2*p*l)+(2*p*t)+(2*l*t)));
    }
}
