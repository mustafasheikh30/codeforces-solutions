import java.util.*;

/** MinimumDifficulty */
public class MinimumDifficulty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int answer = Integer.MAX_VALUE;
        for (int remove = 1; remove < n - 1; remove++) {

            int maxGap = 0;
            int prev = a[0];

            for (int i = 1; i < n; i++) {

                if (i == remove) {
                    continue;
                }

                int gap = a[i] - prev;
                maxGap = Math.max(maxGap, gap);

                prev = a[i];
            }

            answer = Math.min(answer, maxGap);
        }
        System.out.println(answer);
    }
}
