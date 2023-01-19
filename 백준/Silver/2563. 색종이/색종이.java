import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x = 0;
        int y = 0;
        int size = 0;
        int[][] arr = new int[101][101];//도화지
        for(int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int j = 0;j<10;j++){
                for(int k=0;k<10;k++){
                    arr[x+j][100-(y+k)]=1;
                }
            }
        }
        for(int l=0;l<101;l++){
            for(int q=0;q<101;q++){
                if(arr[l][q]==1){
                    size++;
                }
            }
        }
        System.out.println(size);
    }
}