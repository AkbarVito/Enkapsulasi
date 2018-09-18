/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author asus
 */
public class UjiPraktikum1 {
     public static void main(String[] argh) {
               
        Praktikum1 Bus = new Praktikum1(7);
        Bus.getpenumpang(12345678);
        Bus.cetak();
        
        Bus.addpenumpang(5);
        Bus.cetak();
     
        Bus.addpenumpang(4);
        Bus.cetak();
     
        Bus.getAverage(50.0,55.0,75.0,85.0,65.0);
       }
}
