
package javaproject.javaTask;
import java.util.*;

public class task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Citizen age");
        int age=sc.nextInt();
        String citizen=(age>=18)?"citizen is eligible for vote":"citizen is not eligible for vote";
        System.out.println(citizen);
    }
    
}
