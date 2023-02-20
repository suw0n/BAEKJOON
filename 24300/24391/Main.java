import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m, i = 1, re = 0;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        for(; i<=n; i++) {
            parent[i] = i;
        }
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            union(
                    find(Integer.parseInt(st.nextToken())),
                    find(Integer.parseInt(st.nextToken()))
            );
        }
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(i = 0; i<n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        for(i = 0; i<n-1; i++) {
            re = find(list.get(i))!=find(list.get(i+1)) ? re+1 : re;
        }
        System.out.print(re);
    }

}