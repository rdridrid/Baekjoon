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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Long[] arr = new Long[N];
        long max = -1; //극단적으로 나무 개수 1, 100일때 100을 나누는게 더 갯수가 많아질 거니까
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Long.parseLong(st.nextToken());
            if(max<arr[i])
                max = arr[i];
        }
        long get = 0; //얻은 나무 최대 길이
        long min = 0;
        long mid; //중앙값
        max++; //나눌 때 1일때 0+1 / 2는 0이 되어버림.
        while(min<max){
            get = 0;
            mid = (max+min)/2;
            for(int i=0;i<N;i++){
                if(arr[i]<=mid)
                    continue;
                get+=arr[i]-mid;
            }
            if(get<M) //필요한 나무길이보다 짧은 경우
                max = mid; //전기톱을 더 낮게 내린다.
            else
                min = mid+1;
        }
        System.out.println(min-1);
    }
}
