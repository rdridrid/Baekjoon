import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inversionNum = 0;//비교에 사용함
        int originalNum = 0;
        int originalNum2 = 0;
        while(true){
            originalNum = sc.nextInt();
            originalNum2 = originalNum;
            inversionNum = 0;
            if(originalNum==0){
                break;
            }
            while(originalNum>0){
                inversionNum *= 10;
                inversionNum += originalNum%10;
                originalNum= originalNum/10;
            }
            if(inversionNum==originalNum2){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }

}
