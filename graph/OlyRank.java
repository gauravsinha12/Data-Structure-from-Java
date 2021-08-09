import java.io.*;
public class OlyRank {
    public static void main (String[] args) throws IOException 
    {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int t=Integer.parseInt(inp.readLine());
        int k=0,p=0;
		for(int i = 0;i<t;i++){
            int[] a = new int[3];
            int[] b = new int[3];
            String str[]= inp.readLine().split(" ");
            int g = 3;
            for(int j = 0; j<=2; j++){
                a[j] = Integer.parseInt(str[j]);
                b[j] = Integer.parseInt(str[g]);
                g+=1;
            }
                for(int h =0; h<=2; h++){
                    k += a[h];
                }
                for(int l =0; l<=2; l++){
                    p += b[l];
                }
                if(k>p){
                    System.out.println("1");
                }
                else{
                    System.out.println("2");
                }
		}
	}    
}