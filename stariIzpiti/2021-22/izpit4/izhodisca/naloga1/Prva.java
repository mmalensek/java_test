
/*
 * Samodejno testiranje:
 * tj.exe Prva.java . .
 *
 * Javni testni primeri:
 * 01, 02: primera iz besedila
 * 03..10: splo"sni primeri
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int visina, minDolzina;

        Scanner sc = new Scanner(System.in);

        visina = sc.nextInt();
        minDolzina = sc.nextInt();

        for(int i = 0; i < visina; i++){
            if(i == 0){
                for(int y = 0; y < minDolzina + visina - 1; y++){
                    if(y < visina - 1){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }else if(i + 1 == visina){
                for(int y = 0; y < minDolzina + 2 * (visina - 1); y++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int y = 0; y < minDolzina + 2 * (visina - 1); y++){
                    if(y == visina - i - 1){
                        System.out.print("*");
                    }else if(y == visina + minDolzina + i - 2){
                        System.out.println("*");
                        break;
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        }

        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
