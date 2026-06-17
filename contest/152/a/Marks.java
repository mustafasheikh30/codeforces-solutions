import java.util.*;

/** Marks */
public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String rows[] = new String[n];
        for (int i = 0; i < n; i++) {
            rows[i] = sc.next();
        }
        int[] maxMark = new int[m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                maxMark[j] = Math.max(maxMark[j], rows[i].charAt(j) - '0');
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i].charAt(j) - '0' == maxMark[j]) {
                    count++;
                    break; // this student is successful, no need to check further
                }
            }
        }
        System.out.println(count);
    }
}
