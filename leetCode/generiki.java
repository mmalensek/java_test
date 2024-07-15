public class generiki <T>{ 
    // T - type
    // lahko tudi <T extends liki>
    
    T vrednost;

    public generiki(){
    }
    public generiki(T vrednost){
        this.vrednost = vrednost;
    }

    public void natisni(){
        System.out.println(vrednost);
    }
}
