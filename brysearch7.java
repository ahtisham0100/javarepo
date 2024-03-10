
/* 
        binary search is applied on sortable array else it will be slow , 
In this search alogrithm looks for the desired number  ;
 
we first of all divide the array into two parts and compare number  we're looking for  with that number and see if
it is equal or not . if not equal we see if number is greater than or less than middle  number . 
 the side to which it does'nt belong is ommitted and we continue the search in remaining half side.
 This process is repeated again and again until that number is found .


 ******* Method *******
 WE take an array  ;
1: we sort array 
2: create two pointers
3:find middle of array by   (startpointer + endingpointer)  / 2

 It's TIME COMPLEXITY IS    O(log n)  i.e we divide until target is reached .  
*/
import java.util.Arrays ;

public class brysearch7{

   

    public static void main(String[] args) {
        int[] marks = { 8,9,5,6,1,2,3,0,4};
        int len = marks.length; 
        System.out.println("length of marks array is : "+ len);
        Arrays.sort(marks);

        binarysearch(marks, 8) ;
    }
    
    //key is number to find 
    private static  int binarysearch(int[] array ,  int key) 
     {
        int startpointer = 0 ;  //starts at index zero   ;
        int endingpointer = array.length - 1 ;  //intitialized at end   ;

        //initializing while loop ;
         while (startpointer<=endingpointer) {

        int midpoint = (startpointer + endingpointer  )  / 2 ;
        int numberatmiddle = array[midpoint] ;
        
if (numberatmiddle==key) {
       return midpoint; 
} 

if (numberatmiddle<key) {
        startpointer = midpoint+1; 
} else{
        endingpointer = midpoint -1 ;
}

return -1 ;
//if all conditions fail return -1 i.e numeber does'nt exist  ;
}
    
    
    
        }
}
