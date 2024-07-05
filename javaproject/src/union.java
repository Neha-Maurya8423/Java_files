import java.util.*;
public class union {
    public static void main(String args[])
    {
        int aa[]={1,8,3,6};
        int a[]={9,8,3,4,7};
        int n=aa.length;
         int m=a.length;
        int index=0;
        int i=0;
        int j=0;
        int res[]=new int [n+m];
         Arrays.sort(aa);
         Arrays.sort(a);
            while(i<n && j<m)
            {
                if(aa[i]==a[j])
                {
                    res[index++]=aa[i++];
                    j++;
                        
                }
                else if(aa[i]<a[j])
                {
                  i++;
                }
               
                else{
                    j++;
                }
               
            }
            while(i<n)
            {
                
                res[index++]=aa[i++];
            }
             while(j<m)
            {
                res[index++]=a[j++];
            }
        
        for(int k=0;k<n;k++)
        {
            System.out.print(res[k]+",");
        }
    }
    
}
