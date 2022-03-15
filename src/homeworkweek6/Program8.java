package homeworkweek6;

import java.util.Scanner;
public class Program8 {
            public static void main(String[]args){
            Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Base of a triangle (b): ");
            int b  = Integer.parseInt(keyboardInput.nextLine());
            System.out.print("Height of a triangle (hb): ");
            int h = Integer.parseInt(keyboardInput.nextLine());
            System.out.println("Area of a Triangle = "+ h*b/2);
        }
    }
