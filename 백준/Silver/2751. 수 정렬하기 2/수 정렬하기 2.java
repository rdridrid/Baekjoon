import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    static int[] tempArr = new int[1000000]; //합병정렬엔 추가적인 공간이 사용된다. left~mid, mid~right 두 리스트를 정렬하기 위해
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        //합병 정렬 이용

        mergeSort(arr,0,num-1);
        StringBuilder strbr = new StringBuilder(); //시간초과로 Strignbuilder이용
        for(int k=0;k<num;k++){
            strbr.append(arr[k]+"\n");
        }
        System.out.println(strbr);
    }
    public static void merge(int arr[], int left, int mid, int right){
        int i, j, k, l;
        i = left;
        j = mid+1;
        k = left;

        while(i<=mid && j<=right){ //두개로 나눠전 리스트를 인덱스 범위안에서 정렬
            if(arr[i]<=arr[j])
                tempArr[k++] = arr[i++];
            else
                tempArr[k++] = arr[j++];
        }
        //정렬 시 남아있는 일부 값들에 대하여 복사
        if(i>mid){
            for(l=j;l<=right;l++)
                tempArr[k++] = arr[l];
        }
        else{
            for(l=i;l<=mid;l++)
                tempArr[k++] = arr[l];
        }
        for(l=left;l<=right;l++){
            arr[l] = tempArr[l];
        }
    }
    public static void mergeSort(int arr[], int left, int right){
        int mid;
        if(left<right){
            mid = (left+right)/2; //중앙 index계산
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left,mid,right);
        }
    }
}