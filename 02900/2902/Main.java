import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String re = "";
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            s.toUpperCase();
            re += s.charAt(0);
        }
        System.out.print(re);
    }

}