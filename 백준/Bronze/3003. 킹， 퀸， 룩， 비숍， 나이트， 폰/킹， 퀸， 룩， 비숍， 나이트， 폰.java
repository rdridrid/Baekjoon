import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int King = sc.nextInt();
        int Queen = sc.nextInt();
        int Rook = sc.nextInt();
        int Bishop = sc.nextInt();
        int Knight = sc.nextInt();
        int Pawn = sc.nextInt();
        King=1-King;
        Queen=1-Queen;
        Rook=2-Rook;
        Bishop=2-Bishop;
        Knight=2-Knight;
        Pawn=8-Pawn;
        System.out.println(King+" "+Queen+" "+Rook+" "+Bishop+" "+Knight+" "+Pawn);
        sc.close();
    }
}