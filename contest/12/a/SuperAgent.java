import java.util.*;

public class SuperAgent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] grid = new String[3];
        for (int i = 0; i < 3; i++) {
            grid[i] = sc.nextLine();
        }
        boolean b = true; // start true, assume symmetric

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (grid[r].charAt(c) != grid[2 - r].charAt(2 - c)) {
                    b = false;
                }
            }
        }

        if (b == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
