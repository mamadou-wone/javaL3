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

    public void getStudents() {
        boolean isPresent = false;
        for (Etudiant etudiant : student_list) {
            if (etudiant.getFaculte() == this) {
                isPresent = true;
                System.out.println(etudiant.getStudent_name());
            } else {
                isPresent = false;
            }
        }
        if (isPresent) {
            System.out.println("Noooooo");
        }

    }

}
