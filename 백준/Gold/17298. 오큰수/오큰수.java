//이번엔 그냥 스택을 구현하지 않고 내장된 스택 사용.
//처음에 문자열 입력이 여러줄로 제공되는줄 알았다.
import java.io.*;
import java.util.*;
public class Main{
    //스택을 그냥 사용하면 시간 초과.
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<N;i++){
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
                //우선 스택에 값이 존재
                //스택에 push되는 인덱스 경우 본인 왼쪽 arr보다 작음.
                //정해진 수보다 값이 작은 인덱스를 계속 push하다 값이 큰 인덱스를 발견한 경우.
                //연달아서 값을 변경.
                arr[stack.pop()] = arr[i]; //pop()을 한 인덱스는 오큰수가 존재.
            }
            stack.push(i); //작으면 계속 push
        }
        while(!stack.isEmpty()){
            arr[stack.pop()] = -1; //pop되지않은 남은 인덱스는 오큰수가 존재하지 않음.
        }
        for(int i=0;i<N;i++){
            sbr.append(arr[i]+" ");
        }
        System.out.println(sbr.toString().trim());
    }
}