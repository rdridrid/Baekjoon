import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = 0;
        int b = 0;
        int c = 0;
        
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a==0&&b==0&&c==0){
                break;
            }
            if(a>=c&&a>=b){
                if(a*a==(b*b)+(c*c)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else if(b>=c&&b>=a){
                if(b*b==(a*a)+(c*c)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else{//c변의 크기가 가장 클 때
                if(c*c==(b*b)+(a*a)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
        }
    }
}