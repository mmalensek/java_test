
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[89];
        predavalnice[0] = new Tretja.Garaza("G1", 124, 469);
        predavalnice[1] = new Tretja.Garaza("G2", 229, 321);
        predavalnice[2] = new Tretja.Garaza("G3", 287, 403);
        predavalnice[3] = new Tretja.Avditorna("A1", 237);
        predavalnice[4] = new Tretja.Avditorna("A2", 28);
        predavalnice[5] = new Tretja.Avditorna("A3", 169);
        predavalnice[6] = new Tretja.Racunalnica("R1", 28, 18);
        predavalnice[7] = new Tretja.Avditorna("A4", 179);
        predavalnice[8] = new Tretja.Garaza("G4", 285, 421);
        predavalnice[9] = new Tretja.Garaza("G5", 261, 211);
        predavalnice[10] = new Tretja.Racunalnica("R2", 79, 58);
        predavalnice[11] = new Tretja.Garaza("G6", 106, 448);
        predavalnice[12] = new Tretja.Avditorna("A5", 46);
        predavalnice[13] = new Tretja.Racunalnica("R3", 11, 9);
        predavalnice[14] = new Tretja.Avditorna("A6", 248);
        predavalnice[15] = new Tretja.Garaza("G7", 186, 412);
        predavalnice[16] = new Tretja.Racunalnica("R4", 75, 37);
        predavalnice[17] = new Tretja.Racunalnica("R5", 50, 41);
        predavalnice[18] = new Tretja.Garaza("G8", 76, 298);
        predavalnice[19] = new Tretja.Avditorna("A7", 233);
        predavalnice[20] = new Tretja.Garaza("G9", 76, 498);
        predavalnice[21] = new Tretja.Avditorna("A8", 156);
        predavalnice[22] = new Tretja.Avditorna("A9", 204);
        predavalnice[23] = new Tretja.Garaza("G10", 52, 179);
        predavalnice[24] = new Tretja.Avditorna("A10", 23);
        predavalnice[25] = new Tretja.Racunalnica("R6", 71, 15);
        predavalnice[26] = new Tretja.Racunalnica("R7", 93, 5);
        predavalnice[27] = new Tretja.Garaza("G11", 275, 500);
        predavalnice[28] = new Tretja.Garaza("G12", 103, 377);
        predavalnice[29] = new Tretja.Racunalnica("R8", 73, 39);
        predavalnice[30] = new Tretja.Avditorna("A11", 49);
        predavalnice[31] = new Tretja.Racunalnica("R9", 26, 1);
        predavalnice[32] = new Tretja.Racunalnica("R10", 68, 39);
        predavalnice[33] = new Tretja.Avditorna("A12", 75);
        predavalnice[34] = new Tretja.Racunalnica("R11", 66, 22);
        predavalnice[35] = new Tretja.Avditorna("A13", 223);
        predavalnice[36] = new Tretja.Avditorna("A14", 118);
        predavalnice[37] = new Tretja.Avditorna("A15", 267);
        predavalnice[38] = new Tretja.Racunalnica("R12", 35, 10);
        predavalnice[39] = new Tretja.Avditorna("A16", 21);
        predavalnice[40] = new Tretja.Avditorna("A17", 298);
        predavalnice[41] = new Tretja.Garaza("G13", 235, 405);
        predavalnice[42] = new Tretja.Garaza("G14", 219, 144);
        predavalnice[43] = new Tretja.Garaza("G15", 156, 497);
        predavalnice[44] = new Tretja.Racunalnica("R13", 82, 4);
        predavalnice[45] = new Tretja.Avditorna("A18", 239);
        predavalnice[46] = new Tretja.Garaza("G16", 218, 477);
        predavalnice[47] = new Tretja.Avditorna("A19", 61);
        predavalnice[48] = new Tretja.Avditorna("A20", 236);
        predavalnice[49] = new Tretja.Racunalnica("R14", 21, 7);
        predavalnice[50] = new Tretja.Garaza("G17", 109, 207);
        predavalnice[51] = new Tretja.Racunalnica("R15", 79, 34);
        predavalnice[52] = new Tretja.Avditorna("A21", 171);
        predavalnice[53] = new Tretja.Racunalnica("R16", 14, 7);
        predavalnice[54] = new Tretja.Racunalnica("R17", 60, 55);
        predavalnice[55] = new Tretja.Racunalnica("R18", 51, 41);
        predavalnice[56] = new Tretja.Avditorna("A22", 233);
        predavalnice[57] = new Tretja.Racunalnica("R19", 92, 10);
        predavalnice[58] = new Tretja.Racunalnica("R20", 87, 65);
        predavalnice[59] = new Tretja.Garaza("G18", 294, 135);
        predavalnice[60] = new Tretja.Avditorna("A23", 11);
        predavalnice[61] = new Tretja.Avditorna("A24", 135);
        predavalnice[62] = new Tretja.Avditorna("A25", 12);
        predavalnice[63] = new Tretja.Avditorna("A26", 49);
        predavalnice[64] = new Tretja.Garaza("G19", 67, 279);
        predavalnice[65] = new Tretja.Garaza("G20", 111, 106);
        predavalnice[66] = new Tretja.Avditorna("A27", 253);
        predavalnice[67] = new Tretja.Racunalnica("R21", 51, 51);
        predavalnice[68] = new Tretja.Avditorna("A28", 179);
        predavalnice[69] = new Tretja.Racunalnica("R22", 68, 63);
        predavalnice[70] = new Tretja.Racunalnica("R23", 53, 45);
        predavalnice[71] = new Tretja.Racunalnica("R24", 94, 21);
        predavalnice[72] = new Tretja.Avditorna("A29", 169);
        predavalnice[73] = new Tretja.Avditorna("A30", 68);
        predavalnice[74] = new Tretja.Racunalnica("R25", 55, 47);
        predavalnice[75] = new Tretja.Racunalnica("R26", 67, 13);
        predavalnice[76] = new Tretja.Garaza("G21", 263, 245);
        predavalnice[77] = new Tretja.Avditorna("A31", 33);
        predavalnice[78] = new Tretja.Avditorna("A32", 28);
        predavalnice[79] = new Tretja.Racunalnica("R27", 14, 9);
        predavalnice[80] = new Tretja.Racunalnica("R28", 30, 1);
        predavalnice[81] = new Tretja.Garaza("G22", 62, 234);
        predavalnice[82] = new Tretja.Garaza("G23", 114, 103);
        predavalnice[83] = new Tretja.Avditorna("A33", 15);
        predavalnice[84] = new Tretja.Racunalnica("R29", 12, 5);
        predavalnice[85] = new Tretja.Racunalnica("R30", 40, 11);
        predavalnice[86] = new Tretja.Racunalnica("R31", 36, 33);
        predavalnice[87] = new Tretja.Avditorna("A34", 271);
        predavalnice[88] = new Tretja.Avditorna("A35", 192);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
