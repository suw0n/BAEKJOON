public class Main {

    public static void main(String[] args) {

        for(int i = 2; i<101; i++)
            for(int j = 2; j<101; j++)
                for(int k = j+1; k<101; k++)
                    for(int l = k+1; l<101; l++)
                        if(i*i*i==j*j*j+k*k*k+l*l*l)
                            System.out.println("Cube = " + i + ", Triple = (" + j + "," + k + "," + l + ")");
    }

}