import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;
    static int[] sum;

    static int find(int n) {
        return parent[n]==n ? n : (parent[n] = find(parent[n]));
    }

    static void union(int a, int b) {
        parent[b] = a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()), i = 1, a, b;
        StringTokenizer st;
        parent = new int[1000001];
        sum = new int[1000001];
        for(; i<1000001; i++) {
            parent[i] = i;
            sum[i] = 1;
        }
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("I")) {
                a = find(Integer.parseInt(st.nextToken()));
                b = find(Integer.parseInt(st.nextToken()));
                if(a!=b) {
                    if(a>b) {
                        i = a;
                        a = b;
                        b = i;
                    }
                    union(a, b);
                    sum[a]+=sum[b];
                }
            } else {
                sb.append(sum[find(Integer.parseInt(st.nextToken()))]).append("\n");
            }
        }
        System.out.print(sb);
    }

}