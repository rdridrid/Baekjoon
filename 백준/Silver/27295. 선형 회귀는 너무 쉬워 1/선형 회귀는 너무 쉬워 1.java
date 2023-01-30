import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long num = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long sum = 0; //이항
        long xsum = 0; //a1의 계수 합
        long ysum = 0; //y의 합    ->    0 = b*num+ a1의 계수(x)합+ y의 합
        for(int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            xsum += x;
            ysum += y;
        }
        sum = sum+ysum-(num*b); //sum = a*x;
        if(xsum==0){ //a*0일 경우 어떤 a가 들어와도 동일함
            System.out.println("EZPZ");
        }
        else if(sum==0){
            System.out.println(0);
        }
        else if(Math.abs(sum)%Math.abs(xsum)==0){
            System.out.println(sum/xsum);
        }
        else{
            long max = 1;
            max = gdc(Math.abs(xsum),Math.abs(sum));
            if((xsum>0&&sum<0)||(xsum<0&&sum>0)){//서로 부호가 다를경우에
                System.out.println((Math.abs(sum)/max)*-1+"/"+Math.abs(xsum)/max);
            }
            else{
                System.out.println(Math.abs(sum)/max+"/"+Math.abs(xsum)/max);
            }
        }
    }
    public static long gdc(long a, long b){
        if(a<b)
        {
            long temp = a;
            a= b;
            b = temp;
        }
        while(b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}