import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//투 포인터
//배열을 오름차순으로 정렬 후 양 끝 인덱스에서 조건에 맞는 쌍을 찾는다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //입력 값 정렬
        Arrays.sort(arr);
        int start = 0;
        int end = N-1;
        int count =0;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum==M){
                count++;
                start++;
                end--;
            }
            else if(sum<M){ //두 재료의 합이 M보다 작을 경우.
                start++;
            }
            else{ //두 재료의 합이 M보다 클 경우
                end--;
            }
        }
        System.out.println(count);
    }
}