import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0, b = 0, n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for(int i = n-1; i>=0; i--){
            a = s.charAt(i)=='A'?a+1:a;
            b = s.charAt(i)=='B'?b+1:b;
        }
        System.out.print(a>b?"A":a<b?"B":"Tie");
    }

}