import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int Nsum = 1;
        int Ksum = 1;
        for(int i=N;i>N-K;i--){
            Nsum*=i;
        }
        for(int i=1;i<=K;i++){
            Ksum*=i;
        }
        System.out.println(Nsum/Ksum);
    }
}