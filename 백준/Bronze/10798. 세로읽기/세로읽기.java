import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//퀵 정렬
public class Main {
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        for(int i=0;i<5;i++){
            arr[i] = br.readLine();
        }
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(arr[j].length()>i){
                    sbr.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sbr);
    }
}