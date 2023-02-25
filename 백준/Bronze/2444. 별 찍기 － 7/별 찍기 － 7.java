import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1-i;j++){
                sbr.append(" ");
            }
            for(int k=0;k<1+2*i;k++){
                sbr.append("*");
            }
            sbr.append("\n");
        }
        for(int i=0;i<2*N-1;i++){
            sbr.append("*");
        }
        sbr.append("\n");
        for(int i=0;i<N-1;i++){
            for(int j=0;j<=i;j++){
                sbr.append(" ");
            }
            for(int k=0;k<2*(N-i-1)-1;k++){
                sbr.append("*");
            }
            sbr.append("\n");
        }
        System.out.println(sbr);
    }
}