import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minOdd = 100;
        int oddSum = 0;
        for(int i=0;i<7;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp%2==1){
                oddSum+=temp;
                if(temp<minOdd)
                    minOdd = temp;
            }
        }
        if(oddSum==0){
            oddSum-=1;
        }
        System.out.println(oddSum);
        if(minOdd!=100){
            System.out.println(minOdd);
        }
    }
}