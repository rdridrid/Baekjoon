import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //메모
        //N의 범위가 1~500까지. int 형과 long은 500!을 담기에 너무 큰 숫자형이다. bigInteger는 가능.
        //2*5마다 자릿수가 하나씩 증가. 5보다 2가 먼저 나옴. 5는 5, 10, 15순이므로 5로 소인수 분해하면 0의 개수 구할수있음.
        int count = 0;
        while(N >=5){
            count += N/5;
            N/=5;
        }
        System.out.println(count);
    }
}