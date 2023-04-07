import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());  //현재 가진 블록
        int[][] arr = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = -1;
        int entire = N*M;
        int sum = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(min>arr[i][j])
                    min = arr[i][j];
                if(max<arr[i][j])
                    max = arr[i][j];
                sum+=arr[i][j];
            }
        }
        int count;
        int answer = 0; //높이 //정답
        int time = Integer.MAX_VALUE;// 시간
        for(int i=min;i<=max;i++){ //시간을 최소화하기 위해선, min~max사이 높이에서 결정된다.
            int remainBlock = B;
            count = 0;
            for(int j=0;j<N;j++){
                for(int k=0;k<M;k++){
                    if(i<arr[j][k]){
                        count+=(arr[j][k]-i)*2; //블록 제거
                        remainBlock += (arr[j][k]-i);
                    } else{
                        count+=(i-arr[j][k]); //블록 추가 , 소요시간 1초
                        remainBlock -= (i-arr[j][k]);
                    }
                }
            }
            if(remainBlock<0)
                break;
            if(time>=count){
                time = count;
                answer = i;
            }
        }
       System.out.println(time+" "+answer);
    }
}
