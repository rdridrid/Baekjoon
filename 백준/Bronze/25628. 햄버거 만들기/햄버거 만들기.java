import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bread = Integer.parseInt(st.nextToken());
        int meat = Integer.parseInt(st.nextToken());
        bread /= 2;
        int min = (bread>meat)? meat: bread;
        System.out.println(min);
    }
}