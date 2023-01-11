import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        StringTokenizer st; 
        String temp = "";
        int H = 0;
        int W = 0;
        int N = 0;
        int floor = 0;
        int room = 0;
        for(int i=0;i<iter;i++){
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            floor = N%H;
            if(floor == 0){
                floor = H; //최고층일때 나누기가 0이 되버린다.
            }
            room = N/H;
            if(N%H!=0){
                room++;
            }
           //방형태는 xyy또는 xxyy
            System.out.println(floor*100+room);
        }
        
    }
}