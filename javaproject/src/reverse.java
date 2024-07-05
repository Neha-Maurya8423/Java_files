import java.util.*;
public class reverse {
    public static void main(String args[])

    {
    //     String str="nehamaurya acbd";
    //    String rev="";
    //     char ch;
    //     for(int i=0;i<str.length();i++)
    //     {
    //         ch=str.charAt(i);
    //         rev=ch+rev;

    //     }
    //       System.out.print(rev);



    String str="Rahul is a boy";
    String rev="",word="";
    str=str+" ";
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch!=' ')
        {

            word=word+ch;
        }
        else{
            rev=word+" "+rev;
            word="";
        }
        
    }
    System.out.println(rev);
    }
    
}
