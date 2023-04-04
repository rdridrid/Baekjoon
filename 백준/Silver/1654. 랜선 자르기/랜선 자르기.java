import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//이분탐색 연습. 이분탐색 응용. 인덱스가 아닌 길이를 탐색값으로
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long max = -1; //극단적으로 랜선 개수 1, 100일때 100을 나누는게 더 갯수가 많아질 거니까
        for(int i=0;i<K;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i])
                max = arr[i];
        }
        long count = 0; //만든 랜선 개수
        long min = 0;
        long mid; //중앙값
        max++; //나눌 때 1일때 0+1 / 2는 0이 되어버림.
        while(min<max){
            count = 0;
            mid = (max+min)/2;
            for(int i=0;i<K;i++){
                count+=(arr[i]/mid);
            }
            if(count<N) //필요한 랜선개수보다 적을 경우에
                max = mid; //더 잘게 자른다.
            else
                min = mid+1; //랜선개수보다 많거나 같은 경우엔 최대랜선길이를 찾아본다.
            //배열을 기준으로 생각할때 mid에서 target을 찾지 못한경웨 mid+1부터 찾는 것
        }
        System.out.println(min-1);
    }
}
