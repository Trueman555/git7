package Task;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args){
//Same question: why is it commented? 
//+
        
        Scanner scanner = new Scanner(System.in);
 //        System.out.println("Enter number1:"+ " ");
 //       int number1 = scanner.nextInt();
  //      System.out.println("Enter number2:"+ " ");
  //      int number2 = scanner.nextInt();

 //       if (number1%number2==0)
 //       {
 //          System.out.println("multipl");
 //       }
 //       else {
  //          System.out.println("not multipl");
 //       }


        System.out.println("Enter number1:"+ " ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2:"+ " ");
        int num2 = scanner.nextInt();
//if - else is better. 
        String multipl=num1%num2==0? "Multipl":"Not multipl";
        System.out.println(multipl);

    }

}
