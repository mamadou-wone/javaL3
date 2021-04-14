import java.time.LocalDate;
import java.util.ArrayList;

//   ___       __   ________  ________   _______      
//  |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
//  \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
//   \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
//    \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
//     \ \____________\ \_______\ \__\\ \__\ \_______\
//      \|____________|\|_______|\|__| \|__|\|_______|

public class Main {

    public static void main(String[] args) {

        Medicament medicament1 = new Medicament("XFO874", "Paracetamol");
        Medicament medicament2 = new Medicament("RFO874", "Acide acétylsalicylique");
        Medicament medicament3 = new Medicament("fFO874", "Morphine ");
        Medicament medicament4 = new Medicament("XRO874", "Cyclizine ");
        Medicament medicament5 = new Medicament("XGO874", "Butylscopolamine");
        Medicament medicament6 = new Medicament("ZFO874", "Sennosides ");
        Medicament medicament7 = new Medicament("YFO874", "Chloroquine ");
        Medicament medicament8 = new Medicament("PFO874", "Azathioprine ");
        // Medicament medicament9 = new Medicament("LFO874", "Cortisol");
        // Medicament medicament10 = new Medicament("AFO874", "Pénicillamine");
        // Medicament medicament11 = new Medicament("HFO874", "Diazépam ");
        // Medicament medicament12 = new Medicament("GFO874", "Praziquantel");

        Patient patient1 = new Patient(25486, "Moustapha DIOP");
        Patient patient2 = new Patient(68515, "Aminata GUEYE");
        Patient patient3 = new Patient(24552, "Seynabou THIAM");
        Patient patient4 = new Patient(54896, "Moctar DIOUF");
        Patient patient5 = new Patient(25896, "Fatou SARR");
        Patient patient6 = new Patient(84896, "Jean MENDY");
        Patient patient7 = new Patient(95489, "Claude DASYLVA");

        Consultation consultation1 = new Consultation(78569412, LocalDate.now());
        Consultation consultation2 = new Consultation(28569412, LocalDate.now());
        Consultation consultation3 = new Consultation(38569412, LocalDate.now());
        Consultation consultation4 = new Consultation(48569412, LocalDate.now());
        Consultation consultation5 = new Consultation(55569412, LocalDate.now());
        Consultation consultation6 = new Consultation(66569412, LocalDate.now());
        Consultation consultation7 = new Consultation(76569412, LocalDate.now());

        Medecin medecin1 = new Medecin("5493265", "Mamadou WONE");
        Medecin medecin2 = new Medecin("6493265", "Thioro THIAM");
        Medecin medecin3 = new Medecin("7493265", "Fatou Kine NDIAYE");
        Medecin medecin4 = new Medecin("8493265", "Mouhamed TOURE");

        consultation1.setMedecin(medecin1);
        // consultation1.setMedecin(medecin3);
        consultation1.setPatient(patient1);
        // consultation1.setPatient(patient2);
        // System.out.println(consultation1.count);
        // System.out.println(consultation1.getMedecin().getNom());
        // consultation2.setMedecin(medecin2);
        consultation2.setPatient(patient2);

        consultation3.setMedecin(medecin3);
        consultation3.setPatient(patient1);

        medecin1.makeConsultation(consultation1, patient1);
        medecin3.makeConsultation(consultation3, patient1);

        Medicament medoc[] = { medicament1, medicament2 };
        Medicament medoc2[] = { medicament7, medicament8 };
        Medicament medoc3[] = { medicament4, medicament6, medicament1 };

        medecin2.makeConsultation(consultation2, patient2);

        medecin1.makePrescription(consultation1, medoc, 2);
        medecin2.makePrescription(consultation2, medoc2, 3);
        medecin3.makePrescription(consultation3, medoc3, 3);

        // System.out.println(patient1.getConsultations().size());

        Manager manager = new Manager();
        // manager.Statistique(medicament3);
        // manager.getPatientInfo(patient2);
        // manager.getPrescription(patient1);
        // for (String medicament : manager.allMedicaments) {
        // System.out.println(medicament);
        // }

        // for (Prescription prescription : Medecin.allPrescription) {
        // System.out.println(prescription.getMedicaments());
        // }

    }
}