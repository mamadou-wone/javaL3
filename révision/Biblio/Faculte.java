public class Faculte {
    private int id_faculte;
    private String name;

    public Faculte(int id_faculte, String name) {
        this.id_faculte = id_faculte;
        this.name = name;
    }

    public int getId_faculte() {
        return this.id_faculte;
    }

    public void setId_faculte(int id_faculte) {
        this.id_faculte = id_faculte;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
