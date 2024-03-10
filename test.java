  import java.util.Scanner;


public class test{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String name ;
     System.out.println("Enter your name please : ");
     name = input.nextLine() ;
String line  = String.format("THANKS %s please enter your age : "  , name);
System.out.println(line);
    int age ; 
   age= input.nextInt();
   line  = String.format("Excellent %s , %d is a nice age start learing programming . \n \n \n \n "  , name, age);
System.out.println(line);


input.close();
    }
}
