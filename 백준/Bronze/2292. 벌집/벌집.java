import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 1;
        int i = 0;
        for(i=1;start<N;i++){
            start = start+6*i;
        }
        System.out.println(i);
        sc.close();
    }
}