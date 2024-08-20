
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Tiskalnik {

        private ArrayList<String> cakProf;
        private ArrayList<String> cakDoc;
        private ArrayList<String> cakAs;        

        public Tiskalnik() {
            cakProf = new ArrayList<>();
            cakDoc = new ArrayList<>();
            cakAs = new ArrayList<>();
        }

        public void prejmi(Pedagog pedagog, String dokument) {
            if(pedagog instanceof Profesor){
                cakProf.add(dokument);
            }
            if(pedagog instanceof Docent){
                cakDoc.add(dokument);
            }
            if(pedagog instanceof Asistent){
                cakAs.add(dokument);
            }
        }

        public int dolzinaVrste() {
           return cakAs.size() + cakDoc.size() + cakProf.size();            
        }

        public int steviloDokumentov(Pedagog pedagog) {
            if(pedagog instanceof Profesor){
                return cakProf.size();
            }
            if(pedagog instanceof Docent){
                return cakDoc.size();
            }
            if(pedagog instanceof Asistent){
                return cakAs.size();
            }
            return -1;
        }

        public String natisni() {
            if(cakProf.size() > 0){
                String VRNI = cakProf.get(0);
                cakProf.removeFirst();
                return VRNI;
            }
            if(cakDoc.size() > 0){
                String VRNI = cakDoc.get(0);
                cakDoc.removeFirst();
                return VRNI;
            }
            if(cakAs.size() > 0){
                String VRNI = cakAs.get(0);
                cakAs.removeFirst();
                return VRNI;
            }
            return null;
        }

        // pomo"zne metode (po potrebi) ...
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
