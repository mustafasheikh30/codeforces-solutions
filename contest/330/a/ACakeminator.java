import java.util.Scanner;

public class ACakeminator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        boolean[] safeRow = new boolean[r];
        boolean[] safeCol = new boolean[c];

        char[][] cake = new char[r][c];

        // input grid
        for (int i = 0; i < r; i++) {
            String row = sc.next();

            for (int j = 0; j < c; j++) {
                cake[i][j] = row.charAt(j);
            }
        }

        // check safe rows
        for (int i = 0; i < r; i++) {

            boolean hasS = false;

            for (int j = 0; j < c; j++) {

                if (cake[i][j] == 'S') {
                    hasS = true;
                }
            }

            if (!hasS) {
                safeRow[i] = true;
            }
        }

        // check safe columns
        for (int j = 0; j < c; j++) {

            boolean hasS = false;

            for (int i = 0; i < r; i++) {

                if (cake[i][j] == 'S') {
                    hasS = true;
                }
            }

            if (!hasS) {
                safeCol[j] = true;
            }
        }

        // count eatable cells
        int count = 0;

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                if (safeRow[i] || safeCol[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
