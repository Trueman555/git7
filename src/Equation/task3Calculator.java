package Equation;

import java.util.Scanner;

public class task3Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean agreement;
        agreement = true;

        do {
            System.out.println("Enter num1:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter num2:");
            double num2 = scanner.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double answer = 0;

            switch (operator) {
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    if ( num2 == 0 ) {
                        System.out.println("Error");
                    } else {
                        answer = num1 / num2;
                    }
                    break;
                default:
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
            System.out.println("Do you want to continue?");
            String prover = scanner.next();

            if (prover.equals("yes") ) {
                agreement = true;
            }
            if (prover.equals("no") ) {
                agreement = false;
            }
        } while (agreement);

    }


}




