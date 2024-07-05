package javaPractice;

public class OneDimensionArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[][] a = { { 1, 2, 3 }, { 5, 6, 7 } };
        int[][]x=new int [3][2];

        System.out.println(x[0][0]);
        System.out.print("one dimention array:");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Tow dimention array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
