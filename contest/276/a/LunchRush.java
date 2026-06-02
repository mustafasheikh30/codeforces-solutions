import java.util.*;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = In
        int joy = 0;
        while (n-- > 0) {
            int fi = sc.nextInt();
            int ti = sc.nextInt();
            if (ti > k) {
                joy = fi - (ti - k);
            } else {
                joy = fi;
            }
            if (joy > max) {
                max = joy;
            }
        }
        System.out.println(max);
    }
}
