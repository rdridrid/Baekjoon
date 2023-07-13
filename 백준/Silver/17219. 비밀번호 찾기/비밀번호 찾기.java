import java.io.*;
import java.util.*;
public class Main{
    //17219번
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            map.put(st.nextToken(),st.nextToken());

        }
        for(int i=0;i<M;i++){
            String site = br.readLine();
            System.out.println(map.get(site));
        }
    }

}