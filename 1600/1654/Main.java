import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = -1;
        int[] kn = new int[2];
        for(int i = 0; i<2; i++)
            kn[i] = Integer.parseInt(st.nextToken());
        int[] arr = new int[kn[0]];
        for(int i = 0; i<kn[0]; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = arr[i]>max?arr[i]:max;
        }
        long l = 1, r = max, mid, re = 0;
        while(l<=r){
            mid = (l+r)/2;
            long sum = 0;
            for(int i = 0; i<kn[0]; i++)
                sum+=arr[i]/mid;
            if(sum<kn[1])
                r = mid-1;
            else{
                re = mid>re?mid:re;
                l = mid+1;
            }
        }
        System.out.print(re);
    }

}