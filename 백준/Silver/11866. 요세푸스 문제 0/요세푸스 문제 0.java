import java.io.*;
import java.util.*;
public class Main{
    //배열 시간복잡도 n*n이용
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        StringBuilder sbr = new StringBuilder();
        sbr.append("<");
        int m;
        int pos = 0;
        for(int p=0;p<N-1;p++){
            m=0;
            while(K-1>m) {
                pos%=N;
                if (arr[pos] == 0) {
                    m++;
                    pos++;
                }
                else{
                    pos++;
                }
            }
            while(arr[pos%N]!=0){
                pos++;
                pos%=N;
            }
                sbr.append(pos%N+1+", ");
                pos%=N;
                arr[pos] = 1;
                pos++;
        }
        for(int j=0;j<N;j++){
            if(arr[j]==0){
                sbr.append(j+1+">");
            }
        }
        System.out.println(sbr.toString().trim());
    }
}