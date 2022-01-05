/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.*;

/**
 *
 * @author frtris
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah karakter: ");
        n = sc.nextInt();
        sc.nextLine(); // menghindari skipping

        String[] karakter = new String[n];

        System.out.println("");

        // input karakter
        for (i = 0; i < n; i++) {
            System.out.print("Masukkan karakter " + i + ": ");
            karakter[i] = sc.nextLine();
        }

        // print hasil
        System.out.print("Hasil: ");

        // print semua item di array
        for (i = 0; i < n; i++) {
            System.out.print(karakter[i] + " ");
        }

        // ambil item -1 dari terakhir
        for (i = n - 2; i >= 0; i--) {
            System.out.print(karakter[i] + " ");
        }

        System.out.println("");
    }
    
}
