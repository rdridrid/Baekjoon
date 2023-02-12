import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] arr; //개행처리때문에 배열에 받았다가 한번에 처리함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        star(0,0,N,0);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    public static void star(int x, int y, int N, int check){ //x,y는 좌표, N은 전체 크기, check는 해당 칸이 빈칸이 되어야하는지 아닌지 체크
        if(check==1){ //빈칸인 경우에
            for(int i=x;i<x+N;i++){//주어진 크기만큼
                for(int j=y;j<y+N;j++){
                    arr[i][j] = ' ';//빈칸을 대입하고
                }
            }
            return;
        }
        if(N==1){ //N=1, 사각형의 크기가 1임, 위 조건에서 빈칸이 아님을 알 수 있다.
            arr[x][y]='*'; //그래서 *로 대입
            return;
        }
        int size = N/3; //패턴은 전체 크기를 균등하게 9개로 나눈것과 같다. 
        int count = 0;
        for(int i=x;i<x+N;i+=size){ //한 블럭 중에서
            for(int j=y;j<y+N;j+=size){
                count++;
                if(count==5){//5번째 블럭, 정중앙의 블럭은 행으로 가나 열로가나 5번째 이다.
                    star(i,j,size,1);
                }
                else{
                    star(i,j,size,0);
                }
            }
        }
    }
}
