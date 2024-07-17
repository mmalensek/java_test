import java.util.HashSet;

public class singleNumber {
    
    public int[] singleNumbers(int[] nums) {

        HashSet<Integer> mnozica = new HashSet<>();

        for(int i : nums){
            if(mnozica.add(i) == false){
                mnozica.remove(i);
            }
        }

        int[] VRNI = new int[mnozica.size()];
        
        int indeks = 0;
        for(int i : mnozica){
            VRNI[indeks] = i;
            indeks++;
        }

        return VRNI;
    }
    
}
