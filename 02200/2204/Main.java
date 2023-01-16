import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            List<String> l = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            while(n-->0)
                l.add(br.readLine());
            Collections.sort(l, String.CASE_INSENSITIVE_ORDER);
            System.out.println(l.get(0));
        }
    }

}