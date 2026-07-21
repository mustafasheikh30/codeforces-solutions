import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> goal = new HashMap<>();

        while (n-- > 0) {
            String s = sc.nextLine();
            goal.put(s, goal.getOrDefault(s, 0) + 1);
        }

        String winner = "";
        int max = 0;

        for (Map.Entry<String, Integer> e : goal.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }
        System.out.println(winner);
    }
}
