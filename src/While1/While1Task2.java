package While1;
//what was the task? As I remember calculate 1+2+4+...+256. In this case your solution is incorrect.
public class While1Task2 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        while (x < 256) {
            //why do you print sum each time? It is the result of loop!
            System.out.println(sum);
            sum += x;
            x++;
        }
    }
}
