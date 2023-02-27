import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<Integer, Integer> map;

    static int[] parent;

    static int[] money;

    static int find(int n) {
        return parent[n]==n ? n : (parent[n]=find(parent[n]));
    }

    static void union(int a, int b) {
        if(a>b) {
            int t = a;
            a = b;
            b = t;
        }
        if(a!=b) {
            parent[b] = a;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, m, k, i = 1, l, sum = 0;
        map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        money = new int[n+1];

        for(; i<=n; i++) {
            parent[i] = i;
        }
        st = new StringTokenizer(br.readLine());
        for(i = 1; i<=n; i++) {
            money[i] = Integer.parseInt(st.nextToken());
        }
        for(i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            union(
                    find(Integer.parseInt(st.nextToken())),
                    find(Integer.parseInt(st.nextToken()))
            );
        }

        for(i = 1; i<=n; i++) {
            l = find(i);
            if(map.containsKey(l)) {
                if(money[i]<map.get(l)) {
                    map.replace(l, money[i]);
                }
            } else {
                map.put(l, money[i]);
            }
        }

        for (int p : map.keySet()) {
            sum+=map.get(p);
        }
        System.out.print(sum>k ? "Oh no" : sum);
    }

}