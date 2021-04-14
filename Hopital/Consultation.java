import java.time.LocalDate;
import java.util.ArrayList;
//   ___       __   ________  ________   _______      
//  |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
//  \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
//   \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
//    \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
//     \ \____________\ \_______\ \__\\ \__\ \_______\
//      \|____________|\|_______|\|__| \|__|\|_______|

public class Consultation {
    private int noConsultation;
    private LocalDate date;
    private Medecin medecin;
    private Patient patient;
    public int count = 0;
    public int count2 = 0;
    public static ArrayList<Integer> allID = new ArrayList<Integer>();

    public Consultation(int noConsultation, LocalDate date) {

        try {
            if (!allID.contains(noConsultation)) {
                allID.add(noConsultation);
                this.noConsultation = noConsultation;
                this.date = date;
            } else {
                System.out.println("Les consulations doivent être unique");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int getNoConsultation() {
        return noConsultation;
    }

    public LocalDate getDate() {
        return date;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.count += 1;
        if (this.count == 1) {
            this.medecin = medecin;
        } else {
            System.out.println("Le médecin " + medecin.getNom() + " ne peut pas refaire la consultation N°"
                    + this.getNoConsultation());
        }

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.count2 += 1;
        if (this.count2 == 1) {
            this.patient = patient;
        } else {
            System.out.println("Le patient " + patient.getNom() + " ne peut pas refaire la consultation N°"
                    + this.getNoConsultation());
        }

    }

    public void getPrescription() {
        for (Prescription prescription : Medecin.allPrescription) {
            if (prescription.getConsultation().getNoConsultation() == this.getNoConsultation()) {
                System.out.println(prescription.getMedicaments());
            }
        }
    }
}
