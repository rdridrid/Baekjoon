import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//슬라이딩 윈도우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        char[] Arr = new char[S];
        StringBuilder sbr = new StringBuilder();
        int start=0, end=P-1; //맨 앞 부분문자열
        int count =0;
        for(int i=0;i<S;i++){
            Arr[i] = str.charAt(i);
        }
        int a2=0,c2=0,g2=0,t2=0; //현재 부분문자열의 알파벳 수
        int a1, c1, g1,t1; // 필요한 최소 알파벳의 수
        st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        c1 = Integer.parseInt(st.nextToken());
        g1 = Integer.parseInt(st.nextToken());
        t1 = Integer.parseInt(st.nextToken());
        for(int i=0;i<P;i++){
            switch(Arr[i]){
                case 'A':
                    a2+=1;break;
                case 'C':
                    c2+=1;break;
                case 'G':
                    g2+=1;break;
                case 'T':
                    t2+=1;break;
            }
        }
        if(a1<=a2&&c1<=c2&&g1<=g2&&t1<=t2){
            count++;
        }
        while(true){
            end++; start++;
            if(end==S){
                break;
            }
            switch(Arr[start-1]){
                case 'A':
                    a2--;break;
                case 'C':
                    c2--;break;
                case 'G':
                    g2--;break;
                case 'T':
                    t2--;break;
            }
            switch (Arr[end]){
                case 'A':
                    a2++;break;
                case 'C':
                    c2++;break;
                case 'G':
                    g2++;break;
                case 'T':
                    t2++;break;
            }
            if(a1<=a2&&c1<=c2&&g1<=g2&&t1<=t2){
                count++;
            }
        }
        System.out.println(count);
    }

}