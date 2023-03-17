import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//백트래킹 기초. 재귀 함수
public class Main {
    public static int[] arr;
    public static boolean[] check;
    public static StringBuilder sbr = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M]; //배열에 수열을 담는다. 인덱스는 탐색 깊이를 이용한다.
        check = new boolean[N]; //노드 방문 여부
        DFS(N,M,0);
        System.out.println(sbr.toString().trim());
    }
    public static void DFS(int N, int M, int depth){
        if(depth == M){
            for(int i=0;i<M;i++){
                sbr.append(arr[i]+" ");
            }
            sbr.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(!check[i]){ //check[i] = false인 경우, 탐색을 하지 않았을 경우
                check[i] =true;
                arr[depth] = i+1; //1~N까지의 자연수, 인덱스는 0부터 시작함. 그래서 i+1을 해줌.
                //i++이기 때문에 수열은 오름차순으로 출력될 수 밖에 없다.
                DFS(N,M,depth+1);
                check[i] = false;
            }
        }
    }
}