
package javatutorial;

import java.util.Scanner;


public class Fastpro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of n:");
         int n = input.nextInt();
        System.out.println("enter the value of m:");
        int m = input.nextInt();
        int counte = 0;
        
        for (int i = n; i < m; i++) {
            if(m%2==0)
            { 
            counte++;
            break;
            }
            
        }
        if(counte==0)
        {
            
            System.out.println("prime");
        }
        else 
        {
            System.out.println("not prime");
        }
    }
}
