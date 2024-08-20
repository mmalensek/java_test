public class avto implements printable{
    private String znamka;
    private int cena;

    public avto(String znamka, int cena){
        this.znamka = znamka;
        this.cena = cena;
    }

    // dodano za lambdo ime in cena
    public void print(String znamka, int cena){};
        // System.out.println("Avto je znamke " + this.znamka + " in stane " + this.cena + " eurov.");
}
