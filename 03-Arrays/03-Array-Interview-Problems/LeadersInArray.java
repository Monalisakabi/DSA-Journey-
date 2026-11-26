import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = arr[arr.length - 1];
        leaders.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        Collections.reverse(leaders);

        System.out.print("Leaders: ");

        for (int num : leaders) {
            System.out.print(num + " ");
        }
    }
}