import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                zeros.add(arr[i]);
            } else if (arr[i] < 0) {
                negatives.add(arr[i]);
            } else
                positives.add(arr[i]);
        }
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        ArrayList<Integer> set3 = new ArrayList<>();
        if (negatives.size() % 2 == 1) {
            set1.add(negatives.get(0));
            for (int i = 1; i < negatives.size(); i++) {
                set2.add(negatives.get(i));
            }
            set2.addAll(positives);
            set3.addAll(zeros);
        } else {
            set1.add(negatives.get(0));
            set3.add(negatives.get(1));
            set3.addAll(zeros);
            for (int i = 2; i < negatives.size(); i++) {
                set2.add(negatives.get(i));
            }
            set2.addAll(positives);
        }

        System.out.print(set1.size());
        for (Integer integer : set1) {
            System.out.print(" " + integer);
        }
        System.out.println();
        System.out.print(set2.size());
        for (Integer integer : set2) {
            System.out.print(" " + integer);
        }
        System.out.println();
        System.out.print(set3.size());
        for (Integer integer : set3) {
            System.out.print(" " + integer);
        }
    }
}
