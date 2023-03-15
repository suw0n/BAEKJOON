import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Boolean> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine()), re = 0;
        String s1, s2;
        StringTokenizer st;
        map.put("ChongChong", true);
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            s1 = st.nextToken();
            s2 = st.nextToken();
            if(s1.equals("ChongChong")) {
                map.put(s2, true);
            } else if(s2.equals("ChongChong")) {
                map.put(s1, true);
            } else if(map.getOrDefault(s1, false)) {
                map.put(s2, true);
            } else if(map.getOrDefault(s2, false)) {
                map.put(s1, true);
            }
        }
        for (String s : map.keySet()) {
            re = map.get(s) ? re+1 : re;
        }
        System.out.print(re);
    }

}