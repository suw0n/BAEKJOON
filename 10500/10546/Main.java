import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine()), i;
        String s;
        for(i = 0; i<n; i++) {
            s = br.readLine();
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(i = 1; i<n; i++) {
            s = br.readLine();
            map.put(s, map.get(s)-1);
        }
        for (String s2 : map.keySet()) {
            if(map.get(s2)>0) {
                System.out.print(s2);
                break;
            }
        }
    }

}