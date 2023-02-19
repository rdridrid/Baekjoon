import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        StringBuilder sbr = new StringBuilder(); //출력
        String [] inputArr = new String [iter]; //존재하는지 확인할 수
        String[] originalArr = new String[iter];
        Set set = new HashSet();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<iter;i++){
            set.add(st.nextToken());
        }
        iter = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<iter;i++){
            if(set.contains(st.nextToken())==true){
                sbr.append(1+"\n");
            }
            else{
                sbr.append("0"+"\n");
            }
        }
        System.out.println(sbr.toString().trim());
    }
}