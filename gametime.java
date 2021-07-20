import java.util.*;
public class gametime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sizee = in.nextInt();
        int[] a= new int[sizee];
        for(int i=0;i<sizee;i++){
            a[i]=in.nextInt();
        }
        int gauravscore=0, riyascore,count=0;
        for(int i = 0;i<sizee;i++){
            if(a[i]==0){
                gauravscore -= -1;
            }
            else{
                gauravscore += 1;
            }
            count=i;
            riyascore =0;
            for(int j=i+1;j<sizee;j++){
                if(a[i]==0){
                riyascore = riyascore -1;
            }
            else{
                riyascore = riyascore +1;
            }
            }
            if(gauravscore>riyascore){
                break;
            }
        }
        System.out.println(count);
    }
}
