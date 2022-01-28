package While1;

public class While1Task2 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        while (x < 256) {
            System.out.println(sum);
            sum += x;
            x++;
        }
    }
}
