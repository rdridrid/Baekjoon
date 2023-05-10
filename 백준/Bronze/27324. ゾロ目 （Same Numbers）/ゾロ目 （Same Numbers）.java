import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        if(A%10==A/10){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
        
    }
}