import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String s = "abcdef";
        String t = "mnhkli";
       boolean res= validAnagram(s, t);
       System.out.println(res);
    }

    public static boolean validAnagram(String a, String b) {
        if (a.length() != b.length()) {
            
            return false;
        }

        char[] cha1 = a.toCharArray();
        char[] cha2 = b.toCharArray();
         
        Arrays.sort(cha1);
        Arrays.sort(cha2);
        for(int i=0;i<cha1.length;i++)
        {
            if(cha1[i]!=cha2[i])
            {
                cha2[i]=cha1[i];
            }
        }
        String str= new String(cha1);
        String str1= new String(cha2);
        System.out.println(str);
        System.out.println(str1);
      if(str.equals(str1))
      {

        return true;
      }
      return false;
  
    }
}
