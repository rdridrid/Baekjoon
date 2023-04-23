import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];
        arr[0] = 1;
        arr[1] = 1; //0과 1 소수에서 제외
        for(int i=2;i<2000001;i++){
            if(arr[i]==1){
                continue;
            }
            for(int j=i*2;j<2000001;j+=i){
                arr[j] = 1;
            }
        }
        //소수는 모두 0
        for(int i=N;i<2000001;i++){
            if(arr[i]==0){
                if(check(i)==true){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static boolean check(int n){
        String str = String.valueOf(n);
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}