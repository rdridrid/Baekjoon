import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //구간 합
    //정수 배열 N에 대해서 각 인덱스까지의 구간 합 배열 S를 미리 구한다면 수행시간을 줄일 수 있다.
    //S[2] = N[0]+N[1]+N[2]
    //구간 N에 대해 3~5구간을 구하고 싶을 경우, 구간 합 S[5]-S[2]를 이용할 수 있다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sbr = new StringBuilder();
        int[] nArr = new int[N+1]; //첫번째 수부터 시작하기 때문에 0인덱스 제외
        int[] S = new int[N+1];
        st = new StringTokenizer(br.readLine());
        int sNum = 0; // S에 저장할 구간합
        for(int i=1;i<=N;i++){
            nArr[i] = Integer.parseInt(st.nextToken());
            sNum += nArr[i]; //구간 N의 i인덱스까지의 합을 더함
            S[i] = sNum;
        }
        for(int k=0;k<M;k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sbr.append(S[j]-S[i-1]+"\n"); //2 5일 경우 2 3 4 5
        }
        System.out.println(sbr.toString().trim());
    }
}