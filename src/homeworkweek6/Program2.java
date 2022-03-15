package homeworkweek6;

public class Program2 {
    // declare two static variables
    static int a = 10;
    static int b = 20;

    // declare one static method
    public static void addition() {
        //Calling both static variables into the static method inside the print statement
        System.out.println(a + b);//30
    }
    /**
     * Call the static method into the Main method
     * Run the programme
     */
    public static void main(String[] args) {

        addition();// 30
    }

}
