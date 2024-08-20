
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int max = 0, trenutniMax = 0, prvi, drugi;
        
        Scanner sc = new Scanner(System.in);

        prvi = sc.nextInt();
        drugi = prvi;
        prvi = sc.nextInt();

        max = prvi + drugi;
        trenutniMax = max;

        while(sc.hasNext()){
            trenutniMax -= drugi;
            drugi = prvi;
            prvi = sc.nextInt();
            trenutniMax += prvi;

            if(trenutniMax > max){
                max = trenutniMax;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
