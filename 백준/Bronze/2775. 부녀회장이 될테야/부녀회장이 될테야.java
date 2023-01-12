import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        int k = 0;
        int n = 0;
        int temp = 0;
        int[] preNumber = new int[15]; //index 0~14
        int[] nextNumber = new int[15];
        for(int i=0;i<iter;i++){
            for(int j=0;j<15;j++){
            preNumber[j] = j;
            nextNumber[j] = j;
            }
            k = Integer.parseInt(br.readLine()); //층
            n = Integer.parseInt(br.readLine()); //호
            for(int x=1;x<=k;x++){
                for(int l=1;l<=n;l++){//n - > 호수
                    temp = 0;
                    for(int q=1;q<=l;q++){//해당 호수는 아래층 호수까지의 합
                        temp += preNumber[q];
                    }
                    nextNumber[l] = temp;
                }
                for(int w =0 ; w<15; w++){
                    preNumber[w] = nextNumber[w];
                }
            }
            System.out.println(temp);
        }
    }
}