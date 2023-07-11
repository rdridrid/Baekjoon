import java.io.*;
import java.util.*;
public class Main{
    static int [][] result = new int[30][30];
    public static void main(String args[]) throws IOException{
        //동적계획법 사용.
        //1010번 다리 놓기. 조합 이용, 재귀함수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbr = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sbr.append(fun(M,N)).append('\n');
        }
        System.out.println(sbr);
    }
    static int fun(int n, int r){ //재귀함수 조합
        if(result[n][r]>0){
            return result[n][r];
        }
        if(n==r||r==0){
            return result[n][r] = 1;
        }
        return result[n][r] = fun(n-1,r-1)+fun(n-1,r);
    }
}