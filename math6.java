import java.util.Scanner; 


public class math6{
    public static void main(String[] args){
      Scanner input  =  new Scanner(System.in) ;
        double randnum =   Math.random() * 21 ; //returns a random value 
        int rand = (int)randnum ; 
System.out.println("Random num : " + rand);
        System.out.println("Enter two nums to find max and minmum : " )  ;
        // Math.max(a,b) ;  nnn
        //Math.min(a, b) ; g
         //retun maximum and minimum value respectively;
      //  The Math.sqrt(x)  method returns the square root of x:
      //  The Math.abs(x)  method returns the absolute (positive) value of x:

int num1  , num2  , root =121 ;
System.out.println("enter num1 and num2  ");
num1=input.nextInt();
num2 = input.nextInt();
System.out.println( "maximum number is :  " + Math.max(num1, num2));
System.out.println( "minimum number is :  " + Math.min(num1, num2));
System.out.println( "sqreoot of num is :  " + Math.sqrt(root));

System.out.println(num1==num2);

input.close() ;   //closed the scanner 
    }
}