import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

    static int[] cnt;

    static int find(int n) {
        return parent[n]==n ? n : (parent[n] = find(parent[n]));
    }

    static void union(int a, int b) {
        if(a>b) {
            int t = a;
            a = b;
            b = t;
        }
        if(a!=b) {
            parent[b] = a;
            cnt[a]+=cnt[b];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n, m, q, k, i = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        cnt = new int[n+1];
        for(; i<=n; i++) {
            parent[i] = i;
        }
        st = new StringTokenizer(br.readLine());
        for(i = 1; i<=n; i++) {
            k = Integer.parseInt(st.nextToken());
            cnt[i] = (k==1 ? 1 : -1);
        }
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            union(
                    find(Integer.parseInt(st.nextToken())),
                    find(Integer.parseInt(st.nextToken()))
            );
        }
        while(q-->0) {
            sb.append(cnt[find(Integer.parseInt(br.readLine()))]>0 ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }

}