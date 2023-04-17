import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2]; //[0] 시작시간, [1] 종료시간
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //정렬을 재정의 한다.
        //종료시간이 일찍끝나고 시작시간이 빠를수록 좋다. n,n으로 시작하자마자 바로 끝날 수도 있기 때문이다.
        //그래서 미리 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count  = 0;
        int end = -1;
        for(int i=0;i<N;i++){ 
            if(arr[i][0]>=end){//회의가 겹치지않을때
                end = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}