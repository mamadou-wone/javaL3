import java.util.ArrayList;

public class Ouvrage {
    private int id_ouvrage;
    private String title;
    private int num_intern;
    public static ArrayList<Ouvrage> ListOuvrages = new ArrayList<>();

    public Ouvrage(int id_ouvrage, String title, int num_intern) {
        this.id_ouvrage = id_ouvrage;
        this.title = title;
        this.num_intern = num_intern;
        ListOuvrages.add(this);
    }

    public int getId_ouvrage() {
        return this.id_ouvrage;
    }

    public void setId_ouvrage(int id_ouvrage) {
        this.id_ouvrage = id_ouvrage;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum_intern() {
        return this.num_intern;
    }

    public void setNum_intern(int num_intern) {
        this.num_intern = num_intern;
    }

    public void AfficheExemplaire(Ouvrage ouvrage) {
        for (Ouvrage ouvrages : ListOuvrages) {
            if (ouvrages.getTitle() == ouvrage.getTitle()) {
                System.out.println(ouvrages.getTitle());
            }
        }
    }

}