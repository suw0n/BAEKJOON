import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

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
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()), n, m, k, l = t, i;
        StringTokenizer st;
        while(t-->0) {
            n = Integer.parseInt(br.readLine());
            parent = new int[n];
            for(i = 0; i<n; i++) {
                parent[i] = i;
            }
            k = Integer.parseInt(br.readLine());
            while(k-->0) {
                st = new StringTokenizer(br.readLine());
                union(
                        find(Integer.parseInt(st.nextToken())),
                        find(Integer.parseInt(st.nextToken()))
                );
            }
            m = Integer.parseInt(br.readLine());
            sb.append("Scenario " + (l-t) + ":").append("\n");
            while(m-->0) {
                st = new StringTokenizer(br.readLine());
                sb.append(find(Integer.parseInt(st.nextToken()))==find(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

}