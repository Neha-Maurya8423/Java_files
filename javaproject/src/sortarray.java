import java.util.*;
public class sortarray {
    public static void main(String args[])
    {
       int arr[]={1,0,1,1,0,1,0};
       int n=arr.length-1;
       int left=0;
       int rigth=arr.length-1;
       System.out.println(" Unsortded array");
       for(int j=0;j<arr.length-1;j++)
       {
        System.out.print(arr[j]+" ");
       }

       while(left<=rigth)
       {
         if(arr[left]==0)
         {
            int temp=arr[left];
            arr[left]=arr[rigth];
            arr[rigth]=temp;
            rigth--;
         }
         else
         {
            left++;
         }
      
       }
        System.out.println(" sortded array");
       for(int i=0;i<arr.length-1;i++)
       {
        System.out.print(arr[i]+" ");
       }
    
    } 
}
