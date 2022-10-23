import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        while(true){
            s = br.readLine();
            if(s==null)
                break;
            int a = 0, b = 0, c = 0, d = 0;
            for(int i = s.length()-1; i>=0; i--){
                char e = s.charAt(i);
                if(e>96)
                    a++;
                else if(e>64)
                    b++;
                else if(e==' ')
                    d++;
                else
                    c++;
            }
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }

}