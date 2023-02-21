import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Boolean> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine()), m = 0;
        String s;
        while(n-->0) {
            s = br.readLine();
            if("ENTER".equals(s)) {
                map.clear();
            } else if(!(map.containsKey(s))) {
                m++;
                map.put(s, true);
            }
        }
        System.out.print(m);
    }

}