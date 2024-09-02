
import java.util.*;

public class Tretja {

    public static class Oddajnik {
        ArrayList<Sprejemnik> sprejemniki = new ArrayList<>();
        
        public void dodajSprejemnika(Sprejemnik sprejemnik){
            sprejemniki.add(sprejemnik);
        }

        public void oddaj(char crka){
            for(int i = 0; i < sprejemniki.size(); i++){
                sprejemniki.get(i).sprejem.add(crka);
                sprejemniki.get(i).indeks++;
            }
        }
    }

    public static class Sprejemnik {
        int indeks;
        int zadnjiIndeks;
        Oddajnik oddajnik;
        ArrayList<Character> sprejem = new ArrayList<>();

        public Sprejemnik(Oddajnik oddajnik){
            this.oddajnik = oddajnik;
            indeks = 0;
            zadnjiIndeks = 0;
            oddajnik.dodajSprejemnika(this);
        }

        public int koliko(){
            return sprejem.size();
        }

        public String odZadnjic(){
            String VRNI = "";
            for(int i = zadnjiIndeks; i < indeks; i++){
                VRNI += sprejem.get(i);
            }
            zadnjiIndeks = indeks;
            return VRNI;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
