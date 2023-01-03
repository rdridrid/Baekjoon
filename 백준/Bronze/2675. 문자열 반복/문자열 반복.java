import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        int len=0;
        String word="";
        for(int i=0;i<iter;i++){
            len = sc.nextInt(); //length
            word = sc.next();
            for(int k=0;k<word.length();k++){
                for(int l=0;l<len;l++){
                    System.out.print(word.charAt(k));
                }
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}