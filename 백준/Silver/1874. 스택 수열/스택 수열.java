import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//슬라이딩 윈도우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sbr = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int i = 0; //
        while(N>0){
            int temp = Integer.parseInt(br.readLine()); //입력받은 수열에 대하여
            if(temp>i){
                for(int j=i+1;j<=temp;j++){ // 1회 반복 시 1부터 temp 까지
                    stack.push(j);
                    sbr.append("+"+"\n");
                }
                i=temp; // 17번째 줄의 j= i+1 은 즉 다음 반복문에서 temp+1로 시작한다.
            }
            else if(stack.peek()!=temp){
                System.out.println("NO");
                return; //메인메서드도 메서드
            }
            stack.pop();
            sbr.append("-"+"\n");
            N--;
        }
        System.out.println(sbr.toString().trim());
    }
}
