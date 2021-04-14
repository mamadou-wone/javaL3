import java.util.ArrayList;

public class Manager {
    public static ArrayList<String> allMedicaments = new ArrayList<String>();

    public void getPatientInfo(Patient patient) {
        System.out.println("Voici l'ensemble des consultations faites par le patient " + patient.getNom());
        if (patient.getConsultations().size() != 0) {
            for (Consultation consultaion : patient.getConsultations()) {
                System.out.println("Consultation N° " + consultaion.getNoConsultation() + " du " + consultaion.getDate()
                        + " avec le médecin " + consultaion.getMedecin().getNom());
                System.out.println("***************************************************************");
            }
        } else {
            System.out.println("Ce Patient n'as pas d'Historique de Consultation");
        }
    }

    private void getMedicament(ArrayList<Medicament> medicaments) {
        for (Medicament medicament : medicaments) {
            System.out.println("-" + medicament.getLibelle());
        }
    }

    public void getPrescription(Patient patient) {
        for (Consultation consultation : patient.getConsultations()) {
            // System.out.println(consultation);
            for (Prescription prescription : Medecin.allPrescription) {
                if (prescription.getConsultation().getNoConsultation() == consultation.getNoConsultation()) {
                    System.out.println(
                            "*****************************************************************************" + "\n");
                    System.out.println("Voici la liste des médicaments prescrit au patient: " + patient.getNom() + " "
                            + "lors de la consultaion n° " + consultation.getNoConsultation() + " du "
                            + consultation.getDate());
                    getMedicament(prescription.getMedicaments());
                    System.out.println("NB: Consultation faite par le médecin: " + consultation.getMedecin().getNom()
                            + " Matricule : " + consultation.getMedecin().getMatricule());
                    System.out.println(
                            "*****************************************************************************" + "\n");
                }
                // else {
                // System.out.println("Aucune prescription faite à ce patient");
                // }
            }
        }
    }

    public void Statistique(Medicament medicament) {
        if (medicament.getMedecin().size() != 0) {
            System.out.println("Voici la liste des médecins qui ont prescrit le médicament " + medicament.getLibelle());
            for (Medecin medecin : medicament.getMedecin()) {
                System.out.println(medecin.getNom());
            }
        } else {
            System.out.println("Le médicament " + medicament.getLibelle() + " n'apparait dans aucune prescription !");
        }
    }
}
