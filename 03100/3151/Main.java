import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m, l, r, i = 0, sum, c1, c2;
        int[] arr = new int[n];
        long re = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(i = 0; i<n-2; i++) {
            l = i+1;
            r = n-1;
            while(l<r) {
                sum = arr[i]+arr[l]+arr[r];
                if(sum==0) {
                    c1 = c2 = 1;
                    if(arr[l]==arr[r]) {
                        m = r-l+1;
                        re+=(m*(m-1)/2);
                        break;
                    } else {
                        while (l+1<r && arr[l]==arr[l+1]) {
                            c1++;
                            l++;
                        }
                        while (l<r-1 && arr[r]==arr[r-1]) {
                            c2++;
                            r--;
                        }
                        re+=((long)c1*c2);
                    }
                }
                l = sum<=0 ? l+1 : l;
                r = sum>0 ? r-1 : r;
            }
        }
        System.out.print(re);
    }

}