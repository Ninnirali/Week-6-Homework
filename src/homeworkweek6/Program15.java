package homeworkweek6;

public class Program15 {

    public static void main(String[] args) {

        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = x;
        x = y;
        y = a;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

