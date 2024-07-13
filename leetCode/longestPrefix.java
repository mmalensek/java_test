public class longestPrefix {
    
    public String longestCommonPrefix(String[] strs) {
        String vrnitev = "";
        boolean jePrefix = true;

        int min = 9999;
        for(int i = 0; i < strs.length; i++){
            if(min > strs[i].length()){
                min = strs[i].length();
            }
        }

        for(int i = 0; i < min; i++){
            for(int y = 0; y < strs.length - 1; y++){
                if(strs[y].charAt(i) != strs[y + 1].charAt(i)){
                    jePrefix = false;
                    break;
                }
            }
            if(jePrefix){
            vrnitev = vrnitev + strs[0].charAt(i);
            }else{
                break;
            }
        }

        return vrnitev;
    }

    public static void main(String[] args) {
        
    }
}
