
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 02: primera iz besedila
01, 03--06: u = 1
02, 07--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        int ukaz, stKupcev, stIzdelkov, stPonudb;

        Scanner sc = new Scanner(System.in);

        ukaz = sc.nextInt();
        stKupcev = sc.nextInt();
        stIzdelkov = sc.nextInt();
        stPonudb = sc.nextInt();

        int[] kupci = new int[stKupcev];
        int[] izdelki = new int[stIzdelkov];
        int[] kupecIzdelka = new int[stIzdelkov];
        // int[] ponudbe = new int[stPonudb];

        for(int i = 0; i < stIzdelkov; i++){
            kupecIzdelka[i] = -1;
        }

        for(int i = 0; i < stPonudb; i++){
            int indeksKupca = sc.nextInt();
            int indeksIzdelka = sc.nextInt();
            int cena = sc.nextInt();

            if(izdelki[indeksIzdelka] < cena){
                kupecIzdelka[indeksIzdelka] = indeksKupca;
                izdelki[indeksIzdelka] = cena;
            }
        }

        if(ukaz == 1){
            System.out.println(Arrays.toString(izdelki));
        }else{
            for(int i = 0; i < stIzdelkov; i++){
                if(kupecIzdelka[i] != -1){
                kupci[kupecIzdelka[i]]++;
                }
            }
            System.out.println(Arrays.toString(kupci));
        }

        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
