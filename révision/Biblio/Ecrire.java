import java.util.ArrayList;

public class Ecrire {

    private Ouvrage ouvrage;
    private ArrayList<Auteur> auteurs = new ArrayList<Auteur>();
    public static ArrayList<Ecrire> listObjet = new ArrayList<Ecrire>();

    public Ecrire(Ouvrage ouvrage, ArrayList<Auteur> auteurs) {
        this.ouvrage = ouvrage;
        this.auteurs = auteurs;
        listObjet.add(this);
    }

    public static void listAuteurs(Ouvrage ouvrage) {
        for (Ecrire ecrire : listObjet) {
            if (ecrire.ouvrage == ouvrage) {
                for (Auteur auteurs : ecrire.auteurs) {
                    System.out.println(auteurs.getName());
                }
            }
        }
        // for (int i = 0; i < listObjet.size(); i++) {
        // if (listObjet.get(i).ouvrage == ouvrage) {
        // for (int j = 0; j < listObjet.get(i).auteurs.size(); j++) {
        // System.out.println(listObjet.get(i).auteurs.get(j).getName());
        // }
        // }
        // }
    }

    public static void listOuvrages(Auteur auteur) {
        for (Ecrire ecrire : listObjet) {
            for (Auteur auteurs : ecrire.auteurs) {
                if (auteurs == auteur) {
                    System.out.println(ecrire.ouvrage.getTitle());
                }
            }
        }
    }

}
