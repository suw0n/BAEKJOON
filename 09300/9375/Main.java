import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            Map<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine()), re = 1;
            while(n-->0){
                String[] s = br.readLine().split(" ");
                map.put(s[1], map.getOrDefault(s[1], 0)+1);
            }
            for(String a : map.keySet())
                re*=map.get(a)+1;
            System.out.println(re-1);
        }
    }

}