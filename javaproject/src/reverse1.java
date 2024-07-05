public  class  reverse1 {
    public static void main(String args[])
    {
     int array[]={1,2,3,4,5};
     reverse2(array);
     printArray(array);
    }
     public static void reverse2(int arr[])
     {
     int start=0,end=arr.length-1;
     for(int i=0;i<arr.length/2;i++){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        
     }
    } 
    public static void printArray(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
}

