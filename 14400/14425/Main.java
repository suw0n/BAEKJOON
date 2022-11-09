import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int re = 0, n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] s = new String[n];
        while(n-->0)
            s[n] = br.readLine();
        Arrays.sort(s);
        while(m-->0){
            String l = br.readLine();
            re = Arrays.binarySearch(s, l)>=0?re+1:re;
        }
        System.out.print(re);
    }

}