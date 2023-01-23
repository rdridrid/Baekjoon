import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        int j = 0; //나중에 삽입정렬 다른 방식 알아보기
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        System.out.println(sum/5);
        for(int i=1;i<5;i++){//인덱스 0은 이미 정렬되었다고 판단함.
            int temp = arr[i];
            for(j = i-1;j>=0&&arr[j]>temp;j--){ //i의 바로 앞 인덱스 i-1 부터 arr[i]의 값보다 큰지 비교
                arr[j+1] = arr[j]; //클 경우엔 arr[i-1]을 arr[i]로 이동시키고
            }
            arr[j+1] = temp;//arr[i-1]에 기존 arr[i]값을 넣는다.
        }
        System.out.println(arr[2]);
    }
}