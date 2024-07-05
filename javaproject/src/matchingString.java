public class matchingString {
    public static void main(String[] args) {
        String str="wrhllo";
        String target="khlgr";
        boolean flag=false;
       for(int i=0;i<str.length();i++)
       { for(int j=0;j<target.length();j++)
        {
         if(str.charAt(i)==target.charAt(j))
         {
            System.out.print(i);
            flag=true;
            break;   
         }
        
        }
        if(flag==true)
         break;
       }
         
    }    
}
