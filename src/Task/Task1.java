package Task;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //why is it commented? I do not understand if I should review it. Solution is OK, but use text formatting - Ctrl+Alt+L
  //      Scanner scanner = new Scanner(System.in);
   //     System.out.println("Enter number1:"+ " ");
   //     double number1 = scanner.nextDouble();
 //       System.out.println("Enter number2:"+ " ");
  //      double number2 = scanner.nextDouble();
 //       System.out.println("Enter number3:"+ " ");
  //      double number3 = scanner.nextDouble();

  //      if (number1>number2) {
 //           if (number2>number3) {
 //               System.out.println("Max number:"+" "+number1);
  //          } System.out.println("Max number:"+" "+number1);

 //       }
 //           else if (number2>number1 & number3<number2 ) {

 //           System.out.println("Max number:"+" "+number2);

  //      }
 //       else { System.out.println("Max number"+" "+number3);

//            }
        //you could reuse scanner from 9 line without creating new one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:"+ " ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number2:"+ " ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter number3:"+ " ");
        double number3 = scanner.nextDouble();
        
//it's very hard to read!! If if else instead
        double valueMax = number3>(number1>number2? number1 : number2) ? number3 : ((number1>number2)?number1:number2);

        System.out.println("Max number:"+" "+valueMax);









    }

}
