import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        int flag = 0;
        if(((Year%4)==0)&&(Year%100)!=0){
            flag = 1;
        }
        else if((Year%400)==0){
            flag = 1;
        }
        else
            flag = 0;
        System.out.println(flag);
        sc.close();
    }
}