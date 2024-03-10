//to take input we import java.util.scanner    i.e scanner class 

import java.util.Scanner;
public class userinput4{
    public static void main(String[] args) {
        System.out.println("\n ................TAKING INPUT FROM USER IN JAVA .........................");
        
        //here we create a scanner using the scanner class 
    Scanner scan = new Scanner(System.in);

    //            here starts sum of two ints .
     
    int a ,b , sum ; 

    System.out.println("\n ENTER A NUMBER : ");
    a= scan.nextInt() ;     //this way we assign input value to a variable directly as we take input.
    System.out.println("First Number that you entered is : " + a);

    System.out.println("ENTER THE SECOND NUMBER : "); 
    b=scan.nextInt() ;
    System.out.println("THE SECOND NUMBER IS : " + b );

    sum =a+b; 
    System.out.println("SUM is : " + sum);       
   scan.nextLine() ;   

   //sum of ints ends 

    // whenever we take input fot int , float or double following which we have to write scan.nextln(); to consume
    //next line chaaracter 
   /*    note from here regarding extra scan.nextline(); used in line number 25 ;

    Alternative to this method is parsing    
    int a =  intparse(scan.nextline()) ;

Consuming Newline Character (Crucial Step):
scan.nextLine();: This line, often overlooked but critical, is responsible for "consuming" the remaining newline character (\n) left in the input stream after the user presses Enter to submit the integer value.
    Reasoning for scan.nextLine():
    
    Without scan.nextLine():
    
    If you omit this line, the next call to scan.nextInt() or other methods that expect a specific data type might not work as intended. This is because the newline character (\n) from the previous input would still be present in the input stream, causing these methods to interpret the newline as part of the next integer input. This can lead to unexpected behavior or errors.
    Correct Approach:
    
    Including scan.nextLine() after reading data types like integers (using nextInt()) ensures that the newline character is consumed, leaving the input stream clean and ready for the next input operation. This maintains the expected behavior and prevents potential issues.
    In summary:
    
    The code snippet first takes integer input from the user, calculates the sum, and displays the result.
    The scan.nextLine() call is essential to clear the input stream and avoid unexpected behavior in subsequent input operations.
*/
//taking string, float , booelan ,  double as input ;   
Boolean gender ; 
float gpa ;
String name ; 
int age ; 

//inputting string 
            System.out.println("\n Enter name : ");
            name= scan.nextLine();     //if we use scan.next() ; it reads just one word and not line as with scan.nextline();
            System.out.println("name is : " + name);


//inputting boolean ; 
System.out.println("Are you male please enter true / false ?  ");
 gender=scan.nextBoolean();


 //inputting flaot / double 
System.out.println("Enter your GPA : ");
gpa=scan.nextFloat();


//inputting int 
System.out.println("enter the age : ");
age = scan.nextInt();

 //using property of string to print name , gender and gpa 
String intro =String.format("My name is %s . I am a male( %b ) having age  %d . My gpa is %f . " , name  ,  gender , age , gpa) ;
System.out.println(intro);

             //always remember to close scanner at the end 
             scan.close();
    }
}