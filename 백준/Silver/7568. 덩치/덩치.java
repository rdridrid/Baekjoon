import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] size = new int[iter][2];
        //int[][] sortedSize = new int[iter][2];
        int rank = 1;
        for(int i=0;i<iter;i++){
            st = new StringTokenizer(br.readLine());
            size[i][0] = Integer.parseInt(st.nextToken());
            size[i][1] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<iter;i++){
            rank = 1;
            for(int j=0;j<iter;j++){
                if((size[i][0]<size[j][0])&&(size[i][1]<size[j][1])){ //나보다 덩치가 클때만 순위 계산
                    rank++;
                }
            }
            sbr.append(rank+" ");
        }
        System.out.println(sbr.toString().trim()); //String 변환 후 좌우 공백 제거
    }
}
