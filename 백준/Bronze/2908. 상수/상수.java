import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int reverseA = (A%10)*100+((A/10)%10)*10+A/100;
        int reverseB = (B%10)*100+((B/10)%10)*10+B/100;
        if(reverseA > reverseB){
            System.out.println(reverseA);
        }
        else{
            System.out.println(reverseB);
        }
        sc.close();
    }
}