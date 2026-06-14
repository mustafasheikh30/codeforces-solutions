import java.util.*;

public class RomaAndLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      int ai = sc.nextInt();
      int tempcount = 0;
      while (ai > 0) {
        int digit = ai % 10;
        if (digit == 4 || digit == 7) tempcount++;
        ai /= 10;
      }
      if (tempcount <= k) count++;
    }
    System.out.println(count);
  }
}
