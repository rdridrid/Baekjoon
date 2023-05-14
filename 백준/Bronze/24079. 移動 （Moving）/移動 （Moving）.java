import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int Z = Integer.parseInt(br.readLine());
        int flag = 0;
        if(X+Y<=Z){
            flag = 1;
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }
    }
}