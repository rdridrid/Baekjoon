import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max;
        int pos;
        int[] arr = new int[9];
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        pos=0;
        for(int j=0;j<9;j++){
            if(max<arr[j]){
                max=arr[j];
                pos=j;
            }
        }
        System.out.println(max);
        System.out.println(pos+1);
        sc.close();
    }
}