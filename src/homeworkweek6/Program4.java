package homeworkweek6;

public class Program4 {
    int a = 10; // instance variable
    int b = 20; // instance variable
    static int c = 30; // static variable
    static int d = 40; // static variable


    //Declare one instance method
    public void test (){
        System.out.println("This output is from instance method");
        System.out.println(a); //10
        System.out.println(b); //20
        System.out.println(Program4.c);//30 static variable to instance method access with class
        System.out.println(Program4.d); //40 static variable to instance method access with class

    }
    //Declare one static method
    public static void test1 (){
        Program4 obj = new Program4();
        System.out.println(obj.a); // 10 instance variable to static method access with object
        //Program4 obj1 = new Program4();
        System.out.println(obj.b); // 20 instance variable to static method access with object
        System.out.println(c); // 30
        System.out.println(d); //40
    }

    public static void main(String[] args) {
        Program4 abc = new Program4();
        abc.test();
        test1();

    }
}

