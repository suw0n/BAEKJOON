import java.util.*;
import java.io.*;

public class Main {

    static int max = 0;
    static long re = 0;
    static Map<Long, Integer> map = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            Long a = Long.parseLong(br.readLine());
            if(map.containsKey(a)){
                int b = map.get(a)+1;
                map.replace(a, b);
                if(max<b){
                    max = b;
                    re = a;
                }
                else if(max==b)
                    re = re<a?re:a;
            }
            else{
                map.put(a, 1);
                if(max==0){
                    max = 1;
                    re = a;
                }
                if(max==1)
                    re = re<a?re:a;
            }
        }
        System.out.print(re);
    }

}