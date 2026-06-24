import java.util.*;

public class CalculatingFunction {
    public static long Fn(long n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (n - 1) / 2 - n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // changed to nextLong
        System.out.println(Fn(n));
    }
}
