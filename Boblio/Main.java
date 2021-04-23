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
        Auteur author1 = new Auteur(1, "Mamadou WONE");
        Auteur author2 = new Auteur(2, "Thioro THIAM");
        Auteur author3 = new Auteur(3, "Fatou Kine NDIAYE");
        Auteur author4 = new Auteur(4, "Mouhamed TOURE");
        Auteur author5 = new Auteur(5, "Khaly DIENG");
        Auteur author6 = new Auteur(6, "Joua DIAME");

        Ouvrage ouvrage1 = new Ouvrage(1, "Boss", 2);
        ArrayList<Auteur> ouvrage1Author = new ArrayList<>();
        ouvrage1Author.add(author1);
        ouvrage1Author.add(author2);

        ouvrage1.add(ouvrage1Author);
        // ouvrage1.listAuthor();

        Ouvrage ouvrage2 = new Ouvrage(1, "Boss", 2);

        Ouvrage ouvrage3 = new Ouvrage(2, "TDSI", 5);
        Ouvrage ouvrage4 = new Ouvrage(2, "TDSI", 5);

        Faculte facScience = new Faculte(1, "FST");
        Faculte facLettre = new Faculte(2, "FASEG");
        Faculte facSeg = new Faculte(3, "LETTRE");
        Faculte facMedecine = new Faculte(4, "Pharmacie");

        Etudiant etudiant1 = new Etudiant(1, "Adama DIENG");
        Etudiant etudiant2 = new Etudiant(2, "Korka BA");
        Etudiant etudiant3 = new Etudiant(3, "Makane FALL");
        Etudiant etudiant4 = new Etudiant(4, "Badiéne COURA");

        etudiant1.setFaculte(facScience);
        etudiant2.setFaculte(facScience);
        etudiant4.setFaculte(facLettre);

        // System.out.println(Faculte.student_list.size());
        // facScience.getStudents();
        // facLettre.getStudents();
        // facSeg.showStudents();
        facScience.showStudents();

    }
}
