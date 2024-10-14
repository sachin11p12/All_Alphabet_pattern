package Aphabet_program;

import java.util.Scanner;

public class Alphabet_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
        /*
         *****
         *   *
         *   *
         *****
         *   *
         *   *
         *   *

         */
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
