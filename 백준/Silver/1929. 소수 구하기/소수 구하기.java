import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(); //시간초과, string builder이용, 에라토스테네스의 체 이용
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        for(int i=0;i<=N;i++){
            arr[i] = 0; //맨 처음 2부터 보기 때문에 소수라고 판단함. 0->소수
        }
        arr[0] = 1;//0과 1 소수에서 제외
        arr[1] = 1;
        for(int i=2;i<=N;i++){
            if(arr[i]==1){//1인 경우 이미 소수가 아님. i의 배수로 이루어진 모든 수도 소수가 아니게 됨.
                continue;
            }
            for(int j=i*2;j<=N;j+=i){//j = i*2부터
                arr[j] = 1;//1->자연수 i의 배수이므로 소수가 아니다.
            }
        }
        for(int k=M;k<=N;k++){
            if(arr[k]==0){
                sb.append(k).append('\n');
            }
        }
        System.out.println(sb);
    }
}