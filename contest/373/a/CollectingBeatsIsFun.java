import java.util.*;

public class CollectingBeatsIsFun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int freq[] = new int[10];
        for (int i = 0; i < 4; i++) {
            String row = sc.next();
            for (int j = 0; j < 4; j++) {
                char c = row.charAt(j);
                if (c != '.') {
                    freq[c - '0']++;
                }
            }
        }
        boolean possible = true;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > k * 2) {
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
