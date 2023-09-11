/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int count = 0;
        while (count < 101) {

            count = doFizzBuzz(count);
        }
    }

    private static int doFizzBuzz(int count) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = count % 3 == 0;
        boolean divisibleBy5 = count % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(count);

        }
        count++;
        return count;
    }
}
