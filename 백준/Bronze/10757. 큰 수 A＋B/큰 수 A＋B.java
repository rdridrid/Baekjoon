import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        int max_size = 0;
        if(str1.length()>=str2.length()){
            max_size = str1.length();
        }
        else{
            max_size = str2.length();
        }
        int[] arr1 = new int[max_size+1]; //두 수의 합으로 자릿수가 올라갈 수도 있음
        int[] arr2 = new int[max_size+1];

        for(int i = str1.length() - 1, j = 0; i>=0 ; i--, j++){
            arr1[j] = str1.charAt(i) - '0';
        }
        for(int i = str2.length() - 1, j = 0; i>=0 ; i--, j++){
            arr2[j] = str2.charAt(i) - '0';
        }

        for(int k=0;k<max_size;k++){
            int sum = arr1[k]+arr2[k];
            arr1[k] = sum%10; //자릿값 계산
            arr1[k+1] = arr1[k+1]+(sum/10); //올림 계산
        }
        if(arr1[max_size] != 0){ //가장 높은 자릿수 반올림이없는경우
            System.out.print(arr1[max_size]);
        }
        for(int i = max_size-1 ; i>=0; i--){
            System.out.print(arr1[i]);
        }
    }
}