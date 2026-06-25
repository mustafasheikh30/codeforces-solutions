import java.util.*;

public class Cifera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long l = sc.nextLong();
        int count = 0;
        while (l > 1) {
            if (l % k != 0) {
                break;
            }
            l /= k;
            count++;
        }
        if (l == 1) {
            System.out.println("YES");
            System.out.println(count - 1);
        } else {
            System.out.println("NO");
        }
    }
}
