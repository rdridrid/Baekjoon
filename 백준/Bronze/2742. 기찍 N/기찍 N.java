import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        StringBuilder strbr = new StringBuilder();
        for(int i=num;i>0;i--){
            strbr.append(i+"\n");
        }
        System.out.println(strbr);
    }
}