
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int stSolat, stKupcev, trenutneSolate, indeks = 1;

        Scanner sc = new Scanner(System.in);

        stSolat = sc.nextInt();
        trenutneSolate = stSolat;
        stKupcev = sc.nextInt();

        for(int i = 0; i < stKupcev; i++){
            int trenutniKupec = sc.nextInt();

            if(trenutneSolate - trenutniKupec < 0){
                indeks++;
                trenutneSolate = stSolat - trenutniKupec;
            }else{
                trenutneSolate -= trenutniKupec;
            }

        }

        System.out.println(indeks);

        sc.close();
    }
}
