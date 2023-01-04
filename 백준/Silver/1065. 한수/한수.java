import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        for(int i=1;i<=N;i++){
            if(i<100){//1~99
                total++;
            }
            else if(i<1000){
                if((i/100)-(i/10)%10==(i/10)%10-i%10){//절대값이 아닌 차이
                    total++;
                }
            }
        }
        System.out.println(total);
        sc.close();
    }
}