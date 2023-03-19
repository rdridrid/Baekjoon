import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//퀵 정렬
public class Main {
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //1부터 N까지
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Quick_Sort_Part(arr,0,arr.length-1);
        System.out.println(arr[K-1]);
    }
    public static int partition(int[] arr, int left, int right){
        int pivot = (left+right)/2; //일부 정렬된 부분배열의 중앙값을 피봇으로 정함.
        int temp; //left, right, pivot끼리 값을 교환할 때 사용
        int pp = arr[pivot];
        temp = arr[left];
        arr[left] = arr[pivot];
        arr[pivot] = temp;
        int low = left; //왼쪽은 +1부터 탐색하는데 do while을 사용 left+1부터 시작
        int high = right+1; //맨 끝부터 확인하지만 do while사용으로 right+1     -1

        do{
            do
                low++;
            while(low<=right&&arr[low]<pp);
            do
                high--;
            while(high>=left && arr[high]>pp);
            if(low<high){ // 왼쪽은 피봇보다 크고 오른쪽은 피봇보다 작은 수끼리 교환
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }while(low<high); //low와 high가 교차하기 전까지
        //교차하게 되면 left, pivot과 high를 교환. hight가 부분배열을 나눌 기준이 됨.
        temp = arr[left];
        arr[left] = arr[high];
        arr[high] = temp;

        return high;
    }
    public static void Quick_Sort_Part(int[] arr, int left, int right){
        if(left>right){
            return;
        }
        else{
            int q = partition(arr,left,right); //위치 (피봇)
            if(K-1==q){ //배열의 인덱스는 0부터 시작한다. K번째 수의 인덱스는 K-1이다.
                return;
            }
            else if(K-1>q){ //전체를 정렬하면 시간초과.
                Quick_Sort_Part(arr,q+1,right);
            }
            else{
                Quick_Sort_Part(arr,left,q-1);
            }
        }
    }
}