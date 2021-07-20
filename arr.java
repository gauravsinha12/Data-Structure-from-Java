import java.util.*;
public class arr{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        
        int sizee;
        System.out.println("enter the size of the array");
        sizee = in.nextInt();
        int start = 0;
        int endd = sizee-1;
        int[] arrr = new int[sizee];
        System.out.println("Enter the element of array");
        for(int i=0;i<sizee;i++){
            arrr[i] = in.nextInt();
        }
        System.out.println("without reversing :-");
        System.out.println(Arrays.toString(arrr));
        int temp;
        while(start<endd){
            temp = arrr[start];
            arrr[start]=arrr[endd];
            arrr[endd] = temp;
            start++;
            endd--;
        }
        System.out.println("After reversing :-");

        System.out.println(Arrays.toString(arrr));
    }        
}