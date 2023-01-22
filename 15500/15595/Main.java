import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()), a = 0, b = 0;
        Map<String, Integer> map = new HashMap<>();
        while(t-->0) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[2]);
            if(!"megalusion".equals(arr[1])) {
                int m = map.getOrDefault(arr[1], 0);
                if(4==n && m!=-1) {
                    a++;
                    b+=m;
                    map.put(arr[1], -1);
                } else if(4<n && m!=-1){
                    map.put(arr[1], m+1);
                }
            }
        }
        System.out.printf("%.10f", a==0?0:(double)a/(double)(a+b)*100.0);
    }

}