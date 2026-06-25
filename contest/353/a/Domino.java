import java.util.*;

public class Domino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumTop = 0;
        int sumBot = 0;
        int mixed = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            sumTop += x;
            sumBot += y;

            if (x % 2 != y % 2) // one odd, one even
                mixed++;
        }
        if (sumTop % 2 == 0 && sumBot % 2 == 0) {
            System.out.println(0);
        } else if (sumTop % 2 == 1 && sumBot % 2 == 1 && mixed > 0) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
