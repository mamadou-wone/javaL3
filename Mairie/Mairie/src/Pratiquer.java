import java.time.LocalDate;
import java.util.ArrayList;

public class Pratiquer {
    private LocalDate date_inscription;
    private ArrayList<Membre> memberList = new ArrayList<>();
    private Activite activite;
    public static ArrayList<Pratiquer> info = new ArrayList<Pratiquer>();

    public Pratiquer(Activite activite) {
        this.activite = activite;
    }

    public ArrayList<Membre> getMemberList() {
        return memberList;
    }

    public LocalDate getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(LocalDate date_inscription) {
        this.date_inscription = date_inscription;
    }

    public void addMemberToActivite(LocalDate date, Membre list[]) {
        if (list.length != 0 && !info.contains(this)) {
            for (Membre membre : list) {
                this.getMemberList().add(membre);
            }
            this.setDate_inscription(date);
            info.add(this);
        } else {
            System.out.println("Ajout des membres impossibles");
        }
    }

}
