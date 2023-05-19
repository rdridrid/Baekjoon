import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int P  = (N*5)-400;
        if(P == 100){
            System.out.println(P);
            System.out.println("0");
        }
        else if(P>100){
            System.out.println(P);
            System.out.println("-1");
        }
        else{
            System.out.println(P);
            System.out.println("1");
        }
    }
}