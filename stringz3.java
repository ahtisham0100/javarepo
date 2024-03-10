public class stringz3{
    public static void main(String[] args) {
        //string in java 
    String name =  "Muhammad Ahtisham Arif " ;
    int age = 19 ;     
    String college = "MCS , NUST " ; 
    String city = " Multan " ;
    double gpa= 4 ;
    char percent= '%' ;
    boolean claim = false ;

//n method below we've to use + + signs to print string names ,
    System.out.println("My name is " +name+ " , I am " +age+ " years old. I was brought up in " +city+" and  I'm currently studying at "+college+ " .");    


/* formatted strings 
now we use formatted strings in java to avoid usage of "+" operators in code and my our code more neat and clean and easy to understand .    */   
System.out.println("EXAMPLE OF FORMATTED STRINGS.");

/*
    syntex of formatted string is ; 
    String variablename(formatted string name) = String.format("for string %s, %d for int  , 
    %f is for double , %c fro character , %b for boolean " , stringname , intname , doublename , booleanname) ; 
 */

 //example for formatted strings ;

String intro=String.format("\n My name is %s and i am %d years old. I am currently studying at %s . I was brought up in %s and my gpa is %f and i have 100 %c attendance throughout degree programme and these claims are partially %b ." , name , age , college , city , gpa , percent , claim ) ;
System.out.println(intro);

//example 2 on formatted stringss . 
int umar= 45 ;
String naam = "Na Malooom " ;
String formattedstring = String.format(" \nExample2: \n The name is %s and age is %d \n \n  " , naam , umar) ;
System.out.println(formattedstring);

//length of string
System.out.println("the lenght of \"intro\" string is : " + intro.length() );

//checking if string is empty or not 
System.out.println("the string \"intro\" is empty: " + intro.isEmpty());

//upper to lower case : 
System.out.println("\nin lower case : \n " + intro.toLowerCase());

//TO UPPER CASE 
System.out.println("\nin upper case : \n " + intro.toUpperCase());
System.out.println("\n ");  // for spacing one line ; 

//checking if two strings are equal or not we use string1.equals(string2)s
System.out.println("Are \'formatted string \'  and \'intro string\' equal ?   : " +formattedstring.equals(intro));

//replacing a part of string with another part   we use stringname.replace("target" , replacement)
System.out.println(intro.replace("Muhammad Ahtisham Arif ", "Muhammad Ahtisham Arif , my father name is Muhammad Arif")); 

//checkink if string contains the certain word or not  . we use " contains() " function for this purpose
System.out.println("\nString intro contains \'Muhammad\' or not ?   : " + intro.contains("Muhammad"));

}
    




}