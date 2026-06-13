import java.util.Scanner;

public class WatchingaMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] l = new int[n], r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int cur = 1, watched = 0;
        for (int i = 0; i < n; i++) {
            // skip as much as possible before l[i]
            while (cur + x <= l[i])
                cur += x;
            // watch remaining gap to reach l[i]
            while (cur < l[i]) {
                watched++;
                cur++;
            }
            // watch the full segment
            watched += r[i] - l[i] + 1;
            cur = r[i] + 1;
        }

        System.out.println(watched);
    }
}
