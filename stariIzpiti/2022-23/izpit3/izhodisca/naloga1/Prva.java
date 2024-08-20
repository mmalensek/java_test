
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: zamik = 0
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trenutni = 0, visina = 0, stevecPresledkov = 0;

        while(sc.hasNext()){
            trenutni = sc.nextInt();
            if(trenutni == 2){
                visina++;
                if(sc.hasNext()){
                stevecPresledkov = 0;
                }
            }
            if(trenutni == 0){
                stevecPresledkov++;
            }
        }

        System.out.println(visina);
        System.out.println(stevecPresledkov);

        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
