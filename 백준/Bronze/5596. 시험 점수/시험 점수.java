import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int S = 0;
        int T = 0;
        for(int i=0;i<4;i++){
            S+=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            T+=Integer.parseInt(st.nextToken());
        }
        if(S>=T)
            System.out.println(S);
        else
            System.out.println(T);
    }
}