
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int prvaSkatla, drugeSkatle, ISKANA;

        Scanner sc = new Scanner(System.in);

        prvaSkatla = sc.nextInt();
        drugeSkatle = sc.nextInt();
        ISKANA = sc.nextInt();

        ISKANA -= prvaSkatla;
        int i = 1;
        while(ISKANA > 0){
            prvaSkatla += drugeSkatle;
            ISKANA -= prvaSkatla;
            i++;
        }
        System.out.println(i);

        sc.close();
    }
}
