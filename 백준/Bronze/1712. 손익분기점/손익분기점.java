import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(); //가변비용
        int C = sc.nextInt(); //판매
        int total=0;//비용
        int profit=C-B;//이익 C-B
        int num=0;//판매 대수
        total = A;
        int i=0;
        if(profit<=0){
            System.out.println(-1);
        }
        else{
            while(true){
                i++;
                if(total<(i*profit)){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}