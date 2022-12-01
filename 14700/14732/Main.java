import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int re = 0, n = Integer.parseInt(br.readLine());
        int[][] arr = new int[510][510];
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] xy = new int[4];
            for(int i = 0; i<4; i++)
                xy[i] = Integer.parseInt(st.nextToken());
            for(int i = xy[1]; i<xy[3]; i++)
                for(int j = xy[0]; j<xy[2]; j++)
                    arr[i][j]++;
        }
        for(int i = 0; i<=500; i++)
            for(int j = 0; j<=500; j++)
                re = arr[i][j]>0?re+1:re;
        System.out.print(re);
    }

}