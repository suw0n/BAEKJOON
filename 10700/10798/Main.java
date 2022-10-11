import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = new String[5];
        for(int i = 0; i<5; i++)
            s[i] = sc.next();
        for(int i = 0; i<15; i++)
            for(int j = 0; j<5; j++)
                if(s[j].length() > i)
                    System.out.print(s[j].charAt(i));
    }

}