import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=2;i<=N;i++){
            if(N==1){
                break;
            }
            if(N%i==0){
                System.out.println(i);
                N = N/i;
                i=1;
            }
        }
    }
}