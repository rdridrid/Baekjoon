import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        int number = 0;//숫자
        int temp = 0; //나머지가 0인, 나누어 떨어지는 수의 개수
        int num = 0;//개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<iter;i++){
            temp = 0;
            number = Integer.parseInt(st.nextToken());
            for(int j=1;j<=number;j++){
                if(number%j==0){
                    temp++;
                }
            }
            if(temp==2){
                num++;
            }
        }
        System.out.println(num);
    }
}