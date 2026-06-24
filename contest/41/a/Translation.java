import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int count = 0;
        int length = t.length();
        if (t.length() == s.length()) {
            int i = 0;
            while (length > 0) {
                length--;
                if (t.charAt(length) == s.charAt(i)) {
                    count++;
                }
                i++;
            }
        } else {
            System.out.println("NO");
            return;
        }
        if (count == s.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
