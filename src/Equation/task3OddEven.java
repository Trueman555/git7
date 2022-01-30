package Equation;

import java.util.Scanner;

public class task3OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max value:");
        int maxValue = scanner.nextInt();


        int odd = 1;
        int even = 2;
        int sumOdd = 0;
        int sumEven=0;

        while (odd <= maxValue & even<=maxValue) {
            sumOdd+=odd;
            odd+=2;

            sumEven+=even;
            even+=2;
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
        int sumOddEven = sumOdd + sumEven;
        System.out.println("\n"+sumOddEven);
    }
    }


