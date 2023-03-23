import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer  st;
        String cmd;
        int number;
        Queue queue = new Queue(N);
        int temp;
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            if(cmd.equals("push")){
                number = Integer.parseInt(st.nextToken());
                queue.push(number);
            }
            else if(cmd.equals("pop")){
                temp = queue.pop();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("size")){
                temp = queue.size();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("empty")){
                temp = queue.isEmpty();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("front")){
                temp = queue.front();
                sbr.append(temp+"\n");
            }
            else{ //back
                temp = queue.back();
                sbr.append(temp+"\n");
            }
        }
        System.out.println(sbr.toString().trim());
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