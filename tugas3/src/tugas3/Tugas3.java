/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author frtris
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int rows = scanner.nextInt();

        System.out.println("");

        // Pattern atas
        for (int i = 1; i <= rows; i++) {
            // kiri
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spasi ditengah
            for (int k = i * 2; k <= rows * 2 - 2; k++) {
                System.out.print(" ");
            }
            // kanan
            for (int l = i; l > 0; l--) {
                if (l != rows) {
                    System.out.print(l);
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= rows - 1; i++) {
            // Kiri
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j);
            }
            // spasi tengah
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            // Kanan
            for (int l = rows - i; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
    
}
