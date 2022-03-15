package homeworkweek6;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Input first number = ");//125
        int a = Integer.parseInt(scnr.nextLine());
        System.out.print("Input second number = ");//24
        int b = Integer.parseInt(scnr.nextLine());
        int c = a + b;//149
        int d = a-b;//101
        int e=a*b;//3000
        int f=a/b;//5
        System.out.printf("%d+%d=%d \n", a, b, c);
        System.out.printf("%d-%d=%d\n",a,b,d);
        System.out.printf("%d*%d=%d\n",a,b,e);
        System.out.printf("%d/%d=%d\n",a,b,f);
        System.out.printf("%d mod %d = 5\n",a,b);

    }
}
