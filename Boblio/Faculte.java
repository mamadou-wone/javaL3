import java.util.ArrayList;

public class Faculte {
    private int faculte_id;
    private String faculte_name;
    public static ArrayList<Etudiant> student_list = new ArrayList<Etudiant>();

    public Faculte(int faculte_id, String faculte_name) {
        this.faculte_id = faculte_id;
        this.faculte_name = faculte_name;
    }

    public String getFaculte_name() {
        return faculte_name;
    }

    public ArrayList<Etudiant> getStudents() {
        ArrayList<Etudiant> allStudents = new ArrayList<>();
        for (Etudiant etudiant : student_list) {
            if (etudiant.getFaculte() == this) {
                // System.out.println(etudiant.getStudent_name());
                allStudents.add(etudiant);
            }
        }
        return allStudents;
    }

    public void showStudents() {
        if (this.getStudents().size() != 0) {
            for (Etudiant etudiant : this.getStudents()) {
                System.out.println(etudiant.getStudent_name());
            }
        } else {
            System.out.println("Cette étudiant n'est inscrit dans aucune faculté");
        }
    }

}
