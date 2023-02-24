import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());
        Stack stack = new Stack(size);
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<size;i++){
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            if(method.equals("push")){ //문자열 비교는 equals 또는 matches로
                int number = Integer.parseInt(st.nextToken());
                stack.push(number);
            } else if(method.equals("pop")){
                sbr.append(stack.pop()+"\n");

            } else if(method.equals("size")){
                sbr.append(stack.size()+"\n");

            } else if(method.equals("empty")){
                if(stack.empty()){
                    sbr.append("1"+"\n");
                }
                else{
                    sbr.append("0"+"\n");
                }
            } else{ //top
                sbr.append(stack.top()+"\n");
            }
        }
        System.out.println(sbr);
    }
}
class Stack{
    int stackSize = 0;
    int[] stack;
    int pos = -1;
    Stack(int stackSize){
        this.stackSize=stackSize;
        this.stack = new int[stackSize];
    }
    void initStack(){
        for(int i=0;i<stackSize;i++){
            stack[i] = 0;
        }
        pos = -1;
    }
    void push(int a){
        if(pos<stackSize-1){
            stack[++pos] = a;
        }
        else{
            //System.out.println("it is full");
        }
    }
    int pop(){
        if(pos>-1){
            return stack[pos--];
        }else{
            return -1;
        }
    }
    int size(){
        return pos+1;
    }
    boolean empty(){
        if(pos==-1){
            return true;
        }
        else{
            return false;
        }
    }
    int top(){
        if(pos>-1){
            return stack[pos];
        }else{
            return -1;
        }
    }
}