import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number:");
        int num=sc.nextInt();
        int  flag=0;
        if(num==0 ||num==1)
        {
            System.out.println("not prime");
        }
             for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
              System.out.println("not prime");
              flag=1;
              break;
            }
          
            }
            if(flag==0)
            {
            
                    System.out.println("prime number");
            
        }
    
    }
}
