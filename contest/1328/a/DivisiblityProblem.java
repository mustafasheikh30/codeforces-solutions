import java.util.*;

public class DivisiblityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long count = (a % b == 0) ? 0 : b - (a % b);
            System.out.println(count);
        }
    }
}
