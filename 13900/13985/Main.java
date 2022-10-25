import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        String s1 = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        String s2 = st.nextToken();
        int c = Integer.parseInt(st.nextToken());
        a = s1.equals("+")?a+b:s1.equals("-")?a-b:s1.equals("*")?a*b:s1.equals("/")?a/b:a%b;
        System.out.println(a==c?"YES":"NO");
    }

}