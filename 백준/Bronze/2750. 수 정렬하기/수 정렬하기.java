import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        int[] arr = new int[iter];
        int temp = 0; //배열값 swap에 필요한 변수
        for(int i=0;i<iter;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int j = iter-1;j>0;j--){ //버블정렬. 인접한 두개의 인덱스끼리 교환할때 전체 갯수 -1만큼 교환 그것을 반복
            for(int k=0;k<j;k++){//0부터 인접 인덱스 교환
                if(arr[k]>arr[k+1]){//이전 인덱스의 값이 더 큰경우
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(int l=0;l<iter;l++){
            System.out.println(arr[l]);
        }
    }
}