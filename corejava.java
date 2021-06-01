
package javatutorial;

import java.util.Scanner;


public class corejava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,r,temp,num;
        System.out.println("ente the value of digite :");
        num = input.nextInt();
        temp = num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum+r;
            temp = temp/10;
        }
            System.out.println("sum of digite" +sum);
    }
}
