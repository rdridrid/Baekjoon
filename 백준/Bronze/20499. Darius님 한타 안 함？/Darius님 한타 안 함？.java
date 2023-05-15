import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"/");
        int Kill = Integer.parseInt(st.nextToken());
        int Death = Integer.parseInt(st.nextToken());
        int Assistant = Integer.parseInt(st.nextToken());
        if(Kill+Assistant<Death){
            System.out.println("hasu");
        } else if(Death == 0){
            System.out.println("hasu");
        } else{
            System.out.println("gosu");
        }
    }
}