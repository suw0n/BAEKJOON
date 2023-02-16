import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()), n, m, i;
        StringTokenizer st;
        TreeMap<Integer, String> map;
        String s;
        while(t-->0) {
            map = new TreeMap<>(Comparator.reverseOrder());
            n = Integer.parseInt(br.readLine());
            for(i = 0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                s = st.nextToken();
                m = Integer.parseInt(st.nextToken());
                map.put(m, s);
            }
            i = 0;
            for (int j : map.keySet()) {
                sb.append(map.get(j));
                if(i++ < n-1) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

}