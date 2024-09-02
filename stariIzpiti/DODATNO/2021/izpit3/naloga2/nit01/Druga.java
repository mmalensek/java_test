
import java.util.*;

public class Druga {

    public static int najdiNajvecjegaAliNE(int visina, int sirina, int[] a, int[] b){
        int maxPloscina = visina * sirina;
        int maxTabele = 0;
        int indeks = -1;

        for(int i = 0; i < a.length; i++){
            int trenutnaPloscina = a[i] * b[i];
            if(trenutnaPloscina <= maxPloscina && trenutnaPloscina > maxTabele && (((a[i] <= visina && b[i] <= sirina)) || (a[i] <= sirina && b[i] <= visina))){
                maxTabele = trenutnaPloscina;
                indeks = i;
            }
        }

        if(indeks != -1){
            a[indeks] = 0;
            b[indeks] = 0;
            return indeks;
        }

        return -1;
    }

    public static int steviloShranjenih(int[] h, int[] w, int[] a, int[] b) {
        int kolikoPredmetovDaNotr = 0;
        boolean jeNasel = true;

        for(int i = 0; i < h.length; i++){
            for(int y = 0; y < w.length; y++){
                if(najdiNajvecjegaAliNE(h[i], w[y], a, b) != -1){
                    kolikoPredmetovDaNotr++;
                }else{
                    jeNasel = false;
                    break;
                }
            }
            if(!jeNasel){
                break;
            }
        }

        return kolikoPredmetovDaNotr;
    }
}
