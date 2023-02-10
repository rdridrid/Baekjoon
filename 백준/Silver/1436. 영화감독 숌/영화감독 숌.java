import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 665;
        String temp = "";
        while(count != N){
            number++; //666부터 시작
            temp = String.valueOf(number); //각 숫자를 문자열로 자리수마다 비교
            for(int i=0;i<temp.length()-2;i++) {
                if (temp.charAt(i) == '6' && temp.charAt(i + 1) == '6' && temp.charAt(i + 2) == '6') {
                    count++;
                    break;
                }
            }
        }
        System.out.println(number);
    }
}