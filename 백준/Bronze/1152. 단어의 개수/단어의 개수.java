import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine(); //next가 아닌 nextLine을 사용해야함, next는 공백 구분
        char alpha = 'a';//init
        int num = 0;
        int flag = 0; //단어 사이 빈칸 구분에 사용함.
        for(int i=0;i<sentence.length();i++){
            alpha = sentence.charAt(i);
            if(alpha == ' '){
                flag = 0; //문장 끝 빈칸 또는 단어 사이 빈칸 시
            }
            else if((alpha != ' ')&&(flag == 0)){//flag = 0 일때 바로 전 문자는 빈칸또는 문장 맨 끝
                flag = 1;
                num++;
            }
        }
        System.out.println(num);
        sc.close();
    }
}