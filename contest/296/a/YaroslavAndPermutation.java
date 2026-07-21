import java.util.*;

public class YaroslavAndPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int neighbourElements[] = new int[n];
        for (int i = 0; i < neighbourElements.length; i++) {
            neighbourElements[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < neighbourElements.length; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (neighbourElements[i] == neighbourElements[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }
        if (max <= (n + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
