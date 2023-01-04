import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char num = 'A';
        int tm = 0;
        for(int i = 0;i<str.length();i++){
            num = str.charAt(i);
            switch(num-'A'){ //num-'A' -> int형 나옴
                case 0:
                case 1:
                case 2:
                    tm+=3;
                    break;
                case 3:
                case 4:
                case 5:
                    tm+=4;
                    break;
                case 6:
                case 7:
                case 8:
                    tm+=5;
                    break;
                case 9:
                case 10:
                case 11:
                    tm+=6;
                    break;
                case 12:
                case 13:
                case 14:
                    tm+=7;
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    tm+=8;
                    break;
                case 19:
                case 20:
                case 21:
                    tm += 9;
                    break;
                case 22:
                case 23:
                case 24:
                case 25:
                    tm += 10;
                    break;
                default:
                    tm += 11;
                    break;
            }
        }
        System.out.println(tm);
    }
}