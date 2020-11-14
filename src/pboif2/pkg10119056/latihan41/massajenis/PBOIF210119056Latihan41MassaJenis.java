/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan41.massajenis;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Massa Jenis
 */


public class PBOIF210119056Latihan41MassaJenis {

    public static void main(String[] args) {
        Kubus kubus2=new Kubus();
        kubus2.setSisi(2);
        kubus2.setMassa(2);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("sisi : "+kubus2.getSisi());
        System.out.println("Massa : "+kubus2.getMassa());
        System.out.println("====Hasil Perhitungan=====");
        
        System.out.println("Volume : "+kubus2.hitungMassaJenis(kubus2.getSisi(), kubus2.getMassa()));
        System.out.println("Massa Jenis : "+kubus2.hitungVolume(kubus2.getSisi()));
    }
    
}
