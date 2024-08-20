
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        int stVrstic, aliSlediBeseda;
        String beseda;

        Scanner sc = new Scanner(System.in);

        ArrayList<String> tabelaImen = new ArrayList<>();

        stVrstic = sc.nextInt();
        aliSlediBeseda = sc.nextInt();

        if(aliSlediBeseda == 2){
            beseda = sc.next();
            ArrayList<Integer> cene = new ArrayList<>();
            for(int i = 0; i < stVrstic; i++){
                String imeOsebe = sc.next();
                String predmet = sc.next();
                int cena = sc.nextInt();

                if(beseda.equals(predmet)){
                    boolean jeDodano = false;
                    for(int y = 0; y < cene.size(); y++){
                        if(cene.get(y) > cena){
                            cene.add(y, cena);
                            tabelaImen.add(y, imeOsebe);
                            jeDodano = true;
                            break;
                        }
                    }
                    if(jeDodano == false){
                        cene.add(cena);
                        tabelaImen.add(imeOsebe);
                    }
                }

            }
        }

        if(aliSlediBeseda == 1){
            for(int i = 0; i < stVrstic; i++){
                String imeOsebe = sc.next();
                if(tabelaImen.contains(imeOsebe) == false){
                    tabelaImen.add(imeOsebe);
                }
                sc.next();
                sc.next();
            }
            Collections.sort(tabelaImen);
        }

        for(int i = 0; i < tabelaImen.size(); i++){
            System.out.println(tabelaImen.get(i));
        }

        sc.close();
    }
}
