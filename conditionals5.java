import java.util.Scanner;

public class conditionals5 {
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

       /*  double num1 , num2 ;
        String sum; 
        System.out.print(" enter the number 1 : ");
        num1=input.nextDouble(); 
        input.nextLine();    //to absorb the buffer (enter which we pushed after inserting num1 value )
        System.out.print(" enter the number 2 : ");
        num2= input.nextDouble();
        input.nextLine();
String condition ;
System.out.println("Enter the operation you want to perform . ");
condition= input.nextLine();
if (condition.equals("add")|| condition.equals("ADD") ||  condition.equals("Add")) {

   sum = String.format("%f + %f  = %f " , num1 , num2 , num1 +num2 );
   System.out.println(sum);
 
    
    
                                                                                        */



   String  month ;
System.out.println("ENTER THE MONTH TO CHECKOUT THE SEASON : ");
   month =input.nextLine() ;
   month = month.toLowerCase() ;
switch (month) { 
    case "january":
    case "feb" :
    case "march" :
    case "april": {
System.out.println("STAY WARM IT'S WINTER ");
        break;}
        case "may":
        case "june" :
        case "july" :
        case "august": {
    System.out.println("Enjoy the nature coz it's spring . ");
            break;} 
            case "september":
            case "october" :
            case "november" :
            case "december": {
        System.out.println(" hello people be ready autumn is here . ");
                break;}    
       

    default: {
        System.out.println("Invalid choice .");
        break;  
     }
       
}



input.close();


        }
    }   

