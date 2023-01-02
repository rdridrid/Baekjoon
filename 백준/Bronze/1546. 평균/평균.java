import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        double[] arr = new double[iter];
        double max;
        double sum=0;
        for(int i=0;i<iter;i++){
            arr[i] = sc.nextInt();
        }
        max=arr[0];
        for(int j=0;j<iter;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        for(int k=0;k<iter;k++){
            arr[k]=arr[k]/(max*1.0)*100;
            sum=sum+arr[k];
        }
        System.out.println(sum/iter);
        sc.close();
    }
}