import java.util.ArrayList;

public class Etudiant {
    private int id_student;
    private String name;
    private Faculte faculte;
    public static ArrayList<Etudiant> listStudent = new ArrayList<>();
    private ArrayList<Ouvrage> ouvrageEmprumter = new ArrayList<>();

    public Etudiant(int id_student, String name, Faculte faculte) {
        this.id_student = id_student;
        this.name = name;
        this.faculte = faculte;
        listStudent.add(this);
    }

    public ArrayList<Ouvrage> getOuvrageEmprumter() {
        return ouvrageEmprumter;
    }

    public void setOuvrageEmprumter(ArrayList<Ouvrage> ouvrageEmprumter) {
        this.ouvrageEmprumter = ouvrageEmprumter;
    }

    public int getId_student() {
        return this.id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void afficheEtudiant(Faculte faculte) {
        for (Etudiant etudiant : listStudent) {
            if (etudiant.faculte == faculte) {
                System.out.println(etudiant.getName());
            }
        }
    }

    public void AfficheOuvrage() {
        for (Ouvrage ouvrage : this.getOuvrageEmprumter()) {
            System.out.println(ouvrage.getTitle());
        }
    }

}
