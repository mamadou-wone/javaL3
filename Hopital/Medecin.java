import java.util.ArrayList;

public class Medecin {
    private String matricule;
    private String nom;
    public static ArrayList<String> allID = new ArrayList<String>();

    public Medecin(String matricule, String nom){
        try {
            if(!allID.contains(matricule)){
                allID.add(matricule);
                this.matricule = matricule;
                this.nom = nom;
            }else{
                System.out.println("Les identifiants des patients doivent être unique");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void makeConsultation(Prescription prescription, Consultation consultation,
     ArrayList<Medicament> medicament, Patient patient){
        prescription.setConsultation(consultation);
        prescription.setMedicaments(medicament);
    }
}
