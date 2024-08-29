
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int stevec = 0, prejsneStevilo, novoStevilo;
        boolean niDeljiv = false;
        Scanner sc = new Scanner(System.in);

        novoStevilo = sc.nextInt();
        while(sc.hasNext()){
            prejsneStevilo = novoStevilo;
            novoStevilo = sc.nextInt();
            stevec++;
            if(novoStevilo % prejsneStevilo != 0){
                System.out.println(stevec);
                niDeljiv = true;
                break;
            }
            
        }
        if(!niDeljiv){
            System.out.println(stevec + 1);
        }
        sc.close();
    }

    // po potrebi dopolnite ...
}
