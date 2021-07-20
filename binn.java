import java.util.*;
public class binn {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int k=in.nextInt();
        int v=0;
        int c;
        String st = "";
        for(int i=0;i<=a;i++)
        {
            st=Integer.toBinaryString(i);
            c=0;
            for(int j=0;j<=st.length()-3;j++)
            {
                if(st.substring(j,j+3).equals("101"))
                {
                    c+=1;
                }
            }
            if(c>=k)
            {
                v+=1;
            }
        }
        in.close();
    System.out.println(v);
    }
}
