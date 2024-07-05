public class bubble_sort {
    public static void main(String args[])
    {
        int arr[] = {1, 5, 4, 2, 0};
        arr = bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static int[] bubble(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++)
        {
           for(int j=1;j<arr.length-i;j++)
           {
            if(arr[j-1]>arr[j])
            {
              temp=arr[j-1];
              arr[j-1]=arr[j];
              arr[j]=temp;
            }
           } 
        }
        return arr;
    }//{1, 5, 4, 2, 0};5-0
}
