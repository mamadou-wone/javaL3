import java.util.ArrayList;

public class Membre {
    private int membre_id;
    private String membre_nom;
    private Centre centre;

    public Membre(int membre_id, String membre_nom) {
        if (!all_ID.contains(membre_id)) {
            this.membre_id = membre_id;
            this.membre_nom = membre_nom;
        } else {
            System.out.println("Impossible de créer ce membre");
        }
    }

    public int getMembre_id() {
        return this.membre_id;
    }

    public void setMembre_id(int membre_id) {
        this.membre_id = membre_id;
    }

    public String getMembre_nom() {
        return this.membre_nom;
    }

    public void setMembre_nom(String membre_nom) {
        this.membre_nom = membre_nom;
    }

    public Centre getCentre() {
        return this.centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public static ArrayList<Integer> all_ID = new ArrayList<Integer>();

}
