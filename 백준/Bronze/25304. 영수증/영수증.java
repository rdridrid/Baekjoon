import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int iter = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=iter;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = sum+A*B;
        }
        if(total==sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}