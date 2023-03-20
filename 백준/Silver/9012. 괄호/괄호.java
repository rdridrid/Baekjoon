import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack;
        char temp;
        int flag = 0;
        for(int i=0;i<N;i++){
            flag = 0;
            String str = br.readLine();
            stack = new Stack(str.length());
            for(int j=0;j<str.length();j++){
                temp = str.charAt(j);
                if(temp=='('){
                    stack.push(temp);
                }
                else{
                    char temp2 = stack.pop();
                    if(temp2!='('){
                        flag = 1;
                        break;
                    }
                }
            }
            if(stack.size()>0){
                flag = 1;
            }
            if(flag == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
class Stack{
    int size;
    int pos;
    char[] stack;
    Stack(int n){
        stack = new char[n];
        pos = -1;
        size = n;
    }
    public void push(char n){
        if(pos<n-1) {
            pos++;
            stack[pos] = n;
            size++;
        }
    }
    public char pop(){
        if(pos>-1){
            pos--;
            return stack[pos+1];
        }
        else{
            return 'x';
        }
    }
    public int size(){
        return pos+1;
    }
}