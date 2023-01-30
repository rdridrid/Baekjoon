import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
    public static void main(String[] args){
        Date today = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(ft.format(today));
    }
}