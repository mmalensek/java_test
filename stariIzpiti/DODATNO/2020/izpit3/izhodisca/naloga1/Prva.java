
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int vhod;
        
        Scanner sc = new Scanner(System.in);

        vhod = sc.nextInt();

        int stevec = 0;
        while(true){
            int vsotaDeliteljev = 0;
            for(int i = 1; i <= (vhod + stevec) / 2; i++){
                if((vhod + stevec) % i == 0){
                    vsotaDeliteljev += i;
                }
            }
            if(vsotaDeliteljev > vhod + stevec){
                System.out.println(vhod + stevec);
                break;
            }
            stevec++;
        }

        sc.close();
    }

    // po potrebi dopolnite ...
}
