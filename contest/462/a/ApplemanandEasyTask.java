import java.util.*;

public class ApplemanandEasyTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[][] grid = new char[n][n];

        for (int i = 0; i < n; i++) {

            String s = sc.next();

            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int count = 0;

                if (i > 0 && grid[i - 1][j] == 'o') {
                    count++;
                }

                if (i < n - 1 && grid[i + 1][j] == 'o') {
                    count++;
                }

                if (j > 0 && grid[i][j - 1] == 'o') {
                    count++;
                }

                if (j < n - 1 && grid[i][j + 1] == 'o') {
                    count++;
                }

                if (count % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
