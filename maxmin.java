import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sizee;
        System.out.println("Enter the size of array");
        sizee=in.nextInt();
        int[] ar = new int[sizee];
        for(int i=0;i<sizee;i++){
            ar[i] = in.nextInt();
        }
        int temp1,temp2,max=0,min=0;
        for(int i=0;i<sizee;i++){
            for(int j=0;j<sizee;j++){
                if(ar[i]<ar[j]){
                    temp1 = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp1;
                }
                max = ar[i];
            }
            for(int k=0;k<sizee;k++){
                if(ar[i]>ar[k]){
                    temp2 = ar[i];
                    ar[i] = ar[k];
                    ar[k] = temp2; 
                }
                min = ar[i];
            }
        }
        System.out.println("Max number is "+max+" min is "+min);
        System.out.println(Arrays.toString(ar));
    }
}