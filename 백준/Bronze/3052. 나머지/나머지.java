import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[42];
        int total=0;
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<10;j++){
            arr2[arr[j]%42]+=1;
        }
        for(int k=0;k<42;k++){
            if(arr2[k]>=1){
                total+=1;
            }
        }
        System.out.println(total);
        sc.close();
    }
}