import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str  = br.readLine();
        char alpha;
        char temp = 'a'-'A';
        int temp2;
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            alpha = str.charAt(i);
            temp2 = alpha;
            if(alpha>='a'&&alpha<='z'){
                alpha = (char) (temp2-temp);
                sbr.append(alpha);
            }
            else{
                alpha = (char) (temp2+temp);
                sbr.append(alpha);
            }
        }
        System.out.println(sbr);
    }
}