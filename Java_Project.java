
/**
 * Write a description of Java_Project here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.File;
import java.util.*;
/*import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
*/
public class Java_Project {
    public HashMap countCharInString(String string){
        HashMap<Character, Integer> CharCount = new HashMap<Character, Integer>();
        for(int i=0; i < string.length(); i++){
            char CurrentChar = Character.toUpperCase(string.charAt(i));
            if(Character.isLetter(CurrentChar)){
                if(CharCount.containsKey(CurrentChar)){
                    CharCount.put(CurrentChar,CharCount.get(CurrentChar)+1);
                }
                else{
                    CharCount.put(CurrentChar,1);
                }
            }
        }
        return CharCount ;
    }
    
    public void getCharCount(){
        Scanner Obj =  new Scanner(System.in);
        String string ;
        System.out.print("Enter sentence : ");
        string = Obj.nextLine(); 
        System.out.println(countCharInString(string));
        
    }
    
    public void EvenOrOdd(long num){
        if(num%2 == 0){
            System.out.println("Entered Number is an Even Number.");
        }
        else{
            System.out.println("Entered Number is an Odd Number.");
        }
    }
    
    public void getEvenOrOdd(){
        Scanner Obj =  new Scanner(System.in);
        long num ;
        System.out.print("Enter number : ");
        num = Obj.nextLong(); 
        EvenOrOdd(num);
    }
    
    public int[] ReverseArray(int []arr){
        int []rev_arr=new int[arr.length] ;
        for(int i = arr.length-1 ; i>= 0  ; i-- ){
            rev_arr[arr.length-1-i] = arr[i];
        }
        
        return rev_arr ;
    }
    
    public void getReverseArray(){
        int len =0 ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        len = s.nextInt(); 
        int[] arr = new int[len];
        System.out.println("Enter all the elements giving space : ");
        for(int i =0 ; i< len ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Reverse of Array is : " + Arrays.toString(ReverseArray(arr)) );
    }
    
    public void AreaAndFact(float radii){
        double area = Math.PI*Math.pow(radii,2);
        double circumference = 2*Math.PI*radii;
        System.out.println("Area:"+area);
        System.out.println("Circumference :" + circumference);
    }
    
    public void getAreaAndFact(){
        float radii ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        radii = s.nextFloat();
        AreaAndFact(radii);
    }
    
    public int Factorial(int num){
        if(num<0)    
            return(-1); 
        else if(num==0)    
            return 1;    
            else    
            {    
                return(Factorial(num-1) * num);        
            } 
    }
    
    
    public void getFactorial(){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number : ");
        num = s.nextInt();
        int sum = Factorial(num);
        System.out.println(sum);
        if(sum == -1 ){
            System.out.println("cannot find the factorial of a negative number"); 
        }
        else{
            System.out.println( "Factorial for " + num + " = " + sum );
        }
    }
    
    public void main ()
    {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. To Check if entered number is Even or Odd Number, Enter 1");
        
            System.out.println("2. To find out the duplicate characters in a String and display the count of them, Enter 2");

            System.out.println("3. To find the reverse of the array, Enter 3");
        
            System.out.println("4. To calculate area and circumference of circle, Enter 4");

            System.out.println("5. To find the factorial of a number, Enter 5 ");
        
            System.out.println("6. TO EXIT, Enter 6 ");
        
            System.out.print("Enter your Choice : ");
        
            String choice = sc.nextLine();
        
            switch(choice)
            {   
                
                case "1":
                getEvenOrOdd();
                System.out.println("");
                break;
                
                case "2": 
                getCharCount();
                System.out.println("");
                break;
            
                case "3":
                getReverseArray();
                System.out.println("");
                break;
                
                case "4":    
                getAreaAndFact();
                System.out.println("");
                break;
                
                case "5":
                getFactorial();
                System.out.println("");
                break;
                
                case "6":
                System.out.println("Thank You!!!");
                System.exit(0);
                
                default : System.out.println("Invalid Entry!!! Please re-enter choice from or menu");
                
                System.out.println("");
                }
            }
        }
}
