import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//삽입 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //1부터 N까지
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        int sum = 0;
        int temp = 0;
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //정렬
        inputSort(arr);
        //
        for(int i=0;i<N;i++){
            temp+=arr[i];
            sum+=temp;
        }
        System.out.println(sum);
    }
    static void inputSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp2 = arr[min];
            arr[min] = arr[i];
            arr[i] = temp2;
        }
    }
}