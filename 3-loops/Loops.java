import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i=0;i<=5;i++){
        //     System.out.println("Hello World");
        // }

        //  int i=0;
        // while(i<=5){
        //     System.out.println("Hello World");
        //     i++;
        // }

        // do{
        //     System.out.println("Hello World");
        //     i++;
        // }while(i<=5);
    

        System.out.println("Enter a nunber to get multiples of");
        int num= sc.nextInt();

        for (int i=1 ;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }

    }
    
}
