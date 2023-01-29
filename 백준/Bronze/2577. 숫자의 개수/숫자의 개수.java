import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a*b*c;
        int[] arr = new int[10]; //0~9
        while(mul>0){
            arr[mul%10]++;
            mul = mul/10;
        }
        StringBuilder strbr = new StringBuilder();
        for(int i=0;i<10;i++){
            strbr.append(arr[i]+"\n");
        }
        System.out.println(strbr);
    }
}