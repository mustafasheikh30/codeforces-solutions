import java.util.*;

public class SquareString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String first = s.substring(0, s.length() / 2);
            String second = s.substring(s.length() / 2, s.length());
            if (s.length() % 2 != 0) {
                System.out.println("NO");
            } else {
                if (first.equals(second)) {
                    System.out.println("YES");

                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
