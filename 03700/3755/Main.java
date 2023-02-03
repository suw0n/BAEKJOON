import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), r;
            if(n==0) {
                break;
            } else if(n==1) {
                int[] mk = new int[2];
                for(int i = 0; i<2; i++)
                    mk[i] = Integer.parseInt(st.nextToken());
                map.put(mk[1], mk[0]);
            } else {
                if(map.isEmpty()) {
                    sb.append("0\n");
                    continue;
                }
                r = n==2 ? map.lastKey() : map.firstKey();
                sb.append(map.get(r) + "\n");
                map.remove(r);
            }
        }
        System.out.print(sb);
    }

}