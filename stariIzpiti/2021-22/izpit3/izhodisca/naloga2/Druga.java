
import java.util.*;

public class Druga {

    public static void main(String[] args) {
        int visina, sirina, stMejnih = 0;

        Scanner sc = new Scanner(System.in);

        visina = sc.nextInt();
        sirina = sc.nextInt();

        int[][] tabela = new int[visina][sirina];

        for(int i = 0; i < visina; i++){
            for(int y = 0; y < sirina; y++){
                tabela[i][y] = sc.nextInt();
                if((i == 0 || i + 1 == visina || y == 0 || y + 1 == sirina) && tabela[i][y] == 1){
                    stMejnih++;
                }
            }
        }

        // izpis prebrane tabele
        /*for(int i = 0; i < visina; i++){
            for(int y = 0; y < sirina; y++){
                System.out.print(tabela[i][y]);
            }
            System.out.println();
        }*/

        for(int i = 1; i < visina - 1; i++){
            for(int y = 1; y < sirina - 1; y++){
                if(tabela[i][y] == 1 && 
                (
                tabela[i - 1][y - 1] == 0 ||
                tabela[i - 1][y + 1] == 0 ||
                tabela[i - 1][y] == 0 ||
                tabela[i][y - 1] == 0 ||
                tabela[i][y + 1] == 0 ||
                tabela[i + 1][y] == 0 ||
                tabela[i + 1][y - 1] == 0 ||
                tabela[i + 1][y + 1] == 0
                )){
                    stMejnih++;
                }
            }
        }

        System.out.println(stMejnih);

        sc.close();
    }
}
