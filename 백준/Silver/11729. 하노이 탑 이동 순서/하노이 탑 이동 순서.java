import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sbr = new StringBuilder();
    public static int iter = 0; //함수 호출 횟수
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        Hanoi(N,1,3,2);
        System.out.println(iter);
        System.out.println(sbr.toString().trim());
    }
    public static void Hanoi(int num, int start, int to, int term){
        //num : 원판 개수이자 옮기고자 하는 원판의 크기 순서? (크기 x)
        //start : 시작 위치, to : 최종으로 옮길 위치, term : 임시로 옮겨놓을 위치
        if(num == 1){ //옮길 원판이 1개, 옮길 원판의 크기가 남은 원판 중 가장 작을 경우
            sbr.append(start+" "+to+"\n"); //그대로 최종 위치에 옮김
            iter++;
        }
        else{ //1이 아닐경우 해당 원판보다 최소 1개이상의 원판이 위에 있음
            Hanoi(num-1,start,term,to); //작은 원판들을 전부 최종 위치 to 가 아닌 임시 위치 term 에 전부 옮겨놓음. start -> term
            sbr.append(start+" "+to+"\n"); //그 후 해당 원판을 이동
            iter++;
            Hanoi(num-1,term,to,start); // 그 후에 임시 위치 term 에 있던 원판들을 전부 최종위치 to 에 옮겨놓는다. term -> to
        }
    }
}