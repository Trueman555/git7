package While1;

public class While1Task4 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        while (x <= 99) {
            System.out.println(sum);
            x += 2;
            sum += x;
        }
        int y = 0;
        int sumy = 0;
        while (y <= 99) {
            y++;
            if ( y % 2 == 0 )
                continue;
            sumy += y;
            System.out.println(sumy);

        }


    }

}
