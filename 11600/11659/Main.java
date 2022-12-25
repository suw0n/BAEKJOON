import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int[] nm = new int[2];
        for(int i = 0; i<2; i++)
            nm[i] = Integer.parseInt(st.nextToken());
        int[] arr  = new int[nm[0]+1];
        for(int i = 1; i<=nm[0]; i++)
            arr[i] = Integer.parseInt(st2.nextToken())+arr[i-1];
        while(nm[1]-->0){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int[] ij = new int[2];
            for(int i = 0; i<2; i++)
                ij[i] = Integer.parseInt(st3.nextToken());
            System.out.println(arr[ij[1]]-arr[ij[0]-1]);
        }
    }

}