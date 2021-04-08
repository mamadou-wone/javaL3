import java.util.ArrayList;
//   ___       __   ________  ________   _______      
//  |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
//  \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
//   \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
//    \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
//     \ \____________\ \_______\ \__\\ \__\ \_______\
//      \|____________|\|_______|\|__| \|__|\|_______|

public class Medecin {
    private String matricule;
    private String nom;
    public static ArrayList<String> allID = new ArrayList<String>();
    public static ArrayList<Prescription> allPrescription = new ArrayList<Prescription>();

    public Medecin(String matricule, String nom) {
        try {
            if (!allID.contains(matricule)) {
                allID.add(matricule);
                this.matricule = matricule;
                this.nom = nom;
            } else {
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

    public void makeConsultation(Consultation consultation, Patient patient) {
        patient.getConsultations().add(consultation);
    }

    public void makePrescription(Consultation consultation, Medicament medicaments[], int nbPrises) {
        Prescription prescription = new Prescription();
        prescription.setConsultation(consultation);
        prescription.setNbPrises(nbPrises);
        for (Medicament medicament : medicaments) {
            prescription.getMedicaments().add(medicament);
        }
        allPrescription.add(prescription);
    }
}
