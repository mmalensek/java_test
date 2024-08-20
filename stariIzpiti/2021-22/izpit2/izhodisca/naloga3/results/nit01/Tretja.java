
/*
 * tj.exe
 */

public class Tretja {

    public static abstract class Predavalnica {
        private String oznaka;
        private int stMest;

        protected Predavalnica(String oznaka, int stMest) {
            this.oznaka = oznaka;
            this.stMest = stMest;
        }

        public String vrniOznako() {
            return this.oznaka;
        }

        public int vrniSteviloMest() {
            return this.stMest;
        }

        // popravite / dopolnite ...
        public int casCiscenja() {
            int VRNI = 0;

            VRNI += this.stMest * 2;

            if(this instanceof Racunalnica){
                Racunalnica rac = (Racunalnica) this;
                VRNI += rac.vrniSteviloRacunalnikov() * 3;
            }

            if(this instanceof Garaza){
                Garaza gar = (Garaza) this;
                VRNI += gar.povrsina;
            }

            return VRNI;
        }
    }

    public static class Avditorna extends Predavalnica {

        public Avditorna(String oznaka, int stMest) {
            super(oznaka, stMest);
        }
    }

    public static class Racunalnica extends Predavalnica {
        private int stRacunalnikov;

        public Racunalnica(String oznaka, int stMest, int stRacunalnikov) {
            super(oznaka, stMest);
            this.stRacunalnikov = stRacunalnikov;
        }

        public int vrniSteviloRacunalnikov() {
            return this.stRacunalnikov;
        }
    }

    public static class Garaza extends Predavalnica {
        private int povrsina;

        public Garaza(String oznaka, int stMest, int povrsina) {
            super(oznaka, stMest);
            this.povrsina = povrsina;
        }
    }

    public static class Stavba {
        private Predavalnica[] predavalnice;

        public Stavba(Predavalnica[] predavalnice) {
            this.predavalnice = predavalnice;
        }

        public int casCiscenja() {
            int cas = 0;
            for (Predavalnica predavalnica: this.predavalnice) {
                cas += predavalnica.casCiscenja();
            }
            return cas;
        }

        public int[] razporedi(int stStudentov, int[] ostanek) {
            int[] zasedenost = new int[predavalnice.length];
            int preostaliStudenti = stStudentov;

            // Najprej zapolnimo avditorne predavalnice
            for (int i = 0; i < predavalnice.length; i++) {
                if (predavalnice[i] instanceof Avditorna) {
                    int stMest = predavalnice[i].vrniSteviloMest();
                    if (preostaliStudenti >= stMest) {
                        zasedenost[i] = stMest;
                        preostaliStudenti -= stMest;
                    } else {
                        zasedenost[i] = preostaliStudenti;
                        preostaliStudenti = 0;
                    }
                }
            }

            // Nato zapolnimo računalniške predavalnice
            for (int i = 0; i < predavalnice.length; i++) {
                if (predavalnice[i] instanceof Racunalnica) {
                    int stMest = predavalnice[i].vrniSteviloMest();
                    if (preostaliStudenti >= stMest) {
                        zasedenost[i] = stMest;
                        preostaliStudenti -= stMest;
                    } else {
                        zasedenost[i] = preostaliStudenti;
                        preostaliStudenti = 0;
                    }
                }
            }

            // Nazadnje zapolnimo garaže
            for (int i = 0; i < predavalnice.length; i++) {
                if (predavalnice[i] instanceof Garaza) {
                    int stMest = predavalnice[i].vrniSteviloMest();
                    if (preostaliStudenti >= stMest) {
                        zasedenost[i] = stMest;
                        preostaliStudenti -= stMest;
                    } else {
                        zasedenost[i] = preostaliStudenti;
                        preostaliStudenti = 0;
                    }
                }
            }

            // Vpišemo število nerazporejenih študentov v celico tabele ostanek z indeksom 0
            ostanek[0] = preostaliStudenti;

            return zasedenost;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
