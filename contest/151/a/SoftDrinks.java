import java.util.*;

public class SoftDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalMl = k * l;
        int totalLime = c * d;
        int salt = p / np;
        System.out.println(Math.min((totalMl / nl), Math.min(totalLime, salt)) / n);
    }
}
