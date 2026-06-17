import java.util.*;

/** TL */
public class TL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int v = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        v = Math.max(a[n - 1], 2 * a[0]);
        boolean bo = false;

        if (v < b[0]) {
            for (int i = 0; i < n; i++) {

                if (2 * a[i] <= v) {
                    bo = true;
                    break;
                }
            }
        }
        if (bo) {
            System.out.println(v);
        } else
            System.out.println(-1);
    }
}
