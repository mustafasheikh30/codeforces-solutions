import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int v = sc.nextInt();

        ArrayList<Integer> sellers = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int k = sc.nextInt();

            boolean valid = false;

            for (int j = 0; j < k; j++) {

                int price = sc.nextInt();

                if (price < v) {
                    valid = true;
                }
            }

            if (valid) {
                sellers.add(i + 1);
            }
        }

        System.out.println(sellers.size());

        for (int seller : sellers) {
            System.out.print(seller + " ");
        }
    }
}
