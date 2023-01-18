import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        StringTokenizer st;
        int[][] arr = new int[9][9];//init
        int x = 0;
        int y = 0;
        int max = arr[0][0];
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(max<arr[i][j]){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        x++;
        y++;
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}