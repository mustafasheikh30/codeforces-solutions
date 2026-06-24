import java.util.*;

/** Division */
public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int di = arr[i];
            if (di >= 1900) {
                System.out.println("Division 1");

            } else if (di >= 1600 && di <= 1899) {
                System.out.println("Division 2");
            } else if (di >= 1400 && di <= 1599) {
                System.out.println("Division 3");

            } else {
                System.out.println("Division 4");
            }
        }
    }
}
