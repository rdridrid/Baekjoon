import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();
        double score = 4;
        if(grade.charAt(0)=='F'){
                score = 0.0;
        }else{
            char first = grade.charAt(0);
            char end = grade.charAt(1);
            score-= first-'A';
            if(end=='+'){
                score+=0.3;
            }
            else if(end=='0'){

            }else{
                score-=0.3;
            }
        }
        System.out.println(score);
    }
}