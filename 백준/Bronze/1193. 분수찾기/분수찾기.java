import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 0;
        while(true){
            if(sum>=N){
                break;
            }
            i++;
            sum += i;
        }
        sum -= i;
        N -= sum;//해당 대각선에서의 순서
        if(i%2==0){// 1/2->2/1
            int temp = i-N+1;
            System.out.println(N+"/"+temp);
        }
        else{// 1/3->2/2->3/1->
            int temp = i-N+1;
            System.out.println(temp+"/"+N);
        }
    }
}