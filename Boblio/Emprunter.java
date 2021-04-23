import java.time.LocalDate;
import java.util.ArrayList;

public class Emprunter {
    private Etudiant etudiant;
    private Ouvrage ouvrage;
    private LocalDate date_emprunt;
    private LocalDate date_retour;
    public static ArrayList<Emprunter> listEmprunt = new ArrayList<>();

    public Emprunter(Etudiant etudiant, Ouvrage ouvrage, LocalDate date_emprunt, LocalDate date_retour) {
        this.etudiant = etudiant;
        this.ouvrage = ouvrage;
        this.date_emprunt = date_emprunt;
        this.date_retour = date_retour;
        listEmprunt.add(this);

        // if (!etudiant.getListOuvres().contains(ouvrage)) {
        // etudiant.getListOuvres().add(ouvrage);
        // }
    }

    public void AfficheList(Etudiant etudiant) {
        for (Emprunter emprunter : listEmprunt) {
            if (etudiant == emprunter.getEtudiant()) {
                System.out.println(emprunter.ouvrage.getNom_ouvrage());
            }
        }
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

}
