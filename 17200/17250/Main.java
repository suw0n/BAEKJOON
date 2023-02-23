import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

    static int find(int n) {
        return parent[n]==n ? n : (parent[n] = find(parent[n]));
    }

    static void union(int a, int b) {
        parent[b] = a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m, i = 1, a, b, t;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        for(; i<=n; i++) {
            parent[i] = i;
            map.put(i, Integer.parseInt(br.readLine()));
        }
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            a = find(Integer.parseInt(st.nextToken()));
            b = find(Integer.parseInt(st.nextToken()));
            if(a>b) {
                t = a;
                a = b;
                b = t;
            }
            if(a!=b) {
                union(a, b);
                map.replace(a, map.get(a)+map.get(b));
            }
            sb.append(map.get(a)).append("\n");
        }
        System.out.print(sb);
    }

}