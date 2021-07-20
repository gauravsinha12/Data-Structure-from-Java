import java.util.*;
public class negativelement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sizee,temp;
        System.out.println("Enter the size of the array");
        sizee=in.nextInt();
        int[] ar = new int[sizee];
        for(int i=0;i<sizee;i++){
            ar[i] = in.nextInt();
        }
        for(int i=0;i<sizee;i++){
            for(int j=0;j<sizee-1;j++){
                if(ar[j]>0){
                    temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        
        }
        System.out.println(Arrays.toString(ar));
    }
}
