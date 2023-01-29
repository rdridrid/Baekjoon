import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int temp = 0;
        for(int i=0;i<5;i++){
            temp = sc.nextInt();
            sum = sum+temp*temp;
        }
        System.out.println(sum%10);
    }
}