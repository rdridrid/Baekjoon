import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int len =Integer.parseInt(br.readLine());
        String str = br.readLine();
        long hashnumber = 0;
        int r = 31;
        int M = 1234567891;
        for(int i=0;i<len;i++){
            hashnumber+=((str.charAt(i)-'a'+1)*Math.pow(r,i)); //(밑수, 지수)
        }
        System.out.println(hashnumber%M);
    }
}