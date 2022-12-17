import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long sum = 0, max = 0;
        long[] a1 = new long[n+10];
        long[] a2 = new long[3];
        while(q-->0){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i = 0; i<3; i++)
                a2[i] = Long.parseLong(st2.nextToken());
            if(a2[0]==1){
                int m = (int)a2[2];
                a1[m]+=a2[1];
                if(m<n+1){
                    max = a1[m]>max?a1[m]:max;
                    sum+=a2[1];
                }
            }
            else{
                long a = a1[n+1]+a2[1];
                sb.append((a>max&&(a-1)*n>=sum+a2[2]?"YES":"NO") + "\n");
            }
        }
        System.out.print(sb);
    }

}