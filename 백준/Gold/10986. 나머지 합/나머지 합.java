import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.util.StringTokenizer;

public class Main {
    //구간 합
    //일차원 배열 A에 대해서, 1~j까지의 합 배열인 S를 구한다.
    //i~j구간에 대해서 M 나누어 떨어지는 경우는
    //i~j까지의 합 = S[j] - S[i-1] 이므로 S[j]%M = S[i-1]%M 인 경우에 M으로 나누어 떨어진다고 할 수 있다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long count = 0; //쌍의 개수
        long[] arrS = new long[N]; //범위초과로 long으로 선언해야한다.
        long[] remain = new long[M];
        arrS[0] = Long.parseLong(st.nextToken());
        for(int i=1;i<N;i++){
            arrS[i] = arrS[i-1]+Long.parseLong(st.nextToken());
        }
        for(int i=0;i<N;i++){
            long temp = (arrS[i]%M);
            if(temp==0){
                count++;
            }
            remain[(int)temp]++;
        }

        //같은 나머지를 가진 쌍 중 중복되지않게 두가지를 뽑는 경우의 수를 구한다. M으로 나누어 떨어지는 것들끼리도 합쳐도 똑같이 나누어 떨어진다.
        for(int i=0;i<M;i++){
            if(remain[i]>1){
                count += (remain[i]*(remain[i]-1)/2);
            }
        }
        System.out.println(count);
    }
}