import java.util.*;

public class DZYLovesChessboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] chessboard = new char[n][m];
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < m; j++) {
                chessboard[i][j] = input.charAt(j);
                if (chessboard[i][j] == '-') {
                    s.append('-');
                } else {
                    if (i % 2 != 0) {
                        s.append((j % 2 != 0) ? 'W' : 'B');
                    }
                    if (i % 2 == 0) {
                        s.append((j % 2 != 0) ? 'B' : 'W');
                    }
                }
            }
            System.out.println(s.toString());
        }
    }
}
