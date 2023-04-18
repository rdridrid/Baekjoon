import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE; //0은 불가능. 초기값이 0으로 주어질 수도 있기 때문이다.
        // -로 먼저 나누고 +로 나눔. 초기에 생각했던 -와 -사이 간 숫자를 전부 더하고 빼면된다.
        StringTokenizer st= new StringTokenizer(br.readLine(),"-");

        while(st.hasMoreTokens()){
            int temp = 0;

            StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");

            while(st2.hasMoreTokens()){
                temp += Integer.parseInt(st2.nextToken());
            }
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            } else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}