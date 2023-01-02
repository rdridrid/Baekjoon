import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String numberic;
        int sum=0;
        int len=sc.nextInt();
        numberic = sc.next();
        for(int i=0;i<len;i++){
            sum+=(numberic.charAt(i)-'0');
        }
        System.out.println(sum);
        sc.close();
    }
}