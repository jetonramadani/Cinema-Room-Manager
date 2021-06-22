import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static Long factorial(long n) {
        // write your code here
        return LongStream.rangeClosed(1, n)
                .reduce((l, l1) -> l * l1)
                .orElse(1L);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}