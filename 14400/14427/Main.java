import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Num implements Comparable<Num> {
        int num;
        int value;

        public Num(int num, int value) {
            this.num = num;
            this.value = value;
        }

        @Override
        public int compareTo(Num o) {
            return value==o.value ? num-o.num : value-o.value;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeSet<Num> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n, m, k, a, b;
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n; i++) {
            k = Integer.parseInt(st.nextToken());
            map.put(i, k);
            set.add(new Num(i, k));
        }
        m = Integer.parseInt(br.readLine());
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("2")) {
                sb.append(set.first().num).append("\n");
            } else {
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                set.remove(new Num(a, map.get(a)));
                map.put(a, b);
                set.add(new Num(a, b));
            }
        }
        System.out.print(sb);
    }

}