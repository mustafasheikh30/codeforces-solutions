import java.util.*;

public class LifeWithoutZeros {
    public static long removeZeros(long a) {

        long result = 0;
        while (a > 0) {
            if (a % 10 > 0) {
                result = (result * 10) + (a % 10);
            }
            a = a / 10;
        }
        long finalresult = 0;
        while (result > 0) {
            finalresult = (finalresult * 10) + (result % 10);
            result /= 10;
        }
        return finalresult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = removeZeros(a + b);
        if (removeZeros(a) + removeZeros(b) == c) {
            System.out.println("YES");

        } else
            System.out.println("NO");
    }
}
