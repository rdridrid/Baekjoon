import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//투 포인터
//연속된 자연수의 합을 두개의 인덱스 포인터로 게산한다.
//start, end라는 두개의 포인터를 이동하면서, start가 +1이 될경우 범위의 합이 작아지고, end가 +1이 될경우 범위의 합이 커진다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1; //N역시 하나의 정수로 N을 표현하는 자연수. 한가지는 반드시 존재한다.
        int start = 1;
        int end = 1;
        int sum = 1; //연속된 자연수들의 합중 가장 작은 수는 1
        while(end!=N){
            if(sum==N){ //연속된 자연수들의 합 일 경우
                count++;
                end++;
                sum+=end;
            }
            else if(sum<N){//합보다 N이 클 경우 범위를 더 늘려야함. end가 +1이 됨.
                end++;
                sum+=end;
            }
            else{ //sum>N , 합이 N보다 큰 경우 범위를 좁혀야함. start를 +1해서 범위를 줄인다.
                sum-=start;
                start++;
            }
        }
        System.out.println(count);
    }
}