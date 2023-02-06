import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = 1; //최대공약수
        int min = 1; //최소공배수
        for(int i=1;i<=a&&i<=b;i++){ //소수처리도 해줘야함
            if(a%i==0&&b%i==0){
                max = i;
            }
        }
        System.out.println(max);
        int j = 1;
        min = max;
        while(true){
            if(min%a==0&&min%b==0){
                break;
            }
            j++;
            min=max*j;
        }
        System.out.println(min);
    }
}