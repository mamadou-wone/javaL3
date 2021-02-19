public class EtudiantEtranger extends Etudiant{
    private String pays;
    

    public EtudiantEtranger(String nom, String prenom, int age, String pays){
        super(nom, prenom, age);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }

    public void affiche(){
        System.out.println("Nom : " + this.getNom() + " " + "Prénom: " + this.getPrenom() + " " + "Pays:: " + this.getPays());
    }
}
