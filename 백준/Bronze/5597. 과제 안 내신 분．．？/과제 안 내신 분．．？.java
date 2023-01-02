import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[28];
        int[] arr2=new int[30];
        for(int i=0;i<28;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<28;j++){
            arr2[arr[j]-1]=1;
        }
        for(int k=0;k<30;k++){
            if(arr2[k]==0){
                System.out.println(k+1);
            }
        }
        sc.close();
    }
}