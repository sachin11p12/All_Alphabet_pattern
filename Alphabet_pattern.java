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
        /* 
**** 
*   *
*   *
**** 
*   *
*   *
****
        */
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                 if(j==0 || j==4 && i!=0 && i!=3 && i!=6|| i==0 && j!=4 || i==3 && j!=4 || i==6 && j!=4 )   
                    System.out.print("*");
                else 
                    System.out.print(" "); 
            }
            System.out.println();
        }
        /*
        * * * * *
        *
        *
        *
        * * * * * 

            */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || j==1 || i==5)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        /*
        * * * * *   
        *         *
        *         *
        *         *
        * * * * *
        */

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 && j!=5 || j==1 || i==5 && j!=5 || j==5 && i!=1 && i!=5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        /*
        * * * * * 
        *
        *
        * * * * *
        *
        *
        * * * * *
        */

        for(int i=1; i<=7;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || i==7){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        /*
    * * * * * 
    *         
    *   * * * 
    *       * 
    * * * * * 

        */
                for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || j==1 || i==5 || j==5 && i!=2 || i==3 && j!=2){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
   /* 
        *       *
        *       *
        * * * * *
        *       *
        *       *
  */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (j==1 || j==5 || i==3 ){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        /*
         * * * * *
             *
             *
             *
         * * * * *
        
        */
          for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || i==5 || j==3)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
