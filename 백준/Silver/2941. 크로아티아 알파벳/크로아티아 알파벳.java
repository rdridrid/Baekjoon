import java.util.Scanner;
public class Main{
    public static void main(String[] args){//이전까지 오답이였던 이유->첫문자끼리 모두 같은 조건으로 묶어서
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int num = 0;
        char temp = 'a';
        for(int i=0;i<sentence.length();i++){
            temp = sentence.charAt(i);
            if(temp == 'c'&&i<sentence.length()-1){
                if(sentence.charAt(i+1)=='='||sentence.charAt(i+1)=='-'){
                    num++;
                    i++;
                }
                else{
                    num++;
                }
            }
            else if(temp == 'd'&&i<sentence.length()-1){
                if(sentence.charAt(i+1)=='-'){
                    num++;
                    i++;
                }
                else if(sentence.charAt(i+1)=='z'&&i<sentence.length()-2){
                    if(sentence.charAt(i+2)=='='){
                        num++;
                        i+=2;
                    }
                    else{
                        num++;
                    }
                }
                else{
                    num++;
                }
            }
            else if(temp == 'l'&&i<sentence.length()-1){
                if(sentence.charAt(i+1)=='j'){
                    num++;
                    i++;
                }
                else{
                    num++;
                }
            }
            else if(temp == 'n'&&i<sentence.length()-1){
                if(sentence.charAt(i+1)=='j'){
                    num++;
                    i++;
                }
                else{
                    num++;
                }
            }
            else if(temp == 's'&&i<sentence.length()-1){
                if(sentence.charAt(i+1)=='='){
                    num++;
                    i++;
                }
                else{
                    num++;
                }
            }
            else if(temp == 'z'&&i<sentence.length()-1){
                if(sentence.charAt(i+1)=='='){
                    num++;
                    i++;
                }
                else{
                    num++;
                }
            }
            else{
                num++;
            }
        }
        System.out.println(num);
    }
}