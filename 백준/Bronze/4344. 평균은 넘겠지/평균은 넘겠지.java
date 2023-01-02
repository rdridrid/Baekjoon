import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        int entire, sum, over;
        double avg;
        for(int i=0;i<iter;i++){
            entire = sc.nextInt();
            sum = 0;
            avg = 0.0;
            int[] arr = new int[entire];
            over = 0;
            for(int j=0;j<entire;j++){
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            avg = (sum*1.0)/entire;
            for(int k=0;k<entire;k++){
                if(arr[k]>avg){
                    over++;
                }
            }
            System.out.printf("%.3f",((over*1.0)/entire)*100.0);
            System.out.printf("%%\n");
        }
    }
}