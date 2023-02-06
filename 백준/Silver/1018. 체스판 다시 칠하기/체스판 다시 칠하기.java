import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        char[][] blackBoard = new char[8][8];//왼쪽 대각선이 검은색인경우
        char[][] whiteBoard = new char[8][8];//왼쪽 대각선이 흰색인경우
        char[][] inputBoard = new char[row][col]; //입력받은 체스판
        //각각 바꿔야 할 수
        int blackChange = 0;
        int whiteChange = 0;
        int minChange = 64; //체스판을 64번이나 다시 칠하는 경우는 없음. 하나의 기준을 잡으면 반드시 64번보단 적게 칠한다.
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i+j)%2==0){
                    blackBoard[i][j] = 'B';
                    whiteBoard[i][j] = 'W';
                }
                else{
                    blackBoard[i][j] = 'W';
                    whiteBoard[i][j] = 'B';
                }
            }
        }
        //비교할 체스판 두 개
        for(int i=0;i<row;i++){
            String line = br.readLine();//한줄 입력받음
            for(int j=0;j<col;j++){
                inputBoard[i][j] = line.charAt(j);
            }
        }
        //경우의 수, 비교
        for(int i=0;i<=row-8;i++){//최소 8칸을 비교해야한다.
            for(int j=0;j<=col-8;j++){
                //기준점이 이동할 때마다 초기화한다.
                blackChange = 0;
                whiteChange = 0;
                //실제 비교 부분
                for(int k=0;k<8;k++){
                    for(int l=0;l<8;l++){
                        if(blackBoard[k][l]!=inputBoard[i+k][j+l]){
                            blackChange++;
                        }
                        if(whiteBoard[k][l]!=inputBoard[i+k][j+l]){
                            whiteChange++;
                        }
                    }
                }

                if(minChange>whiteChange){
                    minChange=whiteChange;
                }
                if(minChange>blackChange){
                    minChange=blackChange;
                }
            }
        }
        System.out.println(minChange);
    }
}