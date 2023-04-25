import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp<40)
                temp = 40;
            arr[i] = temp;
            sum+=temp;
        }
        System.out.println(sum/5);
    }
}