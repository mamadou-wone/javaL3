import java.util.ArrayList;
//   ___       __   ________  ________   _______      
//  |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
//  \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
//   \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
//    \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
//     \ \____________\ \_______\ \__\\ \__\ \_______\
//      \|____________|\|_______|\|__| \|__|\|_______|

public class Medicament {
    private String code;
    private String libelle;
    public static ArrayList<String> allID = new ArrayList<String>();

    Medicament(String code, String libelle) {
        try {
            if (!allID.contains(code)) {
                this.code = code;
                this.libelle = libelle;
                allID.add(code);
            } else {
                System.out.println("Il y'a une redondance sur lees identifiants");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

}
