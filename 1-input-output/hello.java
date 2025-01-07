import java.util.*;

public class hello {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // int a = 10;
        // int b= 20;
        // int c=a+b;
        // //System.out.println("Sum of a and b is: "+c);
        // int diff =b-a;
        // System.out.println("Difference of a and b is: "+diff);
        // System.out.println("Sum of a and b is: "+c);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= sc.nextInt();
        System.out.println("Enter the second number: ");
        int b= sc.nextInt();
        int c = a+b;
        System.out.println("Sum of a and b is: "+c);
    }
} 
