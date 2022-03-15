package homeworkweek6;

public class Program1 {
    // declare two instance variables
    int a = 10;
    int b = 20;

    // declare one instance method
    public void addition(){
       // calling both instance variables into instance method inside the print statement
        System.out.println(a+b); // 30
    }
    /**
     * Call the above instance method into the Main method
     * Run the programme
     */
   public static void main(String[]args){

       Program1 obj = new Program1(); // object creation
       obj.addition(); // 30
   }

}
