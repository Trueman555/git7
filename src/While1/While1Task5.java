package While1;

public class While1Task5 {
    public static void main(String[] args) {

        int even = 2;
        int odd = 1;
        int sumEven = 0;
        int sumOdd = 0;
        while (even <= 100) {
            sumEven += even;
            even += 2;
        }
        System.out.println(sumEven);
        while (odd <= 99) {
            sumOdd += odd;
            odd += 2;
        }
        System.out.println("\n"+sumOdd);
        int sumEvenOdd = sumEven + sumOdd;
        System.out.println("\n"+sumEvenOdd);

        int x = 1;
        int y = 2;
        int sumx = 0;
        int sumy=0;
        int sumxy=0;
        while (x <= 99 & y<=100) {
            sumx+=x;
            x+=2;
            sumy+=y;
            y+=2;
            sumxy = sumx+sumy;
        }System.out.println("\n"+sumxy);
    }


}

