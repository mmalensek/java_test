
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int stVrstic, X, Y, stVeckotnikov = 0, nazadnje = 0;

        Scanner sc = new Scanner(System.in);

        stVrstic = sc.nextInt();

        int[] tabelaX = new int[100000];
        int[] tabelaY = new int[100000];

        for(int i = 0; i < stVrstic; i++){
            X = sc.nextInt();
            Y = sc.nextInt();
            tabelaX[i] = X;
            tabelaY[i] = Y;

            for(int y = nazadnje; y < i; y++){
                if(tabelaX[y] == X && tabelaY[y] == Y){
                    nazadnje = i;
                    stVeckotnikov++;
                }
            }
        }

        System.out.println(stVeckotnikov);

        sc.close();
    }
}
