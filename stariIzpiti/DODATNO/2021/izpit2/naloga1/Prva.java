
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        int visinaFaktor, sirinaFaktor;

        Scanner sc = new Scanner(System.in);

        visinaFaktor = sc.nextInt();
        sirinaFaktor = sc.nextInt();

        for(int i = 0; i < 5 * visinaFaktor; i++){
            for(int y = 0; y < 4 * sirinaFaktor; y++){
                if(i < 2 * visinaFaktor || i >= 3 * visinaFaktor){
                    if(y < sirinaFaktor || y >= 3 * sirinaFaktor){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}
