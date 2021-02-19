import java.net.SocketOption;

public class GroupeTD {
    private String groupe_name;
    private int maxEtudiant = 0;
    private Etudiant[] etudiants = new Etudiant[5];

    public GroupeTD(String groupe_name){
        this.groupe_name = groupe_name;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }
    
    public void setMaxEtudiant(int maxEtudiant) {
        this.maxEtudiant = maxEtudiant;
    }

    public void test(){
        for (int i = 0; i < this.etudiants.length; i++) {
            try {
                System.out.println(this.etudiants[i].getNom());
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("vide");
            }
        }
    }

    public boolean isPresent(Etudiant etudiant){
        for (int i = 0; i <this.etudiants.length ; i++) {
            if (this.etudiants[i] == etudiant){
                return true;
            }
        }
        return false;
    }

    public void ajouterEtudiant(Etudiant etudiant){
        try {
            if (!this.isPresent(etudiant)){
                this.etudiants[this.maxEtudiant] = etudiant;
                this.setMaxEtudiant(this.maxEtudiant + 1);
                //System.out.println(this.maxEtudiant);
            }else {
                System.out.println("Cette  Etudiants est dans la liste");
            }

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Le groupe est plein créez en un nouveaux");
        }
    }
}
