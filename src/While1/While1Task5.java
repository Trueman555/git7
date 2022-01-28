package While1;
//condition?
//no magic numbers!
//use text formatting (Ctrl+Alt+L)
//+-
public class While1Task5 {
    public static void main(String[] args) {

        int even = 2;
        int odd = 1;
        int sumEven = 0;
        int sumOdd = 0;
        //you could do all calculations in 1 loop
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
        //this solution could be more beautiful
        while (x <= 99 & y<=100) {
            sumx+=x;
            x+=2;
            sumy+=y;
            y+=2;
            //after the cycle
            sumxy = sumx+sumy;
        }System.out.println("\n"+sumxy);
    }


}

