/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Sabila Ramadhan
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan biodata dari seorang mahasiswa
 */
public class Mahasiswa {

    public String nim;
    public String nama;
    
    public static void main(String[] args) {
        // Menampilkan data orang 
        perkenalanDiri("10119039","Diva Sabila Ramadhan");
        System.out.println();
        // menampilkan data orang 2 
        perkenalanDiri("10119049","Mihael");
        System.out.println();
        // menampilkan orang 3 
        perkenalanDiri("10119050","Rama");
        System.out.println();
    }
    
    public static void perkenalanDiri(String nim, String nama){
        System.out.println("Hallo Everyone");
        System.out.println("MY nim is " + nim);
        System.out.println("My name is " + nama);
    }
}
