package While1;
//CONDITION
//+-
public class While1Task4 {
    public static void main(String[] args) {
        //bad naming
        int x = 1;
        int sum = 1;
        while (x <= 99) {
            System.out.println(sum);
            x += 2;
            sum += x;
        }
        //if it is second solution, then leave a comment
        int y = 0;
        //bad naming
        int sumy = 0;
        while (y <= 99) {
            y++;
            //if(..){...}
            if ( y % 2 == 0 )
                continue;
            sumy += y;
            System.out.println(sumy);

        }
//no empty lines
//no empty lines
    }

}
