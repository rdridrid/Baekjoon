import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hamburger[] = new int[3];
        int beverage[] = new int[2];
        int setPrice = -50;
        int minHamburger = Integer.MAX_VALUE;
        int minBeverage = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            int temp = Integer.parseInt(br.readLine());
            if(minHamburger>temp){
                minHamburger = temp;
            }
        }
        for(int i=0;i<2;i++){
            int temp = Integer.parseInt(br.readLine());
            if(minBeverage>temp){
                minBeverage = temp;
            }
        }
        setPrice+=minBeverage+minHamburger;
        System.out.println(setPrice);
    }
}