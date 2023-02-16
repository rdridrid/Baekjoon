import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        Set set = new HashSet();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<iter;i++){
            set.add(st.nextToken());
        }
        iter = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<iter;i++){
            if(set.contains(st.nextToken())==true){ //Integer, Int 비교가 아닌 String, String비교
                sbr.append(1+" ");
            }
            else{
                sbr.append(0+" ");
            }
        }
        System.out.println(sbr.toString().trim());
    }
}
