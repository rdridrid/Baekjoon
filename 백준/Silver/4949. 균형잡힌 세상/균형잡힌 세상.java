//이번엔 그냥 스택을 구현하지 않고 내장된 스택 사용.
//처음에 문자열 입력이 여러줄로 제공되는줄 알았다.
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbr = new StringBuilder();
        String str = "";
        while(true){
            str = br.readLine();
            if(str.equals(".")){ // "."이 문단의 끝으로 보나?
                break;
            }
            sbr.append(answer(str)).append("\n");
        }
        System.out.println(sbr);
    }
    public static String answer(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == '(' || temp == '[') {
                stack.push(temp);
            } else if (temp == ')') {
                if (stack.empty() || stack.peek() != '(') { //아니면 함수 종료하고 no
                    return "no";
                } else {
                    stack.pop(); //짝이 맞으면 삭제
                }
            } else if (temp == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}