import java.util.ArrayList;
//   ___       __   ________  ________   _______      
//  |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
//  \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
//   \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
//    \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
//     \ \____________\ \_______\ \__\\ \__\ \_______\
//      \|____________|\|_______|\|__| \|__|\|_______|

public class Patient {
    private int noPatient;
    private String nom;
    private ArrayList<Consultation> consultations = new ArrayList<Consultation>();
    public static ArrayList<Integer> allID = new ArrayList<Integer>();

    public Patient(int noPatient, String nom) {

        try {
            if (!allID.contains(noPatient)) {
                allID.add(noPatient);
                this.noPatient = noPatient;
                this.nom = nom;
            } else {
                System.out.println("Les identifiants des patients doivent être unique");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNoPatient() {
        return noPatient;
    }

    public void setNoPatient(int noPatient) {
        this.noPatient = noPatient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(ArrayList<Consultation> consultations) {
        this.consultations = consultations;
    }
}
