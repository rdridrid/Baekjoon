import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(factorial(number));
    }
    public static int factorial(int n){
        if(n==0){ // 0! = 1
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            int sum = n*factorial(n-1);
            return sum;
        }

    }
}