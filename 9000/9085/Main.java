import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, re, t = Integer.parseInt(br.readLine());
        while(t-->0){
            re = 0;
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                re += Integer.parseInt(st.nextToken());
            System.out.println(re);
        }
    }

}
