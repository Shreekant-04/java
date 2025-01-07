import java.util.*;

public class Main{
    public static void main(String args []) {
        Scanner sc= new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("You are eligible to vote");
        // }
        // else{
        //     System.out.println("You are not eligible to vote");
        // }
        // System.out.println("\nEnter a number ");
        // int num =sc.nextInt();
        // if(num%2==0){
        //     System.out.println("number is even");

        // }
        // else{
        //     System.out.println("number is odd");
        // }

        // System.out.println("Eneter a ");
        // int a = sc.nextInt();
        // System.out.println("Eneter b ");
        // int b = sc.nextInt();

        // if(a==b){
        //     System.out.println("a is equal to b");
        // }
        // else if(a>b){
        //     System.out.println("a is greater than b");
        // }
        // else{
        //     System.out.println("b is greater than a");
        // }
   

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            
        
            default:
                System.out.println("greater than 4");
                
        }
    }
}