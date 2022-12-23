import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        for(int i = 1, j = 2; i<1001; i+=j, j++)
            list.add(i);
        int t = Integer.parseInt(br.readLine()), m = list.size();
        while(t-->0){
            int n = Integer.parseInt(br.readLine()), re = 0;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<m; j++){
                    for(int k = 0; k<m; k++){
                        if(list.get(i)+list.get(j)+list.get(k)==n){
                            re = 1;
                            i = j = k = m;
                        }
                    }
                }
            }
            System.out.println(re);
        }
    }

}