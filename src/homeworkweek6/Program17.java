package homeworkweek6;

import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {

        int a;
        Scanner bin = new Scanner(System.in);//create an object of Scanner class

        System.out.println("Enter a decimal number:");//5
        a = bin.nextInt();
        System.out.println("Binary number is:" + Integer.toBinaryString(a));//101
    }
}


