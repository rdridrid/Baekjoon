import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        int[][] arr = new int[iter][2]; //[iter][0] = x, [iter][1] = y
        for (int i = 0; i < iter; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (e1, e2) -> { //람다식 이용하되. 이차원 배열을 int[] 타입의 []배열로 간주
            //int[] e1, int[] e2즉 e1[]은 int[][]
            if (e1[0] == e2[0]) { //x값이 같은 경우
                return e1[1] - e2[1]; //y값을 비교함. 뒤에있는 y가 더 클경우 음수값을 리턴
            } else {
                return e1[0] - e2[0]; //x값이 다름
            }
        });
        for (int i = 0; i < iter; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}