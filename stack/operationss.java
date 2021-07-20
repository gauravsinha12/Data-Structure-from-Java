import java.util.*;
public class operationss 
{

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        
        String str = in.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    System.out.println(true);
                    return;
                }
                else
                {
                    while(st.peek() != '(')
                    {
                        st.pop();
                    }
                    st.pop();
                }
            }
                else
                {
                    st.push(ch);
                }
            }
            System.out.println(false);
        }
    }