public class selection_sort {
    public static void main(String args[])
    {
        int arr[]={9,3,1,5,7};
        arr=selction(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[]selction(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[j]<arr[min])
               {
                min=j;
               }
            }
           
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    
}
