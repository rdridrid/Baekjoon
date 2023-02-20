import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); //참외 개수
        int[] input=new int[6];
        int maxHeight=0,maxWidth=0; // 최대 세로길이, 최대 가로길이 - 최대길이와 인접한 변들의 차가 빼야할 사각형의 변의 길이
        int indexHeight=0,indexWidth=0;

        for (int i = 0; i < 6; i++) {
            st=new StringTokenizer(br.readLine());
            int dir=Integer.parseInt(st.nextToken()); //방향
            int distance=Integer.parseInt(st.nextToken()); //길이
            if(dir==3 || dir==4) {
                maxHeight=maxHeight<distance?distance:maxHeight;
                if (maxHeight==distance) indexHeight=i; //최대길이일경우 탐색할 위치
            }else { // c
                maxWidth=maxWidth<distance?distance:maxWidth;
                if (maxWidth==distance) indexWidth=i;
            }
            input[i]=distance;

        }
        int nextHeight1=input[5],nextWidth1=input[5];
        int nextHeight2=input[0],nextWidth2=input[0];
        if (indexWidth-1>-1) nextHeight1=input[indexWidth-1];
        if (indexWidth+1<6) nextHeight2=input[indexWidth+1];
        if (indexHeight-1>-1) nextWidth1=input[indexHeight-1];
        if (indexHeight+1<6) nextWidth2=input[indexHeight+1];

        // 최대 가로길이*세로길이 중 작은 길이 + 가로길이 중 작은 길이*(최대 세로길이-세로길이 중 작은 길이)
        int area=maxWidth*Math.min(nextHeight1, nextHeight2)+Math.min(nextWidth1, nextWidth2)*(maxHeight-(Math.min(nextHeight1, nextHeight2)));

        System.out.println(area*N);

    }
}