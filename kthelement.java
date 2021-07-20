import java.util.*;
public class kthelement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k;
        int[] arr = new int[10];
        System.out.println("Enetr 10 elements in array");
        for(int i=0;i<10;i++){
            arr[i] =in.nextInt();
        }
        System.out.println("Enter witch smallest no. you want to print");
        k=in.nextInt();
        int temp;
        for(int i=0;i<10;i++)
        {
            for(int m=0;m<9;m++){
                if(arr[m]>arr[m+1]){
                    temp = arr[m];
                    arr[m] = arr[m+1];
                    arr[m+1] = temp; 
            }
        }
    }
    System.out.println(arr[k-1]);
}
}
