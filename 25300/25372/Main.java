import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int m = br.readLine().length();
            System.out.println(m>5&&m<10?"yes":"no");
        }
    }

}