import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Double> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine()), m;
        int[] arr = new int[n];
        String s = br.readLine();
        m = s.length();
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        for(int i = 0; i<m; i++){
            char c = s.charAt(i);
            if(c<'A'){
                double a = stack.pop(), b = stack.pop();
                stack.push('+'==c?a+b:'-'==c?b-a:'*'==c?a*b:b/a);
            }
            else
                stack.push((double)arr[c-'A']);
        }
        System.out.printf("%.2f", stack.pop());
    }

}