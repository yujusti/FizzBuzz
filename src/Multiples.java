public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a < 1000; a++) {
            boolean multiple3 = a % 3 == 0;
            boolean multiple5 = a % 5 == 0;
            if (multiple3 || multiple5) {
                count++;
            }
        }
        System.out.println(count);

    }
}
