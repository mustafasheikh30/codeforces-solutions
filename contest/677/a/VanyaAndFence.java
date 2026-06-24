import java.util.*;

/** VanyaAndFence */
public class VanyaAndFence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int roadWidth = 0;
        for (int var : a) {
            if (var <= h)
                roadWidth++;
            else
                roadWidth += 2;
        }
        System.out.println(roadWidth);
    }
}
