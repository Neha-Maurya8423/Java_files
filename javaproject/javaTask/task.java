package javaproject.javaTask;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the electric bill:");
		int units=sc.nextInt();
		int bill=0;
		  if (units <= 100) {
	            bill = 0;
	        } else if (units <= 200) {
	            bill = (units - 100) * 5;
	        } else if (units <= 400) {
	            bill = (100 * 5) + ((units - 200) * 10);
	            bill = (100 * 5) + (200 * 10) + ((units - 400) * 15);
	        }
		System.out.println("total bill is:"+bill);
		
    }
    
}
