import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()]; //입력받은 숫자를 저장할 문자열
        int[] number = new int[10]; //각 자릿수의 개수를 저장할 문자열 0~9
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i)-'0';
            number[arr[i]]++; //계수 정렬
        }
        StringBuilder strbr = new StringBuilder();
        for(int i=9;i>=0;i--){
            for(int j=0;j<number[i];j++){
                strbr.append(i);
            }
        }
        System.out.println(strbr);
    }
}