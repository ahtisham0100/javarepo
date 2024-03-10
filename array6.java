/*
 * declaring an array in java 
           
 *              dataType[] arrayName ; 
 
dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects

arrayName - it is an identifier

 * But, how many elements can array this hold?

To define the number of elements that an array can hold, we have to allocate memory for the array in Java. For example,

// declare an array
double[] data;

// allocate memory
data = new double[10];
 * 
 */



import java.util.Arrays;    //for printing char array using string method .
public class array6 {
    public static void main(String[] args){


System.out.println("-----------------------------------------------------------------------------------------");

/*integer array starts here ;
generating random numbers by  Math.random() function and storing random numbers in array ;                                          */

int array[] = new int[45] ; 

for(int i = 0 ; i<array.length ; i++){
    double number = Math.random() * 11;
    array[i] = (int)number ;
}
 //printing array
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+ " ");
    }
    System.out.println("\n10th element of array is : " + array[9]);
//integer array code ends 


/*
* now begins double array

float[] gpa= new float[44] ;
for (int i = 0; i < gpa.length; i++) {
   double  grade = (Math.random() * 5) -(Math.random() * 2 ) ;
   float gradenew = (float)grade ; 
   gpa[i] = gradenew ;
}
 
for (int i = 0; i < gpa.length; i++) {
    System.out.print("gpa of " + (i+1) + " is :  " + gpa[i]);
}
    
    
                */



//calculatig sum and average of array  ;

int sum = 0; 
for (int i = 0; i < array.length; i++) {
   sum+=array[i] ;
} 
int average = sum / array.length ;
System.out.println("\nAverage is : " + average + "\nSum is  " + sum);
    
  
/* 

*printing an array using string method
    * first of all we import java.util.Arrays ;
        than  in println (Array.toString(name of array)) ;
                                                                                                            */ 
 System.out.println("-----------------------------------------------------------------------------------------");

char[] vowels = {'a', 'e' , 'i' , 'o' , 'u'} ;  //vowels'char array  ;
System.out.println("\nvowel array printed using string method is : " + Arrays.toString(vowels));


int[] marks = {1,2,3,5,6,89,2,1,12,31,23} ;   //marks array ;
System.out.println("Marks array using \"string\"  method is : " + Arrays.toString(marks) );

System.out.println("-----------------------------------------------------------------------------------------");


//length of array  is found by  ***** array.length ;    *************** 
System.out.println("length of vowel array by \'vowels.length \' method  is  : " + vowels.length ); 
System.out.println("length of marks array by  \'marks.length \' is  : " +  marks.length ); 

System.out.println("-----------------------------------------------------------------------------------------");

//sorting arrays 
char[] sortable= {'z'  , 'z' , 'a' , 'd' , 'g' , 'h' ,'g' ,'d','s'} ;

System.out.println("orginal sortable array is  : " + Arrays.toString(sortable));
Arrays.sort(sortable);  //sorting array
System.out.println("array sorted by Arrays.sort(sortable) method  is "+ Arrays.toString(sortable));

//sorting array form x index till y index .  
// in such case we write Arrays.sort(arrayname , starting index , endingindex)  

System.out.println();

int[] array2 = {9,8,7,6,5,4,3,2,1,0} ;
System.out.println("unsorted Array2 is : " + Arrays.toString(array2));

Arrays.sort(array2,1,9 ) ;    //sorting fromm inded 1 till 9
System.out.println("Array2 sorted from index 1 to index 9 is :  " + Arrays.toString(array2));

//SORTING ARRAYS ENDS HERE


/* SEARCHING IN ARRAYS: 
 *  the method for searching in array is : 
 *     Arrays.binarySearch(arrayname, itemtobesearched)
 */

int key= Arrays.binarySearch(array2, 8) ;   //searchable event is called key in java . 
System.out.println("index of 8(key) found by Arrays.binarySearch(  array2 , 8) is : " + key);


System.out.println("-----------------------------------------------------------------------------------------");


//filling all elemnts of array with a certian number or character  or string ----->> fill method 
System.out.print("\nFilling all element of sortable array by array.fill(arrayname. 'A') method \n ");
Arrays.fill(sortable, 'A');
System.out.print(Arrays.toString(sortable));


}
    
}
