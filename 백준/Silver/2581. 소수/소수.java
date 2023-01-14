import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());//M~N;
        int N = Integer.parseInt(br.readLine());
        int min = N;
        int num = 0;
        int sum = 0;
        int temp = 0;
        for(int i=M;i<=N;i++){
            temp = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){//나누어 떨어질 때 temp값 추가
                    temp++;
                }
            }
            if(temp==2){//1과 자기 자신만 있을 때 소수임
                sum += i;
                if(min>i){
                    min = i;
                }
            }
        }
        if(sum==0){
            sum = -1;
            System.out.println(sum);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}