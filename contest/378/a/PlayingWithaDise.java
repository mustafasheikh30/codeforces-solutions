import java.util.*;

/** PlayingWithaDise */
public class PlayingWithaDise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int x = 1; x <= 6; x++) {
            if (Math.abs(a - x) < Math.abs(b - x)) {
                count1++;
            } else if (Math.abs(a - x) > Math.abs(b - x)) {
                count2++;

            } else if (Math.abs(a - x) == Math.abs(b - x)) {
                count3++;
            }
        }
        System.out.println(count1);

        System.out.println(count3);
        System.out.println(count2);
    }
}
