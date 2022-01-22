package Cycle;

public class CicleTask2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if ( j >= i ) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                if ( b > a ) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int c = 0; c < 5; c++) {
            for (int d = 5; d > 0; d--) {
                if ( d > c ) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }

    }
}
