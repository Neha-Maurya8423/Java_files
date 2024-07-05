public class insertion_sort {
     public static void main(String args[])
    {
        int arr[] = {2,8,1,0,3,6};
        arr = insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[]insertion(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
          int temp=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>=temp)
          {
            arr[j+1]=arr[j];
            j--;
          }
          arr[j+1]=temp;
          
        }
        return arr;
    }
    
}
