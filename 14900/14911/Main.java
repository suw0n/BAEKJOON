import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        int n = st.countTokens(), m = 0, re = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==m && !map.containsKey(arr[i])) {
                    re++;
                    map.put(arr[i], arr[j]);
                    System.out.println(arr[i] + " " + arr[j]);
                }
                else if(arr[i]+arr[j]>m)
                    break;
            }
        }
        System.out.print(re);
    }

}