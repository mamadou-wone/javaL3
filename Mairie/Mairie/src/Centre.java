import java.util.ArrayList;

public class Centre {
    private int centre_id;
    private String centre_nom;
    private String address;
    private String arrondissement;
    public static ArrayList<Integer> all_ID = new ArrayList<Integer>();

    public Centre(int center_id, String center_nom, String address, String arrondissement) {
        if (!all_ID.contains(center_id)) {
            all_ID.add(center_id);
            this.centre_id = center_id;
            this.centre_nom = center_nom;
            this.address = address;
            this.arrondissement = arrondissement;
        } else {
            System.out.println("Impossible de créer ce Centre car l'Identifiant utilisé existe déjà!");
        }

    }

}
