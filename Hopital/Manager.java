import java.util.ArrayList;

public class Manager {

    public void getMedicament(ArrayList<Medicament> medicaments) {
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
}
