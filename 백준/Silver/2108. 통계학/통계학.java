import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        int[] arr = new int[iter];
        int median, frequ, sum;
        int min, max;
        int mid;
        median = 0;
        frequ = 0;
        if(iter%2==0){
            mid = iter/2;
        }
        else{
            mid = iter/2;
            mid++;
        }
        min = 4001;
        max = -4001;
        sum = 0;
        int[] temp = new int[8001]; //-4000 ~ 4000
        for(int i=0;i<iter;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            temp[arr[i]+4000]++; //계수 정렬
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int tempsum = 0;
        int flag = 0; //최빈값이 여러개 있을 때 1
        int frequen_min = 0; //최빈값이 여러개 있을 경우 최댓값
        int frequen_count = 0;
        for(int i=0;i<8001;i++){
            tempsum+=temp[i];
            if(tempsum>=mid){
                median = i-4000;
                break;
            }
        }
        for(int i=0;i<8001;i++){
            if(frequen_count<temp[i]){
                flag = 0;
                frequen_count=temp[i];
                frequen_min = i-4000; //원래는 i-4000 제일 작은 최빈값
            }
            else if(frequen_count==temp[i]){
                if(flag == 0){
                    frequ = i-4000; //flag 0일때 즉 중복된 최빈값이 없었다가 새로 생길 때
                }
                flag = 1;
            }
        }
        System.out.println(Math.round(sum/(float)iter)); //반올림
        System.out.println(median); //중앙값
        if(flag == 1){
            System.out.println(frequ);//최빈값
        }
        else{
            frequ = frequen_min;
            System.out.println(frequ);
        }


        System.out.println(max-min); //범위
    }
}