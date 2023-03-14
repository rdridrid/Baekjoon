import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//슬라이딩 윈도우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //1부터 N까지
        Queue queue = new Queue(N);
        for(int i=1;i<=N;i++){
            queue.enqueue(i);
        }
        while(true){
            if(queue.size()==1){
                break;
            }
            queue.dequeue();
            int second = queue.peek();
            queue.dequeue();
            queue.enqueue(second);
        }
        System.out.println(queue.peek());
    }
}
class Queue{ //원형 큐 구현
    int front; //시작부분 실제 데이터는 front+1부터 시작
    int rear; //큐의 끝
    int[] arr;
    int capacity; //큐의 인덱스 에러릅 방지 하기 위해 사용함.
    int count;
    Queue(int n){
        front = 0;
        rear = 0;
        arr = new int[n+1]; //n+1사이즈의 큐 //배열의 한부분은 비어있어야 큐의 empty와 full을 판단할 수 있다.
        capacity = n+1;
        count=0;
    }
    public void init(){
        front = 0;
        rear = 0;
        count = 0;
    }
    public void enqueue(int n){
        if(!this.isFull()){
           rear++;
           rear%=capacity;
           arr[rear] = n;
           count++;
        }
        else{
            System.out.println("It is full");
        }
    }
    public void dequeue(){
        if(!this.isEmpty()){
            front++;
            front%=capacity;
            count--;
        }
    }
    public int peek(){
        if(!this.isEmpty()){
            return arr[(front+1)%capacity];
        }
        else{
            System.out.println("it is empty");
            return -1;
        }
    }
    public boolean isEmpty(){
        if(front%capacity==rear%capacity){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(front%capacity==(rear+1)%capacity){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return count;
    }
}