import java.util.ArrayList;

public class Medicament {
    private String code;
    private String libelle; 
    public static ArrayList<String> allID = new ArrayList<String>();
    
    Medicament(String code, String libelle){
        try {
            if(!allID.contains(code)){
                this.code = code;
                this.libelle = libelle;
                allID.add(code);
            }else{
                System.out.println("Il y'a une redondance sur lees identifiants");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }


}
