import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int temp = 1; //자리수
        int correct = 0;
        for(int i=N.length()-1;i>=0;i--){ //일의 자리 수부터
            char alpha = N.charAt(i);
            if('A'<=alpha&&alpha<='Z'){ //B진법 알파벳 인 경우
                correct += (alpha - 'A'+10)*temp;
            } else{
                correct += (alpha - '0')*temp;
            }
            temp *= B;
        }
        System.out.println(correct);
    }
}