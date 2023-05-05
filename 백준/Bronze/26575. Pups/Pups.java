import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            double dog = Double.parseDouble(st.nextToken());
            double mount = Double.parseDouble(st.nextToken());
            double sale = Double.parseDouble(st.nextToken());
            System.out.println(String.format("$%.2f",dog*mount*sale));
        }
    }
}