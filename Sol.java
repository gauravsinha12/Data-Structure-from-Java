import java.util.*;

//minimun
 public class Sol {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("  ---------------LNCT BANK MANAGEMENT SYSTEM--------------------");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("Click 1 to Create an account");
        System.out.println("Click 2 to Deposit money");
        System.out.println("Click 3 to Withdraw money");
        System.out.println("enter Q to exit");

        String ch = in.next();
        switch(ch){
            case "1":
            System.out.print("Enter your name : ");
            String name = in.next();
            System.out.println(" ");
            System.out.print("Enter your age :");
            int age  = in.nextInt();
            System.out.println();
            System.out.print(" Create a password ");
            String pass = in.nextLine();
            break;

        }
    }
}
