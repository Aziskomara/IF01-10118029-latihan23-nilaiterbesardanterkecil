/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan23;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program nilai terbesar dan terkecil
 */
public class Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
        String nama;
        System.out.println("------Program nilai terbesar dan terkecil mahasiswa------");
        System.out.print("Masukan nama petugas : ");
        nama = input.next();
        System.out.print("Masukan bayaknya nilai mahasiswa : ");
        int banyakMhs = input.nextInt();
        int[] nilaiMhs = new int[banyakMhs];
        System.out.print("Msukan nilai mahasiswa ke- " + 1 + "=");
        nilaiMhs[0] = input.nextInt();
        
        int nilaiMax = nilaiMhs[0];
        int nilaiMin = nilaiMhs[0];
        for(int i = 1; i < banyakMhs; i++){
            System.out.print("Masukan nilai mahasiswa ke- " +(i + 1) + "=");
            nilaiMhs[i] = input.nextInt();
            if(nilaiMhs[i] > nilaiMax)
                nilaiMax = nilaiMhs[i];
            
            if(nilaiMhs[i] < nilaiMin)
                nilaiMin = nilaiMhs[i];
                
            
        }
        System.out.println("Nilai terbesar adalah : " +nilaiMax);
        System.out.println("Nilai terkecil adalah : " +nilaiMin);
        
    }
    
}
