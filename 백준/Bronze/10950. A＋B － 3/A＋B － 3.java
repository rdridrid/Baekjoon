import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        for(int i=1;i<=iter;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
        sc.close();
    }
}