import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int A, B;
        while(true){
            String s = bf.readLine();
            if(s!=null){
                st = new StringTokenizer(s);
                A = Integer.parseInt(st.nextToken());
                B = Integer.parseInt(st.nextToken());
                bw.write(A+B+"\n");
            }
            else{
                break;
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}