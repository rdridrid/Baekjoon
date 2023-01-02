import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int total = hour*60+minutes; //전체 시간
        total = total-45;
        if(total<0){
            total=total+1440; //
        }
        hour = total/60;
        minutes = total%60;
        System.out.println(hour+" "+minutes);
        sc.close();
    }
}