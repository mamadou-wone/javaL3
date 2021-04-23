import java.util.ArrayList;

public class Ouvrage {
    private int ouvrage_id;
    private String nom_ouvrage;
    private int number_interne;
    private ArrayList<Auteur> list_author = new ArrayList<Auteur>();

    public Ouvrage(int number_interne, String nom_ouvrage, int ouvrage_id) {
        this.number_interne = number_interne;
        this.nom_ouvrage = nom_ouvrage;
        this.ouvrage_id = ouvrage_id;
    }

    public ArrayList<Auteur> getList_author() {
        return this.list_author;
    }

    public void add(ArrayList<Auteur> authors) {
        for (Auteur auteur : authors) {
            this.getList_author().add(auteur);
        }
    }

    public void listAuthor() {
        for (Auteur auteur : this.list_author) {
            System.out.println(auteur.getAuthor_name());
        }
    }

    public String getNom_ouvrage() {
        return nom_ouvrage;
    }
}