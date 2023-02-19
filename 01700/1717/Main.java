import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] parent;

    static int find(int n) {
        return parent[n]==n ? n : (parent[n]=find(parent[n]));
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
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
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m, k, a, b, i = 0;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        for(; i<=n; i++) {
            parent[i] = i;
        }
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(k==0) {
                union(a, b);
            } else {
                sb.append(find(a)==find(b) ? "YES" : "NO").append("\n");
            }
        }
        System.out.print(sb);
    }

}