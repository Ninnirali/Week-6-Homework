package homeworkweek6;

import java.util.Scanner;

public class Program7 {
           public static void main(String[]args){
           Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Insert any temperature value in degree Fahrenheit: ");
            double t  = Double.parseDouble(keyboardInput.nextLine());
            System.out.println("Converted value in degree Celsius =  "+ (t-32)*5/9);
        }
    }
