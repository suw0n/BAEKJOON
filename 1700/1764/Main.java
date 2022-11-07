import java.util.*;
import java.io.*;

public class Main {

    static boolean binary(int l, int r, String[] s, String t){
        int m;
        while(l<r){
            m = (l+r)/2;
            if(t.equals(s[m]))
                return true;
            else if(t.compareTo(s[m])<0)
                r = m-1;
            else
                l = m+1;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] s = new String[n];
        List<String> s2 = new ArrayList<>();
        for(int i = 0; i<n; i++)
            s[i] = br.readLine();
        Arrays.sort(s, Comparator.naturalOrder());
        for(int i = 0; i<m; i++) {
            String t = br.readLine();
            if(Arrays.binarySearch(s, t)>=0){
                cnt++;
                s2.add(t);
            }
        }
        Collections.sort(s2);
        sb.append(cnt + "\n");
        for(int i = 0; i<cnt; i++)
            sb.append(s2.get(i) + "\n");
        System.out.print(sb);
    }

}