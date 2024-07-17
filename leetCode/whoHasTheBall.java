public class whoHasTheBall{
    
    public int numberOfChild(int n, int k) {
        if(k < n){
            return k;
        }

        if((k / n) % 2 == 0){
            return n - k;
        }else{
            return n + k;
        }
    }

    public static void main(String[] args) {
        
    }
}