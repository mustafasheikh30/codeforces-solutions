import java.util.*;

/** PerfectPermutation */
public class PerfectPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);

        } else {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i <= n; i = +2) {
                s.append(i + 1).append(" ").append(i).append("");
            }
            System.out.println(s.toString().trim());
        }
    }
}
