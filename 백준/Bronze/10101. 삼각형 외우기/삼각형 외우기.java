import java.io.*;
import java.util.*;
public class Main{
    //17219번
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] angles = new int[3];
        for(int i=0;i<3;i++){
            angles[i] = Integer.parseInt(br.readLine());
            sum+=angles[i];
        }
        if(sum != 180){
            System.out.println("Error");
        } else{
            if(angles[0]==angles[1]&&angles[0]==angles[2]&&angles[1]==angles[2]){
                System.out.println("Equilateral");
            } else if(angles[0]!=angles[1]&&angles[0]!=angles[2]&&angles[1]!=angles[2]){
                System.out.println("Scalene");
            } else{
                System.out.println("Isosceles");
            }
        }
    }
}