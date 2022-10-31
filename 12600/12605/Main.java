import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i<=n; i++){
            Stack<String> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                stack.push(st.nextToken());
            System.out.print("Case #" + i + ": ");
            while(stack.size()!=1)
                System.out.print(stack.pop() + " ");
            System.out.println(stack.pop());
        }
    }

}