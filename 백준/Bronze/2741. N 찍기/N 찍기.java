import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        StringBuilder strbr = new StringBuilder();
        for(int i=1;i<=iter;i++){
            strbr.append(i+"\n");
        }
        System.out.println(strbr);
    }
}