
import java.util.*;

public class Prva {

    public static int vsotaStevk(int stevilka){
        int vsota = 0;

        while(stevilka > 0){
            vsota += stevilka % 10;
            stevilka /= 10;
        }

        return vsota;
    }

    public static void main(String[] args) {
        int dolzina, vsotaStevk;

        Scanner sc = new Scanner(System.in);

        dolzina = sc.nextInt();
        vsotaStevk = sc.nextInt();

        int najmanjsi = (int) Math.pow(10, (double) dolzina - 1);
        int najvecji = (int) Math.pow(10, (double) dolzina);
        
        for(int i = najmanjsi; i < najvecji; i++){
            if(vsotaStevk(i) == vsotaStevk){
                System.out.println(i);
                break;
            }
        }
    
        sc.close();
    }
}
