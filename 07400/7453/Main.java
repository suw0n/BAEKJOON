import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static int[] a1;
    static int[] a2;

    static int lower(int[] a, int l, int r, int t) {
        int m;
        while(l<r) {
            m = (l+r)/2;
            if(a[m]>=t) {
                r = m;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    static int upper(int[] a, int l, int r, int t) {
        int m;
        while(l<r) {
            m = (l+r)/2;
            if(a[m]<=t) {
                l = m+1;
            } else {
                r = m;
            }
        }
        return l;
    }

    static int result(int[] a, int l, int r, int t) {
        return upper(a, l, r, t)-lower(a, l, r, t);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), i, j, k = 0;
        long re = 0;
        arr = new int[4][n];
        a1 = new int[n*n];
        a2 = new int[n*n];
        StringTokenizer st;
        for(i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(j = 0; j<4; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        for(i = 0; i<n; i++) {
            for(j = 0; j<n; j++) {
                a1[k] = arr[0][i]+arr[1][j];
                a2[k] = arr[2][i]+arr[3][j];
                k++;
            }
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(i = a1.length-1; i>=0; i--) {
            re = re+result(a2, 0, a2.length, -a1[i]);
        }
        System.out.print(re);
    }

}