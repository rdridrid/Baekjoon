import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cards = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[cards];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<cards;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int threeNumber = 0;
        int proximityNumber = -1;
        for(int i=0;i<cards;i++){
            threeNumber = arr[i];
            for(int j=0;j<cards;j++) {
                if(j!=i){
                    threeNumber+=arr[j];
                    for(int k=0;k<cards;k++){
                        if(j!=k&&i!=k){
                            threeNumber+=arr[k];
                            if(threeNumber<=target){
                                if(proximityNumber<threeNumber){
                                    proximityNumber=threeNumber;
                                }
                            }
                            threeNumber-=arr[k];
                        }
                    }
                    threeNumber-=arr[j];
                }
            }

        }
        System.out.println(proximityNumber);
    }
}