import java.util.*;

/** InSearchOfAnEasyProblem */
public class InSearchOfAnEasyProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int ith = sc.nextInt();
            if (ith == 0) {
                count++;
            }
        }
        if (count == n)
            System.out.println("EASY");
        else
            System.out.println("HARD");
    }
}
