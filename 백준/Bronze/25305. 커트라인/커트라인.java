import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{ //퀵 정렬이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int cutline = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //정렬
        quick_sort(arr,0,num-1);
        System.out.println(arr[num-cutline]);

    }
    public static int partition(int arr[], int left, int right)
    {
        int pivot, temp;
        int low, high;
        low = left;
        high = right+1;
        pivot  = arr[left];
        do{
            do
                low++;
            while(low<=right && arr[low]<pivot); //피봇보다 작은 걸 찾았을때 , 인덱스 값을 넘지않게 low<=right
            do
                high--;
            while(high>=left && arr[high]>pivot); //피봇보다 큰 걸 찾았을 때 _ low와 high가 서로 교차되진 않은 상태
            if(low<high){ // 둘 위치를 변경
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        } while(low < high); //low와 high가 교차하기 전까지
        temp = arr[left];
        arr[left] = arr[high];
        arr[high] = temp;
        return high;
    }
    public static void quick_sort(int arr[], int left, int right){
        if(left<right){
            int q = partition(arr,left,right);
            quick_sort(arr,left,q-1); //양방향 분할
            quick_sort(arr,q+1,right);
        }
    }
}