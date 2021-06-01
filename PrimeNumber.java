

package javatutorial;

import java.util.Scanner;



public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any number :");
        int x = input.nextInt();
        int counte = 0;
        int i;
        for (i = 2; i < x; i++) {
           
            if(x%2==0)
            {
                counte++ ;
                break;
            }
          
        }
        if (counte==0)
        {
            System.out.println("prime number");
    }
        else
        {
            System.out.println("not prime number");
        }
        }
