import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<num;i++){
            String temp = br.readLine();
            String temp1 = isPalindrome(temp);
            System.out.print(temp1.charAt(0)+" ");
            for(int j=1;j<temp1.length();j++){
                System.out.print(temp1.charAt(j));
            }
            if(i!=num-1){
                System.out.println("");
            }
        }
    }
    public static String recursion(String s, int l,int r, int count){
        if(l>=r){
            return "1"+count;
        }
        else if(s.charAt(l)!=s.charAt(r)){
            return "0"+count;
        }
        else{
            return recursion(s,l+1,r-1,count+1);
        }
    }
    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1,1);
    }

}