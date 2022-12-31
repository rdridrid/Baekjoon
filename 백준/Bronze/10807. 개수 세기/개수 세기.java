import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] list = new int[num];
        int total=0;
        for(int i=0;i<num;i++){
            list[i] = sc.nextInt();
        }
        int A = sc.nextInt();
        for(int j=0;j<num;j++){
            if(list[j]==A){
                total++;
            }
        }
        System.out.println(total);
        sc.close();
    }
}