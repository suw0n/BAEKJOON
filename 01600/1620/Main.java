import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        int[] nm = new int[2];
        for(int i = 0; i<2; i++)
            nm[i] = Integer.parseInt(st.nextToken());
        for(int i = 1; i<=nm[0]; i++) {
            String s = br.readLine();
            map1.put(s, i);
            map2.put(i, s);
        }
        while(nm[1]-->0){
            String s = br.readLine();
            sb.append(s.charAt(0)>64?map1.get(s):map2.get(Integer.parseInt(s))).append("\n");
        }
        System.out.print(sb);
    }

}