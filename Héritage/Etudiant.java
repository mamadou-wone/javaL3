// package Héritage;

public class Etudiant {
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void affiche(){
        System.out.println("Nom : " + this.getNom() + " " + "Prénom: " + this.getPrenom() + " " + "Age: " + this.age);
    }

    // public void afficheNationaux() {
    //     if (this.pays == null) {
    //         System.out.println("Nom : " + this.getNom() + " " + "Prénom: " + this.getPrenom() + " " + "Age: " + this.age);
    //     }
    // }

    // public void afficheEtranger() {
    //     if (this.getPays() != null) {
    //         System.out.println("Nom : " + this.getNom() + " " + "Prénom: " + this.getPrenom() + " " + "Age: " + this.age + " "
    //                 + "Etudiant Etrangé");
    //     }
    // }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // public String getPays() {
    //     if (this.pays == null) {
    //         System.out.println("C'est un étudiant national");
    //     }
    //     return pays;
    // }

}
