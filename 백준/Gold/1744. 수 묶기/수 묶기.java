import java.io.*;
import java.util.*;
public class Main{
    //우선순위 큐 사용.
    //해당 문제는 가장 작은 값끼리 합쳐서 올라가는 방식. 허프만 코드?
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int oneCount = 0;
        int zeroCount = 0;
        PriorityQueue<Long> priorityQueueLowest = new PriorityQueue<>();
        PriorityQueue<Long> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
        // 0의 개수와 1의 개수, 음수와 양수마다 따르게 저장.
        for(int i=0;i<N;i++){
           long number = Long.parseLong(br.readLine());
           if(number>1){
               priorityQueueHighest.add(number);
           }else if(number<0){
               priorityQueueLowest.add(number);
           } else if(number == 1){
               oneCount++;
           } else {
               zeroCount++;
           }
            //이진트리와 같이 정렬
        }
        int sum = 0;
        while(priorityQueueHighest.size()>1){
            long a =priorityQueueHighest.remove();
            long b = priorityQueueHighest.remove();
            sum += a*b;
        }
        if(!priorityQueueHighest.isEmpty()){
            sum+= priorityQueueHighest.remove();
        }
        while(priorityQueueLowest.size()>1){
            long a = priorityQueueLowest.remove();
            long b = priorityQueueLowest.remove();
            sum += a*b;
        }
        if(!priorityQueueLowest.isEmpty()){
            if(zeroCount==0){  //0이 있다면 남은 음수를 0을 곱해 삭제할수있다
                sum += priorityQueueLowest.remove();
            }
        }
        sum += oneCount;
        System.out.println(sum);
    }
}