import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine()); //반복횟수
        String[] conflictPosition = new String[iter]; //처음 좌표 입력 순서를 기억할 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String,String>  nonConflictPositionMap = new HashMap<>(); //중복을 제거하기 위해 HashMap사용
        for(int i=0;i<iter;i++){
            conflictPosition[i] = st.nextToken();
            nonConflictPositionMap.put(conflictPosition[i],""); //키는 중복될수 없으므로 중복된 좌표값은 사라진다.
        }
        String[] nonConflictPostion = new String[nonConflictPositionMap.size()]; //중복이 없어진 키를 순서대로 정렬할 배열
        // iterator를 사용해야 Array형태로 key 저장가능
        Iterator it = nonConflictPositionMap.keySet().iterator();
        for(int i=0;i< nonConflictPositionMap.size();i++){
            nonConflictPostion[i] = it.next().toString();
        }
        Arrays.sort(nonConflictPostion,(e1,e2)->{
            if(e1.charAt(0)!='-'&&e2.charAt(0)!='-'){ //둘다 양수인 경우
                if(e1.length()>e2.length()){
                    return 1; //변경 x
                }
                else if(e1.length()<e2.length()){
                    return -1;
                }
                else{
                    return e1.compareTo(e2);
                }
            }
            else if(e1.charAt(0)=='-'&&e2.charAt(0)=='-'){ //둘다 음수인경우
                if(e1.length()>e2.length()){
                    return -1; //변경 x
                }
                else if(e1.length()<e2.length()){
                    return 1;
                }
                else{
                    if(e1.compareTo(e2)>0){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
            }
            else{
                if(e1.charAt(0)=='-'){
                    return -1;
                }
                else{//e2.charAt(0)=='-'
                    return 1;
                }
            }
        });
        for(int i=0;i< nonConflictPositionMap.size();i++){
            nonConflictPositionMap.replace(nonConflictPostion[i],"", String.valueOf(i)); //문자열로 변환
            //Map의 key값으로 들어간 좌표들의 크기순을 key, value로 대입하여 저장함.
        }
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<iter;i++){
            sbr.append(nonConflictPositionMap.get(conflictPosition[i])+" ");
        }
        sbr.trimToSize();
        System.out.println(sbr);
    }
}
