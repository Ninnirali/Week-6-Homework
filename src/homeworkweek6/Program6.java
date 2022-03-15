package homeworkweek6;

import java.util.Scanner;
public class Program6 {

            public static void main(String[]args){
            double pi = 3.14;
            Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Radius of a circle (r): ");
            int r  = Integer.parseInt(keyboardInput.nextLine());
            System.out.println("Area of a circle =  "+ pi*r*r);
        }
    }
