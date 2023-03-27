import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    //원형 큐 이용. 연결리스트로도 해결할 수 있을 것 같지만. 큐가 더 간단해 보였다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue queue = new Queue(N+1);
        StringBuilder sbr = new StringBuilder();
        sbr.append("<");
        for(int i=1;i<=N;i++){
            queue.push(i);
        }
        while(queue.size()>1){
            for(int i=1;i<K;i++){ //K번째 순서가 올때까지 순서를 계속 바꾼다.
                //남아있는 큐의 데이터<K일 경우 K%size로 시간을 더 줄여볼 수 있을 것 같다.
                int temp = queue.pop();
                queue.push(temp);
            }
            sbr.append(queue.pop()+", ");
        }
        sbr.append(queue.pop()+">");
        System.out.println(sbr);
    }
}
class Queue{ //원형 큐
    int front;
    int rear;
    int[] queue;
    int capacity;
    public Queue(int n){
        front = 0;
        rear = 0;
        queue = new int[n+1];
        capacity = n+1;
    }
    public int isEmpty(){
        if(front==rear){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void push(int a){
        rear++;
        rear = rear%capacity;
        queue[rear] = a;
    }
    public int pop(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            front++;
            front = front%capacity;
            return queue[front];
        }
    }
    public int size(){
        return rear>=front?(rear-front)%capacity:(front-rear)%capacity;
    }
    public int front(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            return queue[(front+1)%capacity];
        }
    }
    public int back(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            return queue[rear];
        }
    }
}