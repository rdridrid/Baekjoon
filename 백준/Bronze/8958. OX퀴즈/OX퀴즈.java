import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        String[] arr = new String[iter];
        int score;
        int temp;
        for(int i=0;i<iter;i++){
            score=0;
            temp=0;
            arr[i] = sc.next();
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='O'){
                    temp++;
                    score = score + temp;
                }
                else{
                    temp = 0;
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}