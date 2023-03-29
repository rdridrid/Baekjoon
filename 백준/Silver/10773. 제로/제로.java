import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack(N);
        int sum = 0;
        for(int i=0;i<N;i++){
            int number = Integer.parseInt(br.readLine());
            if(number!=0){
                stack.push(number);
            }
            else{
                stack.pop();
            }
        }
        while(stack.size()>0){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
class Stack{
    int[] stack;
    int pos;
    int size;
    int capacity;
    Stack(int n){
        stack = new int[n];
        pos = -1;
        size = 0;
        capacity = n;
    }
    public void push(int n){
        if(!isFull()){
            pos++;
            stack[pos] = n;
            size++;
        }
    }
    public int pop(){
        if(!isEmpty()){
            pos--;
            size--;
            return stack[pos+1];
        }
        else{
            return -1;
        }
    }
    public boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(size>=capacity)
            return true;
        else{
            return false;
        }
    }
    public int size(){
        return size;
    }
}