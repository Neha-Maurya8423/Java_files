package javaPractice;
import java.util.*;
import java.lang.Math;


public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to convert:");
         long n =sc.nextInt();
        long res=0,i=0;
        String c="shiva";
        String b="vajay";
        // if(c==b)
        // {
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
        while (n!=0) {
            long bit=n&1;
            res=bit*(long)(Math.pow(10,i)+1);
            n=n>>1;
            i++;
            //  res=n%2;
            // n/=10;

        }

      System.out.println(res);
    }
    

}
