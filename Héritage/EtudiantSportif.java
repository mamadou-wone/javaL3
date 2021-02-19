public class EtudiantSportif extends Etudiant {
    private String sport_name;

    public EtudiantSportif(String nom, String prenom, int age, String sport_name) {
        super(nom, prenom, age);
        this.sport_name = sport_name;
    }

    public String getSport_name() {
        return sport_name;
    }

    public void affiche() {
        System.out.println(
                "Nom : " + this.getNom() + " " + "Prénom: " + this.getPrenom() + " " + "Sport: " + this.getSport_name());
    }

}
