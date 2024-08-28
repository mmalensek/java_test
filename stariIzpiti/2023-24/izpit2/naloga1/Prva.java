
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
        int A, B, stStevil, trenutnoStevilo;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        stStevil = sc.nextInt();

        for(int i = 0; i < stStevil; i++){
            boolean seDa = false;
            trenutnoStevilo = sc.nextInt();

            for(int y = 0; y < trenutnoStevilo; y++){
                if(seDa){
                    break;
                }
                for(int z = 0; z < trenutnoStevilo; z++){
                    if(Math.pow(A, y) * Math.pow(B, z) == trenutnoStevilo){
                        seDa = true;
                        break;
                    }
                    if(Math.pow(A, y) * Math.pow(B, z) > trenutnoStevilo){
                        break;
                    }
                }
            }

            if(seDa){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }

        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
