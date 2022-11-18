import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        int re = 0, n = s1.length(), m = s2.length();
        for(int i = 0; i<=n-m;){
            String s = s1.substring(i, i+m);
            if(s2.equals(s)){
                re++;
                i+=m;
            }
            else
                i++;
        }
        System.out.print(re);
    }

}