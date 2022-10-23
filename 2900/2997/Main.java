import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for(int i = 0; i<3; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int a = arr[1]-arr[0];
        int b = arr[2]-arr[1];
        System.out.println(a<b?arr[1]+a:a==b?arr[2]+a:arr[0]+b);
    }

}