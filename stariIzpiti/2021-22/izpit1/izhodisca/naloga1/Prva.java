
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int spMeja, zgMeja;
        spMeja = sc.nextInt();
        zgMeja = sc.nextInt();

        int stChenovih = 0;

        boolean jePrastevilo, jeChenovo;
        int stDeliteljev;

        for(int i = spMeja; i <= zgMeja; i++){
            jePrastevilo = true;
            stDeliteljev = 0;

            // ali je PRAŠTEVILO
            for(int y = 1; y <= i / 2; y++){
                if(i % y == 0){
                    stDeliteljev++;
                }
                if(stDeliteljev > 1){
                    jePrastevilo = false;
                    break;
                }
            }

            // ali je CHENOVO
            if(jePrastevilo){
                jeChenovo = true;
                stDeliteljev = 0;
                for(int y = 1; y <= (i + 2) / 2; y++){
                    if((i + 2) % y == 0){
                        stDeliteljev++;
                        // System.out.println(i + ":" + y);
                    }
                    if(stDeliteljev > 3){
                        jeChenovo = false;
                        break;
                    }
                }
                if(jeChenovo){
                stChenovih++;
                }    
            }
        }

        System.out.println(stChenovih);

        sc.close();
    }

}
