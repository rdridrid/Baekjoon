import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int n = 0;
        final int size = 246912;
        int [] arr = new int[size+1];
        for(int i=0;i<=size;i++){
            arr[i] = 0;
        }
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=size;i++){
            if(arr[i]==1){
                continue;
            }
            for(int j=i*2;j<=size;j+=i){
                arr[j] = 1;
            }
        }
        //에라토스테네스의 체를 이용하여 인덱스가 소수인 배열의 원소값을 1로 변경함.
        while(true){
            num = 0;
            n = Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            for(int k=n+1;k<=2*n;k++){
                if(arr[k] == 0){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}