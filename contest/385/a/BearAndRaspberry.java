import java.util.*;

/** BearAndRaspberry */
public class BearAndRaspberry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int curr = prices[i] - (prices[j] + c);

            if (curr > max) {
                max = curr;
            }
        }
        if (max <= 0) {
            System.out.println(0);

        } else {
            System.out.println(max);
        }
    }
}
