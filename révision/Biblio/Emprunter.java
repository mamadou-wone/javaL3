import java.util.ArrayList;

public class Emprunter {
    private Etudiant etudiant;
    private ArrayList<Ouvrage> ouvrages = new ArrayList<>();

    public Emprunter(Etudiant etudiant, ArrayList<Ouvrage> ouvrage) {
        this.etudiant = etudiant;
        this.ouvrages = ouvrage;
        etudiant.setOuvrageEmprumter(ouvrage);
    }
}
