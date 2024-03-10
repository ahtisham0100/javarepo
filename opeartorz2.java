public class opeartorz2{
    public static void main(String[] args ){
        int age =  45 ; 
        System.out.println("The age is : " + age); 


        // converion into other data types 
//from smaller to larger data types         
        double age2= age ;
        System.out.println("in double value is : " + age2 );
//from larger to smaller data types , we've to write date type in which it'being converted before larger data type        
        int age3 = (int)age2 ;
        System.out.println("from double to int : " + age3);



 //operators 
 System.out.println(age== age2);       // gives true since 45 and 45.0 are equal  
System.out.println(age!=age2 );       // gives false as both numbers are equal    

            boolean isdoctor = false ;
System.out.println("not of isdoctor(false) : "+ !isdoctor);

int score= 10 , turn =5 ;
System.out.println("score is : "+ score + " \nturn is : " + turn);
}

}