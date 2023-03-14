import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//투 포인터
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int num = 0;
        int count=0;
        for(int k=0;k<N;k++){
            arr[k] = Integer.parseInt(st.nextToken());
        }
        //입력 값 정렬
        Arrays.sort(arr);
        for(int k=0;k<N;k++){
            num = arr[k];
            int i = 0;
            int j = N-1;
            while(i<j){
                if(arr[i]+arr[j]==num){
                    if(i!=k&&j!=k){ //입력값은 정수 이므로 0과 자기자신을 더해 두 수의 합으로 볼 수도 있다.
                        count++; //0+자기자신인 경우를 제외하기 위함.
                        break;
                    }
                    else if(i==k){
                        i++;
                    }
                    else if (j==k){
                        j--;
                    }
                }
                else if(arr[i]+arr[j]<num){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(count);
        //이분탐색법으로 나중에 풀기
    }
}