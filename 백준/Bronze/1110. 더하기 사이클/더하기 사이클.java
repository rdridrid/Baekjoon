import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = A;
        int temp;
        int iter = 0;
        while(true){
            if(A<10){
                temp = A; // 10미만일때 0+A
            }
            else{
                temp = (A/10)+(A%10); //각 자리수의 합
            }
            A = ((A%10)*10)+(temp%10);
            iter++;
            if(B==A){
                break;
            }
        }
        System.out.println(iter);
    }
}