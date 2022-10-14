import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, m = Integer.parseInt(br.readLine());
        boolean[] a = new boolean[20];
        String s;
        StringBuilder sb = new StringBuilder();
        while(m > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            if(s.equals("all")||s.equals("empty")){
                if(s.equals("all"))
                    for(int i = 0; i<20; i++)
                        a[i] = true;
                else
                    for(int i = 0; i<20; i++)
                        a[i] = false;
            }
            else{
                n = Integer.parseInt(st.nextToken());
                if(s.equals("add"))
                    a[n-1] = true;
                else if(s.equals("remove"))
                    a[n-1] = false;
                else if(s.equals("check"))
                    sb.append((a[n-1]==true?1:0) + "\n");
                else
                    a[n-1] = !a[n-1];
            }
            m--;
        }
        System.out.println(sb);

    }

}