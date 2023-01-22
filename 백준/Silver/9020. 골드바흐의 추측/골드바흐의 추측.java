import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        final int max_size = 10000;
        int[] arr = new int[max_size+1];
        arr[0] = 1;
        arr[1] = 1;
        //먼저 에라토스테네스의 체를 이용하여 1~10000까지의 자연수 중 소수를 찾아둔다.
        for(int i=2;i<=max_size;i++){
            if(arr[i]==1){
                continue;
            }
            for(int j=i*2;j<=max_size;j+=i){
                arr[j] = 1; //소수가 아닐경우 1 소수일경우 그대로 0
            }
        }
        
        for(int i=0; i<iter;i++){
            int min = max_size; //두 소수의 차이
            int a = 0;
            int b = 0;
            int num = Integer.parseInt(br.readLine()); //짝수 n이 주어졌을 때
            for(int j=2;j<=num/2;j++){//작은 소수부터 출력하기 위해 num/2를 하였다. 10000 = 4999+5001 = 5001+4999이다. 
                if(arr[j]==0&&arr[num-j]==0){//두 소수의 합으로 이루어질 때
                    if(min>num-2*j){ //두 소수의 차이가 가장 작은 경우를 기록
                        a = j;
                        b = num-j;
                    }
                }
            }
            System.out.println(a+" "+b);
        }
    }
}