package homeworkweek6;

public class Program3 {
    int a = 10; // instance variable
    static String name = "Queen"; // static variable

    // Declare one instance method
    public void test() {
        System.out.println(a);
        System.out.println(Program3.name); // static variable access with class name into instance area
    }

    // Declare one static method
    public static void test1() {
        Program3 obj = new Program3();
        System.out.println(obj.a); // instance variable access with object into static area
        System.out.println(name);
    }

    // Declare the Main method
    public static void main(String[] args) {

        Program3 abc = new Program3();
        abc.test(); //10
        test1(); // Queen

    }
}

