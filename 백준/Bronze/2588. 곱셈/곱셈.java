import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = B%10; //일의 자리
        int D = (B/10)%10; //십의 자리
        int E = (B/100)%10; //백의 자리
        System.out.println(A*C);
        System.out.println(A*D);
        System.out.println(A*E);
        System.out.println(A*B);
        sc.close();
    }
}