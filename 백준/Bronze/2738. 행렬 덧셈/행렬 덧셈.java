import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());//st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=0;i<N;i++){//row
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){//column
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int k=0;k<N;k++){//row
            st = new StringTokenizer(br.readLine());
            for(int m=0;m<M;m++){//column
                arr[k][m] += Integer.parseInt(st.nextToken());
            }
        }
        for(int a=0;a<N;a++){
            for(int b=0;b<M;b++){
                System.out.print(arr[a][b]+" ");
            }
            System.out.print("\n");
        }
    }
}