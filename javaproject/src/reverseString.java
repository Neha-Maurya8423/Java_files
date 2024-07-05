public class reverseString {
    public static void main(String args[])
    {
        char s[] ={'H','e','l','l','o'};
         for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]);
        }
        System.out.println();
         reverseString(s);
       
    }
    public static void reverseString(char[] s)

    {
       for(int i=0;i<s.length;i++)
        {
            int low=0,hight=s.length-1-i;
            char temp=s[hight];
            s[hight]=s[low];
            s[low]=temp;
            hight--;
            low++;
        } 
        // System.out.print("[");
        // for(int i=0;i<s.length;i++)
        // {
        //     System.out.print(s[i]+",");
        // }
        //  System.out.print("]");
        for(int i=0;i<s.length;i++)
        {
           System.out.print(s[i]);
        }
         
    }
    
}

