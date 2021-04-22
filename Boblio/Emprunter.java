import java.time.LocalDate;

public class Emprunter {
    private Etudiant etudiant;
    private Auteur author;
    private LocalDate date_emprunt;
    private LocalDate date_retour;

    public Emprunter(Etudiant etudiant, Auteur author, LocalDate date_emprunt, LocalDate date_retour) {
        this.etudiant = etudiant;
        this.author = author;
        this.date_emprunt = date_emprunt;
        this.date_retour = date_retour;
    }

}
