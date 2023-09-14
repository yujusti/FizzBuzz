public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int a = 100;
        while (a != 0) {
            boolean divisibleby2 = a % 2 == 0;
            if (divisibleby2) {
                a /= 2;
                steps++;
            }
            else {
                a--;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
