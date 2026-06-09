import java.util.*;

public class ValeraX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            grid[i] = sc.next();
        }

        char diag = grid[0].charAt(0);
        char other = grid[0].charAt(1);

        if (diag == other) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) {

                    if (grid[i].charAt(j) != diag) {
                        System.out.println("NO");
                        return;
                    }

                } else {

                    if (grid[i].charAt(j) != other) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }

        System.out.println("YES");
    }
}
