import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i=1;
        int temp = 1;
        int dividedSum = 0;//분해합
        while(true){
            temp = i;
            dividedSum = temp;
            while(temp>0){
                dividedSum+=temp%10;
                temp/=10;
            }
            if(dividedSum==num){
                System.out.println(i);
                break;
            }
            if(i>=num){
                System.out.println(0);
                break;
            }
            i++;
        }
    }
}