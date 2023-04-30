import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[4];
        for(int i=0;i<4;i++){
            arr[i] = st.nextToken();
            if(arr[i].equals("0"))
                arr[i] = "";
        }
        String A = arr[0]+arr[1];
        String B = arr[2]+arr[3];
        long a = Long.parseLong(A);
        long b = Long.parseLong(B);
        System.out.println(a+b);
    }
}