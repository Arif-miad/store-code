
package javatutorial;

import java.util.Scanner;


public class FibonaciTesr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much fibonaci value :");
        int fast = 0;
        int secend = 1;
        int fibi,i;
        int x = input.nextInt();
        for ( i = 3;    i<=x; i++) {
            
            fibi = fast+secend;
            System.out.println(" " +fibi);
            fast=secend;
           
            secend=fibi;
            
        }
    }
}
