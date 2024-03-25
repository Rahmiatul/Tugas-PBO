/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi1_b;

/**
 *
 * @author DELL
 */
public class Tugas2 {
    public static void main(String[] args) {
        char abjad = 'B';
        char r;
        char s;
        for ( r = 5; r >= 1; r--) {
            for ( s = 1; s <= r; s++) {
                System.out.print((char)(64+s)+ "");
                abjad++;
            }
            System.out.println();
        } 
}

}
