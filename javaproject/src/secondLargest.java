public class secondLargest {
    public static void main(String args[]) {
        int arr[] = { 1,4,7,4,8,3,6,4,7 };
        int secondLarge = sNumber(arr);
        int secondSmallest = ssmalestNumber(arr);
        System.out.println("Second Largest"+ +secondLarge+" Second Smallest "+ +secondSmallest);

    }

    public static int sNumber(int arrays[]) {
        int slarge = -1;
        int largest = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > largest) {
                slarge = largest;
                largest = arrays[i];
                largest++;
            } else if (arrays[i] < largest && arrays[i] > slarge) {
                slarge = arrays[i];
            }
        }
        return slarge;
    }

    public static int ssmalestNumber(int arrays[]) {
        int secondSmallest = Integer.MAX_VALUE;
        int smallestN = arrays[0];
        for(int i=0;i<arrays.length;i++)
        {
            if(arrays[i]<smallestN)
          {
            secondSmallest=smallestN;
            smallestN=arrays[i];
            smallestN++;
          }
          else if(arrays[i]>smallestN && arrays[i]<secondSmallest)
          {
            secondSmallest=arrays[i];
          }
        }
        return secondSmallest;
    }
}
