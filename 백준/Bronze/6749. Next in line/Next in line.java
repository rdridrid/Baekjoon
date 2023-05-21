import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int three = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int inter = two-three;
        System.out.println(two+inter);
    }
}