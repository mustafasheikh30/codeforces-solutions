import java.util.*;

public class GigaTower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        boolean isFound = false;
        long b = 0;
        long temp = a + 1;
        while (!isFound) {
            int count = 0;
            long num = Math.abs(temp);
            while (num > 0) {
                long current = num % 10;
                num = num / 10;
                if (current == 8) {
                    count++;
                }
            }
            if (count > 0) {
                b = temp - a;
                isFound = true;
            }
            temp++;
        }
        System.out.println(b);
    }
}
