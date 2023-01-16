import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p, s, min;
        min = p = s = 200000000;
        int[] nm = new int[2];
        for(int i = 0; i<2; i++)
            nm[i] = Integer.parseInt(st.nextToken());
        while(nm[1]-->0){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] ab = new int[2];
            for(int i = 0; i<2; i++)
                ab[i] = Integer.parseInt(st2.nextToken());
            p = p>ab[0]?ab[0]:p;
            s = s>ab[1]?ab[1]:s;
        }
        for(int i = 0; i<=nm[0]; i++)
            for(int j = 0; j<=nm[0]; j++)
                if(6*i+j >= nm[0] && p*i+s*j<min)
                    min = p*i+s*j;
        System.out.print(min);
    }

}