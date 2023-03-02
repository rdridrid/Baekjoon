import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //구간 합
    //주어진 이차원 배열 A에 대해서 A(1,1)부터 A(i,j)까지의 각 칸의 수를 합해 S(i,j)로 구간합으로 구성된 이차원 배열을 만든다.
    //S(i,j)를 구할 때 가령 S(2,2)일 경우, S(1,2)+S(1,2)+A(2,2)-S(1,1)로 구할 수 있다.
    //주어진 좌표의 윗 행과, 왼쪽 열까지의 구간합 S1+S2을 더한 후 중복되는 부분을 한번 빼주는 식이다.
    //그런데 이때 배열의 인덱스는 0,0이라 해서 S(0,0)을 구하려고 할 경우에 인덱스가 -1로 범위의 오류가 발생한다.
    //좌표 위치와도 맞게 「 모양의 칸을 한줄 추가한다. 즉 좌표 (x,y)중에서 x,y중 하나라도 0인 경우, 계산을 위해 따로 추가한 칸이다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N+1][N+1]; //0~N까지
        int[][] S = new int[N+1][N+1]; //구간합으로 이루어진 이차원 배열 S
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                S[i][j] = A[i][j]+S[i-1][j]+S[i][j-1]-S[i-1][j-1];
            }
        }
        for(int k=0;k<M;k++){
            //두개의 좌표에서 S(x2,y2)-S(1,y2)-S(x2,1)에서 중복된 부분 S(x1-1,y1-1)을 뺀다
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(S[x2][y2]-S[x1-1][y2]-S[x2][y1-1]+S[x1-1][y1-1]); //구간합 집합 S를 만들던 것처럼.
            // 구하고자하는 블럭 위, 왼쪽 구간합을 전부 빼주면된다.
        }
    }
}