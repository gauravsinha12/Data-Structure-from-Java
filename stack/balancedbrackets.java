package stack;

import java.util.*;
public class balancedbrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()=='('){
                    st.pop();
                }
                else{
                    System.out.println(false);
                }
            }
            else if(ch=='}'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    System.out.println(false);
                }
            }
            else if(ch=='['){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()==']'){
                    st.pop();
                }
                else{
                    System.out.println(false);
                }
            }
            else{
                continue;
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
