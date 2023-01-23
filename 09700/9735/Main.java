import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            Map<Double, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            double r1 = 1, r2 = 1, r3 = 1, r4 = 1;
            int[] arr = new int[4];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i<4; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            list.add(0);
            for(int i = arr[3]<0?arr[3]*-1:arr[3]; i>0; i--){
                if(arr[3]%i==0){
                    list.add(i);
                    list.add(-i);
                }
            }
            for(int i = list.size()-1; i>=0; i--){
                int x = list.get(i);
                r1 = arr[0];
                r2 = arr[1]+x*r1;
                r3 = arr[2]+x*r2;
                r4 = arr[3]+x*r3;
                if(r4==0)
                    map.put((double)x, i=-1);
            }
            double d = r2*r2-4*r1*r3, z = Math.sqrt(d);
            if(d>0){
                map.put((-r2+z)/(2*r1), 1);
                map.put((-r2-z)/(2*r1), 1);
            }
            else if(d==0)
                map.put((-r2+z)/(2*r1), 1);
            List<Double> re = new ArrayList<>(map.keySet());
            Collections.sort(re, Collections.reverseOrder());
            for(int i = re.size()-1; i>=0; i--)
                sb.append(String.format("%.10f", re.get(i))+" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }

}