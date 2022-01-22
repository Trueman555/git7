package Cycle;

import java.util.Scanner;

public class CicleTask3 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter y:");
        int y =scanner.nextInt();
        System.out.println("Enter x:");
        int x =scanner.nextInt();
        int mult=0;

        for (int i=0; i!=y; i++){
            mult=mult+x;

        }
        System.out.println(mult);
    }
}
