import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        int[][] arr = new int[iter][2];
        for(int i=0;i<iter;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());//x좌표
            arr[i][1] = Integer.parseInt(st.nextToken());//y좌표
        }
        Arrays.sort(arr,(e1,e2) -> { //람다식 이용
            if(e1[1]==e2[1]){
               return e1[0]-e2[0];
            }
            else{
                return e1[1]-e2[1];
            }
        });
        for(int i=0;i<iter;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}