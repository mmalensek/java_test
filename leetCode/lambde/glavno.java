public class glavno {
    public static void main(String[] args) {
        
        // brez lambde
        // avto hjundaj = new avto("Hyundai", 15000);
        // hjundaj.print();

        // z lambdo, samo take interface ki definirajo eno abstraktno metodo
        // oziroma functional interface
        // (arguments) -> {statement/s}

        String znamka = "Kia";
        int cena = 18000;

        printable kia = (ime, stevilka) -> {
            System.out.println("Znamka: " + ime + ", in stane: " + stevilka + ".");
        };

        kia.print(znamka, cena);
    }
}
