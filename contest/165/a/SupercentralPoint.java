import java.util.*;

/** SupercentralPoint */
public class SupercentralPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean up = false, down = false, left = false, right = false;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (x[i] == x[j] && y[j] > y[i])
                    up = true;
                if (x[i] == x[j] && y[j] < y[i])
                    down = true;
                if (y[j] == y[i] && x[j] < x[i])
                    left = true;
                if (y[j] == y[i] && x[j] > x[i])
                    right = true;
            }
            if (up && down && left && right)
                count++;
        }
        System.out.println(count);
    }
}
