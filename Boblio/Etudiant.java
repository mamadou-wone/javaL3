public class Etudiant {
    private int student_id;
    private String student_name;
    private Faculte faculte;

    public Etudiant(int student_id, String student_name, Faculte faculte) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.faculte = faculte;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
    }
}
