import java.util.ArrayList;

public class Manager {

    public void getMedicament(ArrayList<Medicament> medicaments) {
        for (Medicament medicament : medicaments) {
            System.out.println(medicament.getLibelle());
        }
    }

    public void getPrescription(Patient patient) {
        for (Consultation consultation : patient.getConsultations()) {
            System.out.println(consultation);
            for (Prescription prescription : Medecin.allPrescription) {
                if (prescription.getConsultation().getNoConsultation() == consultation.getNoConsultation()) {
                    getMedicament(prescription.getMedicaments());
                }
            }
        }
    }
}
