
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int stPloscin;

        Scanner sc = new Scanner(System.in);

        stPloscin = sc.nextInt();

        for(int i = 0; i < stPloscin; i++){
            int ploscina = sc.nextInt();
            boolean jeSkoraj = false;

            for(int y = 1; y <= ploscina / 2; y++){
                
                if(y > ploscina / (2 * y) && y * (ploscina / y) == ploscina && y <= ploscina / y){
                    jeSkoraj = true;
                    //System.out.println("Ploscina: "+ploscina+"; A: "+y+"; B: "+ploscina / y+".");
                    break;
                }
            }

            if(jeSkoraj){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }

        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
