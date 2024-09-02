
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {
    
    public static void main(String[] args) {
        int visina, sirina, navzdol, desno, zeljenoStDreves;

        Scanner sc = new Scanner(System.in);

        visina = sc.nextInt();
        sirina = sc.nextInt();
        navzdol = sc.nextInt();
        desno = sc.nextInt();
        zeljenoStDreves = sc.nextInt();

        int[][] tabelaPravokotnika = new int[visina][sirina];

        for(int i = 0; i < visina; i++){
            for(int y = 0; y < sirina; y++){
                tabelaPravokotnika[i][y] = sc.nextInt();
            }
        }

        int stevecDreves = 0, stevecUr = 10000;
        for(int i = 0; i < 10000; i++){
            if(tabelaPravokotnika[(i * navzdol) % visina][(i * desno) % sirina] == 1){
                stevecDreves++;
            }
            if(stevecDreves == zeljenoStDreves){
                stevecUr = i;
                break;
            }
        }

        System.out.println(stevecUr);

        sc.close();
    }
}
