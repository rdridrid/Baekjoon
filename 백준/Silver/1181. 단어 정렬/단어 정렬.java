import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap map = new HashMap(); //hashMap은 순서를 저장하면서 key값의 중복을 허용하지 않는다
        int iter = Integer.parseInt(br.readLine());
        for(int i=0;i<iter;i++){
            map.put(br.readLine(),""); //값의 중복은 허용하기 때문에 key로 중복을 제거한다.

        }
        String[] str = new String[map.size()];
        Iterator it = map.keySet().iterator();
        for(int i=0;i<map.size();i++){
            str[i] = it.next().toString();
        }
        Arrays.sort(str,(e1, e2) -> { //람다식 이용
            if(e1.length()==e2.length()){ //길이가 같은 경우, compareTo이용함.
                return e1.compareTo(e2); //같은 위치의 문자를 아스키값을 기준으로 비교, 길이가 같아 같은 위치에서 비교
            }
            else{
                return e1.length()-e2.length();
            }
        });
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}