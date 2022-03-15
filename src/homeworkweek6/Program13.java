package homeworkweek6;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Input first number ");
        double a = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Input second number ");
        double b = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Input third number ");
        double c = Double.parseDouble(keyboardInput.nextLine());
        System.out.println("Average of three numbers is: " +(a+b+c)/3);

    }
}
