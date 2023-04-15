//이번엔 그냥 스택을 구현하지 않고 내장된 스택 사용.
//처음에 문자열 입력이 여러줄로 제공되는줄 알았다.
import java.io.*;
import java.util.*;
public class Main{
    //우선순위 큐 사용.
    //해당 문제는 가장 작은 값끼리 합쳐서 올라가는 방식. 허프만 코드?
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        //기본이 작은 것이 가장 먼저 정렬
        //반대로 하고 싶다면 (Collections.reverseOrder()) 사용
        for(int i=0;i<N;i++){
            priorityQueueLowest.add(Integer.parseInt(br.readLine()));
            //이진트리와 같이 정렬
        }
        int sum = 0; //비교횟수 더함
        while(priorityQueueLowest.size()>1){
            int a =priorityQueueLowest.remove();
            int b = priorityQueueLowest.remove();
            sum += a+b;
            priorityQueueLowest.add(a+b);
        }
        System.out.println(sum);
    }
}