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
        Deck deck = new Deck(N);
        int temp;
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            if(cmd.equals("push_front")){
                number = Integer.parseInt(st.nextToken());
                deck.push_front(number);
            }
            else if(cmd.equals("push_back")){
                number = Integer.parseInt(st.nextToken());
                deck.push_back(number);
            }
            else if(cmd.equals("pop_front")){
                temp = deck.pop_front();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("pop_back")){
                temp = deck.pop_back();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("size")){
                temp = deck.size();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("empty")){
                temp = deck.isEmpty();
                sbr.append(temp+"\n");
            }
            else if(cmd.equals("front")){
                temp = deck.front();
                sbr.append(temp+"\n");
            }
            else{ //back
                temp = deck.back();
                sbr.append(temp+"\n");
            }
        }
        System.out.println(sbr.toString().trim());
    }
}
class Deck { //원형 큐
    int front;
    int rear;
    int[] deck;
    int capacity;
    int size;
    public Deck(int n){
        front = 0;
        rear = 0;
        deck = new int[n+1]; //원형큐를 이용해 덱을 구현할 때 큐가 비었다는 것은 front==rear이다.
        //그러나 전체 배열에 모든 정수가 들어가게 된다면 front==rear가 꽉차있는건지 비어있는건지 알 수 없다.
        capacity = n+1; //인덱스범위를 넘지 않게 하기 위해 나눈다. 0~n까지
        size = 0;
    }
    public int isEmpty(){
        if(size==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void push_front(int a){
        if(size>=capacity-1){
            return;
        }
        deck[front] = a;
        front--;
        front+=capacity;
        front = front%capacity;
        size++;
    }
    public void push_back(int a){
        if(size>=capacity-1){
            return;
        }
        rear++;
        rear = rear%capacity;
        deck[rear] = a;
        size++;
    }
    public int pop_front(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            front++;
            front = front%capacity;
            size--;
            return deck[front];
        }
    }
    public int pop_back(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            int temp = rear;
            rear+=capacity;
            rear--;
            rear = rear%=capacity;
            size--;
            return deck[temp];
        }
    }
    public int size(){ //나중에 collection을 이용해서 다시 풀어볼 예정
        return size;
    }
    public int front(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            return deck[(front+1)%capacity];
        }
    }
    public int back(){
        if(isEmpty()==1){
            return -1;
        }
        else{
            return deck[rear];
        }
    }
}