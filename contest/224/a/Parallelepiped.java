import java.util.*;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        long abc = (long) Math.sqrt(s1 * s2 * s3);
        long edgeA = abc / s2;
        long edgeB = abc / s3;
        long edgeC = abc / s1;
        System.out.println(4 * (edgeA + edgeB + edgeC));
    }
}
