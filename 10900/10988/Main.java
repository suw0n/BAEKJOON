import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int re = 1;
        String s = br.readLine();
        for(int i = 0, j = s.length()-1; i<s.length()/2; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                re = 0;
                break;
            }
        }
        System.out.println(re);
    }

}