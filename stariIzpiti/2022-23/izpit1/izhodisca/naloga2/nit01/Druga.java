
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01: primer iz besedila
02..04: vsaka beseda je sestavljena iz ene same "crke
01, 05..10: splo"sni primeri

01, 02, 05, 06: ro"cno izdelani
*/

import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
        char[][] tabela = new char[100][100];

        for(int i = 0; i < besede.length; i++){
            int X = Character.getNumericValue(polozaji[i][0]);
            int Y = Character.getNumericValue(polozaji[i][1]);
            for(int y = 0; y < besede[i].length; y++){
                if(polozaji[i][2] == 'v'){
                    if(tabela[X][Y + y] == '\u0000'){
                        tabela[X][Y + y] = besede[i][y];
                    }else{
                        if(tabela[X][Y + y] != besede[i][y]){
                            return false;
                        }
                    }
                }else{
                    if(tabela[X + y][Y] == '\u0000'){
                        tabela[X + y][Y] = besede[i][y];
                    }else{
                        if(tabela[X + y][Y] != besede[i][y]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
