import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder strbr = new StringBuilder();
        for(int i=0;i<8;i++){
            strbr.append(sc.nextInt());
        }
        String str = String.valueOf(strbr);//stringbuilder와 string은 서로 다른객체
        //equals를 사용했을 때 항상 false가 되므로 문자열이 같은지 비교하기 위해 string으로 변환
        if(str.equals("12345678")){
            System.out.println("ascending");
        }
        else if(str.equals("87654321")){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}