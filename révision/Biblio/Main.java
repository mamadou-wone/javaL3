import java.util.ArrayList;

// #  ___       __   ________  ________   _______      
// # |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
// # \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
// #  \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
// #   \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
// #    \ \____________\ \_______\ \__\\ \__\ \_______\
// #     \|____________|\|_______|\|__| \|__|\|_______|
public class Main {
    public static void main(String[] args) {
        Ouvrage ouvrage1 = new Ouvrage(1, "Boss", 2);
        Ouvrage ouvrage2 = new Ouvrage(2, "Kinza", 3);

        Auteur auteur1 = new Auteur(1, "Thioro THIAM");
        Auteur auteur2 = new Auteur(2, "Babacar NDIAYE");
        Auteur auteur3 = new Auteur(3, "Mame Fatou");

        ArrayList<Auteur> list1 = new ArrayList<Auteur>();
        list1.add(auteur1);

        ArrayList<Auteur> list2 = new ArrayList<Auteur>();
        list2.add(auteur2);
        list2.add(auteur3);
        list2.add(auteur1);

        Ecrire ecrire1 = new Ecrire(ouvrage1, list1);
        Ecrire ecrire2 = new Ecrire(ouvrage2, list2);

        // System.out.println(Ecrire.listObjet.size());
        // Ecrire.listAuteurs(ouvrage2);
        Ecrire.listOuvrages(auteur3);

    }
}
