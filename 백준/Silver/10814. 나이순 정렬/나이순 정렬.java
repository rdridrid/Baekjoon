import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  iter = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[][] human = new String[iter][2]; // [iter][0] = 나이, [iter][1] = 이름
        for(int i=0;i<iter;i++){
            st = new StringTokenizer(br.readLine());
            human[i][0] = st.nextToken();
            human[i][1] = st.nextToken();
        }
        Arrays.sort(human,(e1,e2)->{
            if(e1[0]==e2[0]){
                return 1; //나이가 같은 경우 변경x
            }
            else{
                return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);
            }
        });
        for(int i=0;i<iter;i++){
            System.out.println(human[i][0]+" "+human[i][1]);
        }
    }
}