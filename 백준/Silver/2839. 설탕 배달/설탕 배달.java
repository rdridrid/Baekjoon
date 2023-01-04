import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int kg2 = 0;
        int iter = kg/5;
        int flag = 0;
        for(int i=iter;i>=0;i--){
            kg2 = kg-5*i;
            if(kg2%3==0){
                System.out.println(i+(kg2/3));
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
        sc.close();
    }
}