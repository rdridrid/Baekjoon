import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[8][2]; //0:분+초+밀리초 1: 팀
        StringTokenizer st;
        int blueScore = 0;
        int redScore = 0;
        for(int i=0;i<8;i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            String team = st.nextToken();
            arr[i][0] = temp;
            arr[i][1] = team;
        }
        Arrays.sort(arr, (e1,e2)->{
            return e1[0].compareTo(e2[0]);
        });
        for(int i=0;i<8;i++){
            int score=0;
            switch(i)
            {
                case 0:
                    score = 10;break;
                case 1:
                    score = 8; break;
                case 2:
                    score = 6; break;
                case 3:
                    score = 5; break;
                case 4:
                    score = 4; break;
                case 5:
                    score = 3; break;
                case 6:
                    score = 2; break;
                case 7:
                    score = 1;break;
            }
            if(arr[i][1].equals("B")){
                blueScore+=score;
            }
            else{
                redScore+=score;
            }
        }
        if(redScore>blueScore){
            System.out.println("Red");
        }
        else{
            System.out.println("Blue");
        }
    }
}