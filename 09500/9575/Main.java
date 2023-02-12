import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static int[] arr1;
    static int[] arr2;
    static int[] arr3;

    static StringTokenizer st;

    static int[] input(int[] arr, int n, String s) {
        arr = new int[n];
        st = new StringTokenizer(s);
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    static boolean is58(int n) {
        while(n!=0) {
            if(n%10!=5 && n%10!=8) {
                return false;
            }
            n/=10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<Integer> set;
        int t = Integer.parseInt(br.readLine());
        int n1, n2, n3, sum, i, j, k;
        while(t-->0) {
            set = new HashSet<>();
            n1 = Integer.parseInt(br.readLine());
            arr1 = input(arr1, n1, br.readLine());
            n2 = Integer.parseInt(br.readLine());
            arr2 = input(arr2, n2, br.readLine());
            n3 = Integer.parseInt(br.readLine());
            arr3 = input(arr3, n3, br.readLine());
            for(i = 0; i<n1; i++) {
                for(j = 0; j<n2; j++) {
                    for(k = 0; k<n3; k++) {
                        sum = arr1[i]+arr2[j]+arr3[k];
                        if(is58(sum)) {
                            set.add(sum);
                        }
                    }
                }
            }
            sb.append(set.size()).append("\n");
        }
        System.out.print(sb);
    }

}