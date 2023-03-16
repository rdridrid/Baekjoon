import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//삽입 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //1부터 N까지
        int iter = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }
        for(int k=0;k<iter;k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<N;i++){
            sbr.append(arr[i]+" ");
        }
        System.out.println(sbr.toString().trim());
    }
}