import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char asc = sc.next().charAt(0);
        int A = asc;
        System.out.println(A);
        sc.close();
    }
}