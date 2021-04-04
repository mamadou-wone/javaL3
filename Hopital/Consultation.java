import java.time.LocalDate;
import java.util.ArrayList;

public class Consultation {
    private int noConsultation;
    private LocalDate date;
    private Medecin medecin;
    public static ArrayList<Integer> allID = new ArrayList<Integer>();
    
    
    public Consultation(int noConsultation, LocalDate date){

        try {
            if(!allID.contains(noConsultation)){
                allID.add(noConsultation);
                this.noConsultation = noConsultation;
                this.date = date;
            }else{
                System.out.println("Les identifiants des patients doivent être unique");
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
        this.medecin = medecin;
    }
}
