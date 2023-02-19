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

        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()), i = 1, j;
        parent = new int[n+1];
        for(; i<=n; i++) {
            parent[i] = i;
        }
        for(i = 0; i<n-2; i++) {
            st = new StringTokenizer(br.readLine());
            union(
                    find(Integer.parseInt(st.nextToken())),
                    find(Integer.parseInt(st.nextToken()))
            );
        }
        for(i = 1; i<n; i++) {
            for(j = i+1; j<=n; j++) {
                if(find(i)!=find(j)) {
                    System.out.print(i + " " + j);
                    return ;
                }
            }
        }
    }

}