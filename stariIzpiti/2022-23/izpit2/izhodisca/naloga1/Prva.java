
/*
Samodejno testiranje:
tj.exe Prva.java . .

Javni testni primeri:
01: primer iz besedila
02-04: vsa "stevila so enomestna
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int stParov, VRNI = 0;

        Scanner sc = new Scanner(System.in);

        stParov = sc.nextInt();

        for(int i = 0; i < stParov; i++){
            String prvi = Integer.toString(sc.nextInt());
            String drugi = Integer.toString(sc.nextInt());
            
            for(int y = 0; y < prvi.length(); y++){
                if(prvi.charAt(y) >= drugi.charAt(y)){
                    break;
                }else if(y + 1 == prvi.length()){
                    VRNI++;
                }
            }
        }

        System.out.println(VRNI);

        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
