import java.util.*;

public class Counterexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();

        if (r - l < 2) {
            System.out.println(-1);
            return;
        }

        if (l % 2 == 0) {
            System.out.println(l + " " + (l + 1) + " " + (l + 2));
        } else {
            if (r - l < 3) {
                System.out.println(-1);
            } else {
                System.out.println((l + 1) + " " + (l + 2) + " " + (l + 3));
            }
        }
    }
}
