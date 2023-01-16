import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int re = 0, n = Integer.parseInt(br.readLine());
        int i = 0, cnt = 0, m = Integer.parseInt(br.readLine());
        String s1 = br.readLine();

        while(i<m-2){
            if("IOI".equals(s1.substring(i, i+3))){
                cnt++;
                if(cnt==n){
                    cnt = n-1;
                    re++;
                }
                i+=2;
            }
            else{
                cnt = 0;
                i++;
            }
        }
        System.out.print(re);
    }

}