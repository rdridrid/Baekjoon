import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        String temp = "";
        char tempch = 'a';
        int num=0;
        int[] arr;
        int flag = 0;
        int flag2 = 0;
        for(int i=0;i<N;i++){
            flag = 0;
            flag2 = 0;
            temp = bf.readLine();
            arr = new int[26];
            for(int k=0;k<26;k++){
                arr[k] = 0;
            }
            for(int j=0;j<temp.length();j++){
                tempch = temp.charAt(j);
                if(j==0){
                    flag = 1;
                    arr[tempch-'a']++;
                }
                if(j>0){
                    if(tempch!=temp.charAt(j-1)){
                        flag = 1; //알파벳이 바뀜
                        arr[tempch-'a']++;
                    }
                    else{
                        flag = 0; //이전 알파벳과 같은 경우
                        arr[tempch-'a']++;
                    }
                }
                if(flag == 1&&(arr[tempch-'a']>1)){//알파벳이 이전과 다르면서 배열에 있는 경우라면
                    flag2 = 1;
                    break;
                }
            }
            if(flag2 == 0){
                num++;
            }
        }
        System.out.println(num);
    }
}