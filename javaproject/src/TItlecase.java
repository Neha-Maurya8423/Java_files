
import java.util.*;
public class TItlecase {
    public static void main(String args[])
    {
        String str="neha maurya";
        char ch[]=str.toCharArray();
        boolean space=true;
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))
            {
                if(space)
                {
                   ch[i]=Character.toUpperCase(ch[i]);
                   space=false;
                }
            }
            else{
                space=true;
            }
        }
        String res=String.valueOf(ch);
        System.out.println(res);
    }
    
}
