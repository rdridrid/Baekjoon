import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Iterator;
//HashMap이용
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hash = new HashMap();
        StringBuilder sbr = new StringBuilder();
        Iterator it;
        for(int i=0;i<N;i++){
            String str = st.nextToken();
            if(hash.get(str)==null){ //해시맵의 key가 카드에 적힌 정수, value가 카드의 숫자이다.
                hash.put(str,1); //기존에 같은정수의 카드가 없다면 1로 값을 시작한다.
            }
            else{ //만약 기존 값이 있다면 value에 +1을 해준다.
                int temp = hash.get(str);
                temp++;
                hash.replace(str,temp);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            String str2 = st.nextToken();
            if(hash.get(str2)!=null){
                sbr.append(hash.get(str2)+" ");
            }
            else{
                sbr.append("0 ");
            }
        }
        System.out.println(sbr.toString().trim());
    }
}