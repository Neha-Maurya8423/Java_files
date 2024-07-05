import java.util.Scanner;

public class inputarray {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       System.out.println("give the size:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("give the array values:");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
             for(int j=0;j<col;j++)
             {
            arr[i][j]=sc.nextInt();
        }
    } 
System.out.println("output..................");
       for(int i=0;i<row;i++)
        {
             for(int j=0;j<col;j++)
             {
                System.out.print( arr[i][j]);    
        }
        System.out.println();
    } 

    }
    
}
