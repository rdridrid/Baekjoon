import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //arr[0] -> 한바퀴 돌릴 링
        for(int i=1;i<N;i++){
            int gcdNumber = gcd(arr[0],arr[i]);
            System.out.println(arr[0]/gcdNumber+"/"+arr[i]/gcdNumber);
        }

    }
    static int gcd(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a%b;
        if(r==0){
            return b;
        }
        else if(b%r==0){
            return r;
        }
        else{
            return gcd(b, r);
        }
    }
}