
public class encryptedString {
    public String getEncryptedString(String s, int k) {

        char[] tabela = s.toCharArray();
        char[] spreminjajoca = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            spreminjajoca[i] = tabela[(i + k) % s.length()];
        }

        String VRNI = new String(spreminjajoca);
        return VRNI;
    }

    public static void main(String[] args) {
        String ime = "Urša";
        
        encryptedString encryptedString = new encryptedString();

        System.out.println(encryptedString.getEncryptedString(ime, 1));
    }
}
