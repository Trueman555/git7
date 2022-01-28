package Equation;

import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        System.out.println("Solving the square equation ax^2+bx+c=0");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a:");
        double a =scanner.nextDouble();
        System.out.println("Enter b:");
        double b =scanner.nextDouble();
        System.out.println("Enter c:");
        double c =scanner.nextDouble();

        double x1;
        double x2;
        double d=b*b-4*a*c;

        if (d>0) {
            x1=(-b+Math.pow(d,0.5))/2*a;
            x2=(-b-Math.pow(d,0.5))/2*a;
            System.out.println("x1="+x1+"\n"+"x2="+x2);
        }
        else if (d==0){
            x1=-b/2*a;
            System.out.println("the equation has one root, x1="+x1);
        }
        else {System.out.println("the equation has no roots");}


    }

}
