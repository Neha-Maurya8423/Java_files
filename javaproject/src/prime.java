public class prime {
    public static void main(String[] args) {
        int num=17;
        int  flag=0;
        if(num==0 ||num==1)
        {
            System.out.println("not prime");
        }
        int m=num/2;
        for(int i=0;i<m;i++)
        {
            if(num%2==0)
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
