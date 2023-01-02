import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] alpha = new int[26]; //26
        int temp=0;
        for(int i=0;i<26;i++){
            alpha[i]=-1; //init
        }
        for(int j=0;j<word.length();j++){
            temp=word.charAt(j)-'a'; //if(a) -> 0
            if(alpha[temp]==-1){
                alpha[temp]=j;
            }
        }
        for(int k=0;k<26;k++){
            System.out.printf(alpha[k]+" ");
        }
        sc.close();
    }
}