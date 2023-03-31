import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue queue = new Queue(300);
        int flag = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            count = 0;
            queue.init();
            st = new StringTokenizer(br.readLine());
            int NumberOfDOc = Integer.parseInt(st.nextToken());
            int targetDoc = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            flag = 0;
            for (int j = 0; j < NumberOfDOc; j++) {
                int priority = Integer.parseInt(st.nextToken());
                int isTarget = 0;
                if (j == targetDoc)
                    isTarget = 1;
                queue.push(priority, isTarget);
                //자료 입력 끝
            }
            while(queue.size()>0){
                int[] temp = queue.pop();
                for (int k = 0; k < queue.size(); k++) {
                    int[] temp2 = queue.get(k);
                    flag = 0;
                    if (temp2[0] > temp[0]) {
                        queue.push(temp[0], temp[1]);
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    count++;
                    if (temp[1] == 1) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}
class Queue{ //원형 큐
    int front;
    int rear;
    int[][] queue;
    int capacity;
    public Queue(int n){
        front = 0;
        rear = 0;
        queue = new int[n+1][2];
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
    public void init(){
        front = 0;
        rear = 0;
        queue = new int[capacity][2];
    }
    public void push(int a,int b){ //b = 탐색해야할 수인지
        rear++;
        rear = rear%capacity;
        queue[rear][0] = a; //우선순위
        queue[rear][1] = b; //b는 0또는 1이다.
    }
    public int[] pop(){
        if(isEmpty()==1){
            return new int[]{-1};
        }
        else{
            front++;
            front = front%capacity;
            return queue[front];
        }
    }
    public int[] get(int n){ //큐의 순서도 0부터, 문제특성상 큐의 입력값을 넘는 입력은 주어지지않는다고 가정
        int temp = (front+1+n)%capacity;
        return queue[temp];
    }
    public int size(){
        return rear>=front?(rear-front)%capacity:(front-rear)%capacity;
    }
}