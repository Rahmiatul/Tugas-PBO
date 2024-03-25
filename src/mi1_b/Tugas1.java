/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi1_b;

/**
 *
 * @author DELL
 */
public class Tugas1 {
    public static void main(String[] args) {
        int r, s;

        for (r = 0; r <= 3; r++) {
            for (s = 3; s >= r; s--) {
                System.out.print(" ");
            }

            for (s = 1; s <= r * 2 - 1; s++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }

}
