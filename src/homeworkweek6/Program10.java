package homeworkweek6;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Input a number : ");
        int a = Integer.parseInt(keyboardInput.nextLine());
        for (int i = 1; i <=10; ++i) {
            System.out.printf("%d * %d = %d \n", a, i, a * i);
        }
    }
}
