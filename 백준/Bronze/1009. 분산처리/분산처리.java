import java.io.*;
import java.util.*;
public class Main{
    //17219번
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = 1; //초기화
            for(int j=0;j<b;j++){
                result = (a*result)%10;
            }
            if(result == 0){
                System.out.println(10);
            }else{
                System.out.println(result);
            }
        }
    }
}