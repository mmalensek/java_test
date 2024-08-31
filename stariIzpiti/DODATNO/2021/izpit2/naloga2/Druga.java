
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {

    public static int visinaGore(int[][] tabela, int kateriStolpec){
        int visina = tabela.length;
        for(int i = 0; i < tabela.length; i++){
            if(tabela[i][kateriStolpec] == 0){
                visina--;
            }
        }
        return visina; 
    }
    public static void main(String[] args) {
        int visinaSlike, sirinaSlike;

        Scanner sc = new Scanner(System.in);

        visinaSlike  = sc.nextInt();
        sirinaSlike = sc.nextInt();

        int[][] tabela = new int[visinaSlike][sirinaSlike];

        for(int i = 0; i < visinaSlike; i++){
            for(int y = 0; y < sirinaSlike; y++){
                tabela[i][y] = sc.nextInt();
            }
        }

        int dvig = 0, spust = 0, trenutnaVisina = visinaGore(tabela, 0), prejsnaVisina;
        for(int i = 1; i < tabela[0].length; i++){
            prejsnaVisina = trenutnaVisina;
            trenutnaVisina = visinaGore(tabela, i);
            if(trenutnaVisina - prejsnaVisina > 0){
                dvig += trenutnaVisina - prejsnaVisina;
            }else{
                spust += prejsnaVisina - trenutnaVisina;
            }
        }

        System.out.println(dvig);
        System.out.println(spust);

        sc.close();
    }
}
