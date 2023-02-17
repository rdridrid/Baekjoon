import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max, min;
        int[] temp = new int[iter];
        for(int i=0;i<iter;i++){
            temp[i] = Integer.parseInt(st.nextToken());
        }
        max = temp[0];
        min = temp[0];
        for(int i=0;i<iter;i++){
            if(max<temp[i]){
                max = temp[i];
            }
            if(min>temp[i]){
                min = temp[i];
            }
        }
        System.out.println(max*min);

    }
}
