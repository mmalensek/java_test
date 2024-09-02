
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int stVrstic;

        Scanner sc = new Scanner(System.in);

        stVrstic = sc.nextInt();

        for(int i = 0; i < stVrstic; i++){
            boolean veljaPadajoce = true;
            int stevilka = sc.nextInt();

            int prejsnaStevka, trenutnaStevka = 0;

            while(stevilka > 0){
                prejsnaStevka = trenutnaStevka;
                trenutnaStevka = stevilka % 10;
                stevilka /= 10;

                if(trenutnaStevka < prejsnaStevka){
                    veljaPadajoce = false;
                    break;
                }
            }

            if(veljaPadajoce){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }

        sc.close();
    }
}
