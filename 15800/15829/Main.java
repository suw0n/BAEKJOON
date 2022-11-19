import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        long m = 1, re = 0;
        for(int i = 0; i<n; i++) {
            re+=(m*(s.charAt(i)-96))%1234567891;
            m=(m*31)%1234567891;
        }
        System.out.print(re%1234567891);
    }

}