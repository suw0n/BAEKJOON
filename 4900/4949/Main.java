import java.util.Stack;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            int n = s.length(), m = 0;
            if(".".equals(s))
                break;
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i<n; i++){
                char c = s.charAt(i);
                if(c=='('||c=='{'||c=='[')
                    stack.push(c);
                else if(c==')'||c=='}'||c==']'){
                    if(stack.isEmpty()){
                        m = 1;
                        break;
                    }
                    char k = stack.pop();
                    if(c==')'&&k!='('){
                        m = 1;
                        break;
                    }
                    else if(c=='}'&&k!='{'){
                        m = 1;
                        break;
                    }
                    else if(c==']'&&k!='['){
                        m = 1;
                        break;
                    }
                }
            }
            System.out.println(m==1?"no":stack.isEmpty()?"yes":"no");
        }
    }

}