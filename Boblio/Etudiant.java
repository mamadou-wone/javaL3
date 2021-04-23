import java.util.ArrayList;

public class Etudiant {
    private int student_id;
    private String student_name;
    private Faculte faculte;
    private ArrayList<Ouvrage> listOuvres = new ArrayList<>();

    public Etudiant(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
        if (!Faculte.student_list.contains(this)) {
            Faculte.student_list.add(this);
        } else {
            System.out.println("Cette Etudiant figure déjà dans la liste");
        }
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public String getStudent_name() {
        return student_name;
    }

    public ArrayList<Ouvrage> getListOuvres() {
        return listOuvres;
    }

    // public void afficherOuvrage() {
    // if (this.getListOuvres().size() != 0) {
    // for (Ouvrage ouvrage : this.listOuvres) {
    // System.out.println(ouvrage.)
    // }
    // }
    // }
}
