public class polindron {

    public static void main(String agrs[])
    {
       int n=1232;
       int rev,sum=0,temp;
       temp=n;
       while(n>0)
       {
         rev=n%10;
        sum=(sum*10)+rev;
        n=n/10;
       }
       if(temp==sum)
       {
        System.out.print("polindrom");
       }
       else{
        System.out.print("not polindrom");
       }
    }
    
}
