// #  ___       __   ________  ________   _______      
// # |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
// # \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
// #  \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
// #   \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
// #    \ \____________\ \_______\ \__\\ \__\ \_______\
// #     \|____________|\|_______|\|__| \|__|\|_______|

public class main {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("WONE", "Mamadou", 21);
        Etudiant etudiant1 = new Etudiant("WONE1", "Mamadou", 21);
        Etudiant etudiant2 = new Etudiant("WONE2", "Mamadou", 21);
        Etudiant etudiant3 = new Etudiant("WONE3", "Mamadou", 21);
        EtudiantEtranger etudiantEtranger = new EtudiantEtranger("THIAM", "Thioro", 21, "Canada");
        EtudiantSportif etudiantSportif = new EtudiantSportif("TOURE", "Mouhamed", 25, "Ténis");
        // System.out.println(etudiantSportif.getNom());
        // etudiant.affiche();
        // etudiantEtranger.affiche();
        // etudiantSportif.affiche();
        
        GroupeTD groupeTD = new GroupeTD("Java");
        GroupeTD groupeTD2 = new GroupeTD("Java2EE");
        groupeTD.ajouterEtudiant(etudiantEtranger);
        groupeTD.ajouterEtudiant(etudiant);
        groupeTD.ajouterEtudiant(etudiant);
        groupeTD.ajouterEtudiant(etudiant2);
        groupeTD.ajouterEtudiant(etudiant3);
       // groupeTD.ajouterEtudiant(etudiantSportif);
        groupeTD.test();
    }
}
