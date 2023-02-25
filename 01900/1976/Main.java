import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

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
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, m, i = 1, j, k, l;
        boolean c = true;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        parent = new int[n+1];
        for(; i<=n; i++) {
            parent[i] = i;
        }
        for(i = 1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(j = 1; j<=n; j++) {
                if(Integer.parseInt(st.nextToken())==1) {
                    union(find(i), find(j));
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        for(i = 1; i<m; i++) {
            l = Integer.parseInt(st.nextToken());
            if(find(k)!=find(l)) {
                c = false;
                break;
            }
            k = l;
        }
        System.out.print(c ? "YES" : "NO");
    }

}