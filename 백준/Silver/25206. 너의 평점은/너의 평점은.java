import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String title;
        Double score;
        String Grade;
        Double score_sum=0.0; //수강학점 총계
        Double Grade_sum=0.0; //수강평점 총계
        HashMap<String, Double> hash = new HashMap();
        hash.put("A+",4.5);
        hash.put("A0",4.0);
        hash.put("B+",3.5);
        hash.put("B0",3.0);
        hash.put("C+",2.5);
        hash.put("C0",2.0);
        hash.put("D+",1.5);
        hash.put("D0",1.0);
        hash.put("F",0.0);
        for(int i=0;i<20;i++){
            st = new StringTokenizer(br.readLine());
            title = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            Grade = st.nextToken();
            if(Grade.equals("P")){
                continue;
            }
            score_sum+=score;
            Grade_sum+=score*hash.get(Grade);
        }
        System.out.println(Grade_sum/score_sum);
    }
}