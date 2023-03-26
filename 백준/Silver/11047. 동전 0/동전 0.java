import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//그리디 알고리즘 각 경우에서 최선의 수를 찾아나가는 방식
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        int count = 0; //동전개수
        for(int i=0;i<N;i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        for(int i=N-1;i>=0;i--) { //for문 범위를 0을 안넣어서 틀렸음
            if (coins[i] <= K){
                int temp = K / coins[i];
                K = K%coins[i];
                count += temp;
                if(K==0)
                    break;
            }
        }
        System.out.println(count);
    }
}