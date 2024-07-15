
public class avto implements printable{
    private String znamka;
    private int cena;

    public avto(String znamka, int cena){
        this.znamka = znamka;
        this.cena = cena;
    }

    public void print(){
        System.out.println("Avto je znamke " + this.znamka + " in stane " + this.cena + " eurov.");
    }
}
