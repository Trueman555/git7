package Equation;

import java.util.Scanner;

public class task3Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter num2:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter operation:");
        System.out.print("\n Enter an operator (+, -, *, /): ");
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
                //division by 0?
                answer = num1 / num2;
                break;
        }
        //you do not have a loop! Your's program will just finish, but I need it to work till I enter stop word
        System.out.print(num1 + " " + operator + " " + num2 + " = " + answer + "\n" + "Do you want to continue?");


    }


}

