import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int distance_x = 0;
        int distance_y = 0;
        if(x<=w/2){ //x가 중앙 또는 왼쪽에, w=3, x=1일 경우 x<1는 false
            distance_x = x;
        }
        else{
            distance_x = w-x;
        }
        if(y<=h/2){ //y가 중앙 또는 위쪽에
            distance_y = y;
        }
        else{
            distance_y = h-y;
        }
        if(distance_x>distance_y){
            System.out.println(distance_y);
        }
        else{
            System.out.println(distance_x);
        }
    }
}