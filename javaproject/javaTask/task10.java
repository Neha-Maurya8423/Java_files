package javaproject.javaTask;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("a is greater  than b");
		} else if (b > a) {
			System.out.println("b is greater  than a");
		} else {
			System.out.println("a and b both are equal");
		}
    }
    
}
