import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char alpha='1';
        char[] maxalpha = new char[26];
        int max;
        int flag = 0;
        for(int j=0;j<26;j++){
            maxalpha[j] = 0; //0으로 모두 초기화
        }
        for(int i=0;i<word.length();i++){
            alpha=word.charAt(i);
            if(alpha>'Z'){//소문자
                maxalpha[alpha-'a']++;//a일때 0
            }
            else{
                maxalpha[alpha-'A']++;//A일때 0
            }
        }
        max=-1; //첫 문자만 있는경우 else if 조건에 걸리므로 반드시 첫문자는 if문으로 들어가도록 -1로 초기화
        for(int k=0;k<26;k++){
            if(max<maxalpha[k]){
                flag = 0; //최대값을 찾으면 flag초기화(같은 빈도의 알파벳이 없음)
                max=maxalpha[k];
                alpha = (char) (k+'A');
            }
            else if(max == maxalpha[k]){
                flag = 1; //다른 최대값이 존재할 때 그 값이 배열[k]와 같을 땐 중복이 있는 것
            }
        }
        if(flag == 1){
            System.out.println("?");
        }
        else{
            System.out.println(alpha);
        }
    }
}