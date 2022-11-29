import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] re = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            re[i] = Integer.parseInt(st.nextToken());
            hs.add(re[i]);
        }
        Integer[] arr = hs.toArray(new Integer[0]);
        Arrays.sort(arr);
        for(int i = arr.length-1; i>=0; i--)
            map.put(arr[i], i);
        for(int i = 0; i<n; i++)
            sb.append(map.get(re[i])+" ");
        System.out.print(sb);
    }

}