import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{ //계수 정렬
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] arr = new int[10001]; //1~10000의 자연수
        int nat = 0; //입력받을 변수
        for(int i=0;i<number;i++){
            nat = Integer.parseInt(br.readLine());
            arr[nat]++; //입력받은 수와 같은 인덱스 이용
        }
        StringBuilder strbr = new StringBuilder();
        //수의 개수만큼 배열 원소값에 저장이 되어있음
        for(int i=1;i<10001;i++){
            for(int j=0;j<arr[i];j++){ //arr[10] = 2일 경우 10이 두번 나왔음을 의미함.
                strbr.append(i+"\n");
            }
        }
        System.out.println(strbr);
    }
} 