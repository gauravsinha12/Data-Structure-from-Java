import java.util.*;
public class ngetr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enteer the size of array");
        int sizee = in.nextInt();
        int[] arr = new int[sizee];
        System.out.println("enter the elements of the array");
        for(int i=0;i<sizee;i++){
            arr[i]= in.nextInt();
        }
        int[] nge = new int[sizee];
        Stack<Integer> ge= new Stack<>();
        ge.push(arr[arr.length -1]);
        nge[arr.length - 1] = -1;
        for(int i = arr.length - 2;i>=0;i--){
            //apne se choton ko pop karega aur agar bada mila to ussko store karega
            while(ge.size()>0 && arr[i] >= ge.peek()){
                ge.pop();
            }
            if(ge.size() == 0){
                nge[i] = -1;
            }
            else{
                nge[i] = ge.peek();
            }
            ge.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nge));
    }
}
