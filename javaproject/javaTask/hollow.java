package javaproject.javaTask;

public class hollow {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++)
        {
           for(int j=1;j<=7;j++)
           {
            if(j==1 || j==7|| i==1 || i==5)
            System.out.print("* ");
            else
            System.out.print(" ");
           
           }
           
           System.out.println();
        }
    } 
}
