import java.util.*;

public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = min_value(arr);
        int res1 = max_value(arr);
        System.out.println("min" + res + "max" + res1);
    }

    public static int min_value(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)// [1,3,2,4,6]
        {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max_value(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)// [1,3,2,4,6]
        {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}