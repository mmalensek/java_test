public class rimskeStevke {
    
    public int romanToInt(String s) {
        int rezultat = 0;

        char[] znaki = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && ((znaki[i] == 'I' && (znaki[i + 1] == 'V') || znaki[i + 1] == 'X') || (znaki[i] == 'X' && (znaki[i + 1] == 'L') || znaki[i + 1] == 'C')) || (znaki[i] == 'C' && (znaki[i + 1] == 'D') || znaki[i + 1] == 'M')){
                if(znaki[i] == 'I'){
                    if(znaki[i + 1] == 'V'){
                        rezultat += 4;
                    }else{
                        rezultat += 9;
                    }
                    i++;
                }else if(znaki[i] == 'X'){
                    if(znaki[i + 1] == 'V'){
                        rezultat += 40;
                    }else{
                        rezultat += 90;
                    }
                    i++;
                }else{
                    if(znaki[i + 1] == 'C'){
                        rezultat += 400;
                    }else{
                        rezultat += 900;
                    }
                    i++;
                }
            }else{
                if(znaki[i] == 'I'){
                    rezultat += 1;
                }
                if(znaki[i] == 'V'){
                    rezultat += 5;
                }
                if(znaki[i] == 'X'){
                    rezultat += 10;
                }
                if(znaki[i] == 'L'){
                    rezultat += 50;
                }
                if(znaki[i] == 'C'){
                    rezultat += 100;
                }
                if(znaki[i] == 'D'){
                    rezultat += 500;
                }
                if(znaki[i] == 'M'){
                    rezultat += 1000;
                }
            }
        }
    
        return rezultat;
    }

    public static void main(String[] args) {
        
    }
}
