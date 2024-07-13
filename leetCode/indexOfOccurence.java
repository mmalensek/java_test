public class indexOfOccurence{
    
    public int strStr(String haystack, String needle) {
        int indeks = -1;

        int A_dolzina = haystack.length();
        int B_dolzina = needle.length();

        boolean jeVeljaven = true;

        for(int i = 0; i < A_dolzina - B_dolzina + 1; i++){
            jeVeljaven = true;
            for(int y = 0; y < B_dolzina; y++){
                if(haystack.charAt(i + y) != needle.charAt(y)){
                    jeVeljaven = false;
                    break;
                }
            }
            if(jeVeljaven){
                return i;
            }
        }

        return indeks;
    }
    
    public static void main(String[] args) {
        
    }
}