import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mp = 0, max = 0;
        int[] nm = new int[2];
        for(int i = 0; i<2; i++)
            nm[i] = Integer.parseInt(st.nextToken());
        int[] arr = new int[nm[1]];
        for(int i = 0; i<nm[1]; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for(int i = 0; i<nm[1]; i++){
            int sum = nm[1]-i>nm[0]?arr[i]*nm[0]:arr[i]*(nm[1]-i);
            if(sum>max){
                mp = arr[i];
                max = sum;
            }
        }
        System.out.print(mp + " " + max);
    }

}