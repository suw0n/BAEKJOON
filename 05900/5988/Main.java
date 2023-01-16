import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            s = br.readLine();
            System.out.println((s.charAt(s.length()-1)-'0')%2==0?"even":"odd");
        }
    }

}